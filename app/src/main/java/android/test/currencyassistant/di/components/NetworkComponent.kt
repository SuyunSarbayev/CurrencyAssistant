package android.test.currencyassistant.di.components

import android.test.currencyassistant.di.modules.NetworkModule
import android.test.currencyassistant.presentation.fragment.CurrencyFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(NetworkModule::class))
interface NetworkComponent {
    fun inject(currencyFragment: CurrencyFragment)
}