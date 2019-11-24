package android.test.currencyassistant.data.api

import android.test.currencyassistant.BuildConfig
import android.test.currencyassistant.data.models.CurrencyEntity
import android.test.currencyassistant.data.repositories.CurrencyDataRepository
import android.test.currencyassistant.domain.repository.CurrencyDomainRepository
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Provides
import io.reactivex.Single
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

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