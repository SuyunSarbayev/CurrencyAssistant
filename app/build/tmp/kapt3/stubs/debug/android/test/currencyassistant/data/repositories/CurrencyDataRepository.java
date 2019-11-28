package android.test.currencyassistant.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015`\u0016H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Landroid/test/currencyassistant/data/repositories/CurrencyDataRepository;", "Landroid/test/currencyassistant/domain/repository/CurrencyDomainRepository;", "apiImplementation", "Landroid/test/currencyassistant/data/api/ApiImplementation;", "currencyMapper", "Landroid/test/currencyassistant/data/repositories/CurrencyMapper;", "(Landroid/test/currencyassistant/data/api/ApiImplementation;Landroid/test/currencyassistant/data/repositories/CurrencyMapper;)V", "getApiImplementation", "()Landroid/test/currencyassistant/data/api/ApiImplementation;", "setApiImplementation", "(Landroid/test/currencyassistant/data/api/ApiImplementation;)V", "getCurrencyMapper", "()Landroid/test/currencyassistant/data/repositories/CurrencyMapper;", "setCurrencyMapper", "(Landroid/test/currencyassistant/data/repositories/CurrencyMapper;)V", "currencyList", "Lio/reactivex/Single;", "Landroid/test/currencyassistant/domain/models/Currency;", "params", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "app_debug"})
public final class CurrencyDataRepository implements android.test.currencyassistant.domain.repository.CurrencyDomainRepository {
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.data.api.ApiImplementation apiImplementation;
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.data.repositories.CurrencyMapper currencyMapper;
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.data.api.ApiImplementation getApiImplementation() {
        return null;
    }
    
    public final void setApiImplementation(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.data.api.ApiImplementation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.data.repositories.CurrencyMapper getCurrencyMapper() {
        return null;
    }
    
    public final void setCurrencyMapper(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.data.repositories.CurrencyMapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<android.test.currencyassistant.domain.models.Currency> currencyList(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> params) {
        return null;
    }
    
    @javax.inject.Inject()
    public CurrencyDataRepository(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.data.api.ApiImplementation apiImplementation, @org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.data.repositories.CurrencyMapper currencyMapper) {
        super();
    }
}