package android.test.currencyassistant.domain.repository

import android.test.currencyassistant.domain.models.Currency
import io.reactivex.Single

interface CurrencyDomainRepository {
    fun currencyList(params: HashMap<String, Any>) : Single<Currency>
}