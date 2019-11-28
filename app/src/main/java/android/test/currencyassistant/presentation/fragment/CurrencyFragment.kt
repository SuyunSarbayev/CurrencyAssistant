package android.test.currencyassistant.presentation.fragment

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.test.currencyassistant.R
import android.test.currencyassistant.di.components.DaggerNetworkComponent
import android.test.currencyassistant.di.modules.NetworkModule
import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.presentation.adapters.currency.CurrencyAdapter
import android.test.currencyassistant.presentation.adapters.currency.CurrencyViewHolder
import android.test.currencyassistant.presentation.base.BaseFragment
import android.test.currencyassistant.presentation.contract.CurrencyFragmentContract
import android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface
import android.test.currencyassistant.presentation.interfaces.CurrencyValueUpdatedCallback
import android.test.currencyassistant.presentation.presenter.CurrencyFragmentPresenter
import android.test.currencyassistant.presentation.service.CurrencyService
import android.test.currencyassistant.presentation.utils.Constants
import android.test.currencyassistant.presentation.utils.UtilCallback
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.fragment_currency.*
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList


class CurrencyFragment : BaseFragment(), CurrencyFragmentContract.View, CurrencyClickInterface, CurrencyValueUpdatedCallback {

    @Inject lateinit var presenter: CurrencyFragmentPresenter

    lateinit var layoutManager: LinearLayoutManager
    lateinit var currencyAdapter: CurrencyAdapter
    var currencyList: ArrayList<Currency.CurrencyItem> = ArrayList()

    var currencyUpdateReceiver: CurrencyUpdateReceiver = CurrencyUpdateReceiver()

    var currentCurrency = Currency().CurrencyItem().apply {
        currencyName = "EUR"
        currencyPrice = 100.0
        currencyIcon = R.drawable.ic_currency_flag_eu
    }

    override fun getFragmentTag(): String? {
        return this.javaClass.name
    }

    override fun onLayoutId(): Int {
        return R.layout.fragment_currency
    }

    override fun customizeActionBar() {
        mainActivity().setSupportActionBar(activity?.toolbar_activity_base);
        mainActivity().supportActionBar!!.setDisplayShowHomeEnabled(true)
        activity?.toolbar_activity_base?.title = Constants.PageConstants.rates_title
        activity?.toolbar_activity_base?.setTitleTextColor(ContextCompat.getColor(context!!, R.color.color_black))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun context() : Context {
        return context!!
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeDependencies()
        initializeViews()
        initializeViewsData()
        initializeAdapter()
        initializeLayoutManager()
        initializeRecyclerView()
        initializeListeners()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.dispose()
        unregisterCurrencyReceiver()
    }

    companion object {
        @JvmStatic
        fun newInstance() = CurrencyFragment().apply {}
    }

    override fun startCurrencyUpdateService() {
        context?.startService(Intent(context, CurrencyService::class.java))
    }

    override fun stopCurrencyUpdateService() {
        context?.stopService(Intent(context, CurrencyService::class.java))
    }

    override fun registerCurrencyReceiver() {
        context?.registerReceiver(currencyUpdateReceiver,
            IntentFilter(Constants.PageConstants.update_currency_action))
    }

    override fun unregisterCurrencyReceiver() {
        context?.unregisterReceiver(currencyUpdateReceiver)
    }

    override fun processCurrency(currency: Currency) {
        dismissLoader()

        currency.currencyList.add(0, currentCurrency)

        initiateUpdateCurrencyList(this.currencyList, currency.currencyList)

        this.currencyList.clear()
        this.currencyList.addAll(currency.currencyList)
    }

    override fun initializeRecyclerView() {
        //recyclerview_fragment_currency.itemAnimator = null
        recyclerview_fragment_currency.setHasFixedSize(true);
        recyclerview_fragment_currency.setItemViewCacheSize(20);
        recyclerview_fragment_currency.setDrawingCacheEnabled(true);
        recyclerview_fragment_currency.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

    }
    override fun initializeAdapter() {
        currencyAdapter = CurrencyAdapter(context, currencyList, this, this)
        recyclerview_fragment_currency.adapter = currencyAdapter
    }

    override fun initializeLayoutManager() {
        layoutManager = LinearLayoutManager(context)
        recyclerview_fragment_currency.layoutManager = layoutManager
    }

    override fun initializeViews() {
        presenter.attach(this)
    }

    override fun initializeViewsData() {}

    override fun initializeListeners() {}

    override fun initializeCurrentCurrency(position: Int) {
        currentCurrency = currencyList.get(position)
    }

    override fun initiateUpdateCurrencyList(oldCurrencyList: ArrayList<Currency.CurrencyItem>,
                                            newCurrencyList: ArrayList<Currency.CurrencyItem>) {
        DiffUtil.calculateDiff(
            UtilCallback(oldCurrencyList, newCurrencyList))
                    .apply {
                        dispatchUpdatesTo(currencyAdapter)
                    }
    }

    override fun initiateFocusFirstElement() {
        layoutManager.scrollToPosition(0)
        (recyclerview_fragment_currency.findViewHolderForAdapterPosition(0) as CurrencyViewHolder).initiateFocus()
    }

    override fun initiateMoveElementToTop(position: Int) {
        Collections.swap(currencyList, position, 0)
    }

    override fun displayLoader() {
        progress_fragment_currency_loader.visibility = View.VISIBLE
    }

    override fun dismissLoader() {
        progress_fragment_currency_loader.visibility = View.GONE
    }

    override fun displayEmptyPage() {
        recyclerview_fragment_currency.visibility = View.GONE
        linearlayout_fragment_currency_empty_layout.visibility = View.VISIBLE
    }

    override fun dismissEmptyPage() {
        linearlayout_fragment_currency_empty_layout.visibility = View.GONE
        recyclerview_fragment_currency.visibility = View.VISIBLE
    }

    override fun processError(withText: String?){
        Toast.makeText(context, withText, Toast.LENGTH_SHORT).show()
    }

    override fun initializeDependencies() {
        DaggerNetworkComponent
            .builder()
            .networkModule(NetworkModule(context!!))
            .build().inject(this)
    }

    override fun currencyList() {
        presenter.currencyList(currentCurrency)
    }

    override fun onStart() {
        super.onStart()
        registerCurrencyReceiver()
    }

    override fun onStop() {
        super.onStop()
        stopCurrencyUpdateService()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        stopCurrencyUpdateService()
    }

    override fun onResume() {
        super.onResume()
        displayLoader()
        startCurrencyUpdateService()
    }

    override fun onViewClicked(position: Int) {
        if(position != -1){
            initializeCurrentCurrency(position)
            val oldList: ArrayList<Currency.CurrencyItem> = ArrayList()
            oldList.addAll(currencyList)
            initiateMoveElementToTop(position)
            initiateUpdateCurrencyList(oldList,currencyList)
            initiateFocusFirstElement()
        }
    }

    override fun onCurrencyValueUpdated(position: Int, value: String) {
        when(value.length > 0 && value.toDouble() > 0){
            true -> currentCurrency.currencyPrice = value.toDouble()
            false -> currentCurrency.currencyPrice = 1.0
        }
    }

    inner class CurrencyUpdateReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            currencyList()
        }
    }
}