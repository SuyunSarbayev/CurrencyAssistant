package android.test.currencyassistant.di.modules

import android.app.Application
import android.content.Context
import android.os.Build
import android.test.currencyassistant.BuildConfig
import android.test.currencyassistant.data.api.ApiConstants
import android.test.currencyassistant.data.repositories.CurrencyDataRepository
import android.test.currencyassistant.data.utils.UnsafeOkHttpClient
import android.test.currencyassistant.domain.repository.CurrencyDomainRepository
import android.util.Log
import androidx.annotation.Nullable
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.Cache
import okhttp3.ConnectionSpec
import okhttp3.OkHttpClient
import okhttp3.TlsVersion
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton
import javax.net.ssl.SSLContext

@Module
class NetworkModule {

    var context: Context

    constructor(context: Context){
        this.context = context
    }

    @Provides
    fun providesCurrencyDomainRepository(currencyDataRepository: CurrencyDataRepository) : CurrencyDomainRepository{
        return currencyDataRepository
    }

    @Provides
    @Singleton
    public fun providesOkHttpCache(): Cache {
        val cacheSize = 50 * 1024 * 1024
        return Cache(context.cacheDir, cacheSize.toLong())
    }

    @Provides
    @Singleton
    public fun providesGson(): Gson {
        return GsonBuilder()
            .serializeNulls()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES)
            .setDateFormat("yyyy-MM-dd")
            .create();
    }

    @Provides
    @Singleton
    fun providesRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit{
        return Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
    }

    //When application in debug mode, we can track request body, otherwise, we consider that we got
    //production build
    @Provides
    @Singleton
    fun providesOkHttpClient(cache: Cache): OkHttpClient {
        return UnsafeOkHttpClient.unsafeOkHttpClient
    }

    @Provides
    @Named("executor_thread")
    fun providesExecutorThread(): Scheduler {
        return Schedulers.io()
    }

    @Provides
    @Named("ui_thread")
    fun providesUiThread(): Scheduler {
        return AndroidSchedulers.mainThread()
    }
}