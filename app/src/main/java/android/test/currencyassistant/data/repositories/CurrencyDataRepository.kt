package android.test.currencyassistant.data.repositories

import android.test.currencyassistant.data.NetworkException
import android.test.currencyassistant.data.api.ApiImplementation
import android.test.currencyassistant.data.models.CurrencyEntity
import android.test.currencyassistant.domain.models.Currency
import android.test.currencyassistant.domain.repository.CurrencyDomainRepository
import io.reactivex.Single
import retrofit2.Response
import javax.inject.Inject

class CurrencyDataRepository : CurrencyDomainRepository {

    var apiImplementation: ApiImplementation
    var currencyMapper: CurrencyMapper

    @Inject
    constructor(apiImplementation: ApiImplementation,
                currencyMapper: CurrencyMapper){
        this.apiImplementation = apiImplementation
        this.currencyMapper = currencyMapper
    }

    override fun currencyList(params: HashMap<String, Any>): Single<Currency> {
        return apiImplementation.currenciesList(params)
            .map { response: Response<CurrencyEntity> ->
                when(response.isSuccessful){
                    true -> currencyMapper.transformCurrency(response.body()!!)
                    false -> throw NetworkException(response)
                }
            }
    }
}