package android.test.currencyassistant.data.api

import android.test.currencyassistant.data.models.CurrencyEntity
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface Api {

    @GET(ApiConstants.END_POINT_CURRENCIES_LATEST)
    fun currenciesList(@QueryMap params: HashMap<String, Any>) : Single<Response<CurrencyEntity>>
}