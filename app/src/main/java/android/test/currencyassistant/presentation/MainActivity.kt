package android.test.currencyassistant.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.test.currencyassistant.R
import android.test.currencyassistant.di.components.DaggerNetworkComponent
import android.test.currencyassistant.di.components.NetworkComponent
import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.domain.usecases.CurrencyListUseCases
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    var networkComponent: NetworkComponent? = null

    @Inject
    lateinit var useCase: CurrencyListUseCases

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        networkComponent = DaggerNetworkComponent.builder().build()
        networkComponent?.inject(this)

        useCase.initializeParams(HashMap<String, Any>().apply {
            put("base", "EUR")
        })

        useCase.execute(Observer())
    }

    inner class Observer : DisposableSingleObserver<Currency>(){
        override fun onSuccess(t: Currency) {
        }

        override fun onError(e: Throwable) {
        }

    }
}
