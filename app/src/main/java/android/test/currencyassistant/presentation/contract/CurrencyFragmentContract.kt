package android.test.currencyassistant.presentation.contract

import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.presentation.base.BasePresenter
import android.test.currencyassistant.presentation.base.BaseView

interface CurrencyFragmentContract {

    interface View : BaseView{
        fun processCurrency(currency: Currency)

        fun initializeAdapter()

        fun initializeLayoutManager()
    }

    interface Presenter : BasePresenter<View>{
        fun currencyList(currentCurrency: String)
    }

}