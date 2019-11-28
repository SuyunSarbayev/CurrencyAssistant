package android.test.currencyassistant.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001`\tH\'\u00a8\u0006\n"}, d2 = {"Landroid/test/currencyassistant/data/api/Api;", "", "currenciesList", "Lio/reactivex/Single;", "Lretrofit2/Response;", "Landroid/test/currencyassistant/data/models/CurrencyEntity;", "params", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "latest")
    public abstract io.reactivex.Single<retrofit2.Response<android.test.currencyassistant.data.models.CurrencyEntity>> currenciesList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.HashMap<java.lang.String, java.lang.Object> params);
}