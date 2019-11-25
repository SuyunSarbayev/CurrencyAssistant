package android.test.currencyassistant.presentation.fragment

import android.content.Context
import android.os.Bundle
import android.test.currencyassistant.R
import android.test.currencyassistant.di.components.DaggerNetworkComponent
import android.test.currencyassistant.di.modules.NetworkModule
import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.presentation.adapters.currency.CurrencyAdapter
import android.test.currencyassistant.presentation.base.BaseFragment
import android.test.currencyassistant.presentation.contract.CurrencyFragmentContract
import android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface
import android.test.currencyassistant.presentation.interfaces.TimerCallbackInterface
import android.test.currencyassistant.presentation.presenter.CurrencyFragmentPresenter
import android.test.currencyassistant.presentation.utils.TimerHelper
import android.test.currencyassistant.presentation.utils.UtilCallback
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.fragment_currency.*
import javax.inject.Inject


class CurrencyFragment : BaseFragment(), CurrencyFragmentContract.View, TimerCallbackInterface, CurrencyClickInterface {

    @Inject lateinit var presenter: CurrencyFragmentPresenter

    lateinit var layoutManager: LinearLayoutManager
    lateinit var currencyAdapter: CurrencyAdapter
    var currencyList: ArrayList<Currency.CurrencyItem> = ArrayList()

    var timer: TimerHelper? = null

    var currentCurrency = "EUR"

    override fun getFragmentTag(): String? {
        return this.javaClass.name
    }

    override fun onLayoutId(): Int {
        return R.layout.fragment_currency
    }

    override fun customizeActionBar() {
        mainActivity().setSupportActionBar(activity?.toolbar_activity_base);
        mainActivity().supportActionBar!!.setDisplayShowHomeEnabled(true)
        activity?.toolbar_activity_base?.title = "Rates"
        activity?.toolbar_activity_base?.setTitleTextColor(resources.getColor(R.color.color_black))
    }

    override fun initializeTimer() {
        timer = TimerHelper(1000, this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
        initializeListeners()
        initializeTimer()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    companion object {
        @JvmStatic
        fun newInstance() = CurrencyFragment().apply {}
    }

    override fun processCurrency(currency: Currency) {
        val diffResult = DiffUtil.calculateDiff(UtilCallback(this.currencyList, currency.currencyList))
        diffResult.dispatchUpdatesTo(currencyAdapter)

        this.currencyList.clear()
        this.currencyList.addAll(currency.currencyList)
    }

    override fun initializeAdapter() {
        currencyAdapter = CurrencyAdapter(context, currencyList, this)
        recyclerview_fragment_currency.adapter = currencyAdapter
    }

    override fun initializeLayoutManager() {
        layoutManager = LinearLayoutManager(context)
        recyclerview_fragment_currency.layoutManager = layoutManager
    }

    override fun initializeViews() {
        presenter.attach(this)
    }

    override fun initializeViewsData() {
        recyclerview_fragment_currency.setHasFixedSize(true);
        recyclerview_fragment_currency.setItemViewCacheSize(20);
        recyclerview_fragment_currency.setDrawingCacheEnabled(true);
        recyclerview_fragment_currency.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
    }

    override fun initializeListeners() {
    }

    override fun displayLoader() {
    }

    override fun dismissLoader() {
    }

    override fun processError(withText: String) {
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

    override fun onTimerTicked() {
        currencyList()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
        timer?.pause()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        timer?.cancel()
    }
    override fun onResume() {
        super.onResume()
        timer?.initializeTimer()
    }

    override fun onViewClicked(position: Int) {
        currentCurrency = currencyList.get(position).currencyName!!
    }
}