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
import android.test.currencyassistant.presentation.presenter.CurrencyFragmentPresenter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_base.*
import kotlinx.android.synthetic.main.fragment_currency.*
import javax.inject.Inject

class CurrencyFragment : BaseFragment(), CurrencyFragmentContract.View {

    @Inject lateinit var presenter: CurrencyFragmentPresenter

    lateinit var layoutManager: LinearLayoutManager
    lateinit var currencyAdapter: CurrencyAdapter
    var currencyList: ArrayList<Currency.CurrencyItem> = ArrayList()

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
        currencyList()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onResume() {
        super.onResume()

        customizeActionBar()
    }

    companion object {
        @JvmStatic
        fun newInstance() = CurrencyFragment().apply {}
    }

    override fun processCurrency(currency: Currency) {
        this.currencyList.clear()
        this.currencyList.addAll(currency.currencyList)
        currencyAdapter.notifyDataSetChanged()
    }

    override fun initializeAdapter() {
        currencyAdapter = CurrencyAdapter(context, currencyList)
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
}