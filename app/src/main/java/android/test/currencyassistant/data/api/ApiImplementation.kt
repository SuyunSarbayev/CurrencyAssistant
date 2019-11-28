package android.test.currencyassistant.data.api

import android.test.currencyassistant.data.models.CurrencyEntity
import io.reactivex.Single
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class ApiImplementation : Api {

    var api: Api

    @Inject
    constructor(retrofit: Retrofit){
        api = retrofit.create(Api::class.java)
    }

    override fun currenciesList(params: HashMap<String, Any>): Single<Response<CurrencyEntity>> {
        return api.currenciesList(params)
    }
}