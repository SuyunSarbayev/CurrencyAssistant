package android.test.currencyassistant.di.modules

import android.test.currencyassistant.BuildConfig
import android.test.currencyassistant.data.api.ApiConstants
import android.test.currencyassistant.data.repositories.CurrencyDataRepository
import android.test.currencyassistant.domain.repository.CurrencyDomainRepository
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkModule {

    constructor()

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

    @Provides
    fun providesCurrencyDomainRepository(currencyDataRepository: CurrencyDataRepository) : CurrencyDomainRepository{
        return currencyDataRepository
    }

    //When application in debug mode, we can track request body, otherwise, we consider that we got
    //production build
    @Provides
    @Singleton
    fun providesOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(30000, TimeUnit.MICROSECONDS)
            .readTimeout(30000, TimeUnit.MILLISECONDS)
            .writeTimeout(30000, TimeUnit.MILLISECONDS)
            .addInterceptor(if(BuildConfig.DEBUG)
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            else
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.NONE))
            .build()
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