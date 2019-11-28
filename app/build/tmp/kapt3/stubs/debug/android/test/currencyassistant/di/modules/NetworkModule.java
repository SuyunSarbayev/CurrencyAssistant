package android.test.currencyassistant.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0013H\u0007J\b\u0010\u0019\u001a\u00020\rH\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u001a"}, d2 = {"Landroid/test/currencyassistant/di/modules/NetworkModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "providesCurrencyDomainRepository", "Landroid/test/currencyassistant/domain/repository/CurrencyDomainRepository;", "currencyDataRepository", "Landroid/test/currencyassistant/data/repositories/CurrencyDataRepository;", "providesExecutorThread", "Lio/reactivex/Scheduler;", "providesGson", "Lcom/google/gson/Gson;", "providesOkHttpCache", "Lokhttp3/Cache;", "providesOkHttpClient", "Lokhttp3/OkHttpClient;", "cache", "providesRetrofit", "Lretrofit2/Retrofit;", "gson", "okHttpClient", "providesUiThread", "app_debug"})
@dagger.Module()
public class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.test.currencyassistant.domain.repository.CurrencyDomainRepository providesCurrencyDomainRepository(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.data.repositories.CurrencyDataRepository currencyDataRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Cache providesOkHttpCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson providesGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit providesRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient providesOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "executor_thread")
    @dagger.Provides()
    public final io.reactivex.Scheduler providesExecutorThread() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "ui_thread")
    @dagger.Provides()
    public final io.reactivex.Scheduler providesUiThread() {
        return null;
    }
    
    public NetworkModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}