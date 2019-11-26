package android.test.currencyassistant.presentation.contract

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

        fun initializeTimer()

        fun initializeCurrentCurrency(position: Int)

        fun initiateMoveElementToTop(position: Int)

        fun initiateUpdateCurrencyList(oldCurrencyList: ArrayList<Currency.CurrencyItem>, newCurrencyList: ArrayList<Currency.CurrencyItem>)

        fun initiateFocusFirstElement()

    }

    interface Presenter : BasePresenter<View>{
        fun currencyList(currentCurrency: Currency.CurrencyItem)
    }

}