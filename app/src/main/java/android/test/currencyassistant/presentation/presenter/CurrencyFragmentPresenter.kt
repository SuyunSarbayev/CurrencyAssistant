package android.test.currencyassistant.presentation.presenter

import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.domain.usecases.CurrencyListUseCases
import android.test.currencyassistant.presentation.contract.CurrencyFragmentContract
import android.test.currencyassistant.presentation.utils.Constants
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class CurrencyFragmentPresenter : CurrencyFragmentContract.Presenter {

    lateinit var view: CurrencyFragmentContract.View
    var currencyListUseCases: CurrencyListUseCases

    @Inject
    constructor(currencyListUseCases: CurrencyListUseCases){
        this.currencyListUseCases = currencyListUseCases
    }

    override fun currencyList(currentCurrency: String) {
        currencyListUseCases.initializeParams(HashMap<String, Any>().apply{
            put(Constants.DataConstants.currency_key, currentCurrency)
        })
        currencyListUseCases.execute(CurrencyListObserver())
    }

    override fun attach(view: CurrencyFragmentContract.View) {
        this.view = view
    }

    override fun dispose() {
        currencyListUseCases.dispose()
    }

    inner class CurrencyListObserver : DisposableSingleObserver<Currency>(){
        override fun onSuccess(result: Currency) {
            view.dismissLoader()
            view.processCurrency(result)
        }

        override fun onError(e: Throwable) {
            view.dismissLoader()
            view.processError(e.localizedMessage)
        }

    }
}