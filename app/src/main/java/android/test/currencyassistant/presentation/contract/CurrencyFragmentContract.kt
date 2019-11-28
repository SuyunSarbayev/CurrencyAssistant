package android.test.currencyassistant.presentation.contract

import android.content.Context
import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.presentation.base.BasePresenter
import android.test.currencyassistant.presentation.base.BaseView

interface CurrencyFragmentContract {

    interface View : BaseView{
        fun processCurrency(currency: Currency)

        fun initializeAdapter()

        fun initializeLayoutManager()

        fun currencyList()

        fun initializeDependencies()

        fun initializeCurrentCurrency(position: Int)

        fun initiateMoveElementToTop(position: Int)

        fun initiateUpdateCurrencyList(oldCurrencyList: ArrayList<Currency.CurrencyItem>, newCurrencyList: ArrayList<Currency.CurrencyItem>)

        fun initiateFocusFirstElement()

        fun displayEmptyPage()

        fun dismissEmptyPage()

        fun startCurrencyUpdateService()

        fun stopCurrencyUpdateService()

        fun registerCurrencyReceiver()

        fun unregisterCurrencyReceiver()

        fun initializeRecyclerView()

        fun context() : Context
    }

    interface Presenter : BasePresenter<View>{
        fun currencyList(currentCurrency: Currency.CurrencyItem)
    }

}