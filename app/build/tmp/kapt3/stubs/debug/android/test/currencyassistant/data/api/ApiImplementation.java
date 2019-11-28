package android.test.currencyassistant.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J8\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\"\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011`\u0012H\u0016R\u001a\u0010\u0005\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Landroid/test/currencyassistant/data/api/ApiImplementation;", "Landroid/test/currencyassistant/data/api/Api;", "retrofit", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)V", "api", "getApi", "()Landroid/test/currencyassistant/data/api/Api;", "setApi", "(Landroid/test/currencyassistant/data/api/Api;)V", "currenciesList", "Lio/reactivex/Single;", "Lretrofit2/Response;", "Landroid/test/currencyassistant/data/models/CurrencyEntity;", "params", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "app_debug"})
public final class ApiImplementation implements android.test.currencyassistant.data.api.Api {
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.data.api.Api api;
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.data.api.Api getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.data.api.Api p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<retrofit2.Response<android.test.currencyassistant.data.models.CurrencyEntity>> currenciesList(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> params) {
        return null;
    }
    
    @javax.inject.Inject()
    public ApiImplementation(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        super();
    }
}