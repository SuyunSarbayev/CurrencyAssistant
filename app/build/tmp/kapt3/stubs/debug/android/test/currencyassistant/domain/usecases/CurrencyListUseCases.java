package android.test.currencyassistant.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016J*\u0010\u0018\u001a\u00020\u00192\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR6\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2 = {"Landroid/test/currencyassistant/domain/usecases/CurrencyListUseCases;", "Landroid/test/currencyassistant/domain/BaseUseCase;", "Landroid/test/currencyassistant/domain/models/Currency;", "executorThread", "Lio/reactivex/Scheduler;", "uiThread", "currencyDomainRepository", "Landroid/test/currencyassistant/domain/repository/CurrencyDomainRepository;", "(Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Landroid/test/currencyassistant/domain/repository/CurrencyDomainRepository;)V", "getCurrencyDomainRepository", "()Landroid/test/currencyassistant/domain/repository/CurrencyDomainRepository;", "setCurrencyDomainRepository", "(Landroid/test/currencyassistant/domain/repository/CurrencyDomainRepository;)V", "params", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "createObservable", "Lio/reactivex/Single;", "initializeParams", "", "app_debug"})
public final class CurrencyListUseCases extends android.test.currencyassistant.domain.BaseUseCase<android.test.currencyassistant.domain.models.Currency> {
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.domain.repository.CurrencyDomainRepository currencyDomainRepository;
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.String, java.lang.Object> params;
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.domain.repository.CurrencyDomainRepository getCurrencyDomainRepository() {
        return null;
    }
    
    public final void setCurrencyDomainRepository(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.domain.repository.CurrencyDomainRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.Object> getParams() {
        return null;
    }
    
    public final void setParams(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> p0) {
    }
    
    public final void initializeParams(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> params) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<android.test.currencyassistant.domain.models.Currency> createObservable() {
        return null;
    }
    
    @javax.inject.Inject()
    public CurrencyListUseCases(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "executor_thread")
    io.reactivex.Scheduler executorThread, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "ui_thread")
    io.reactivex.Scheduler uiThread, @org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.domain.repository.CurrencyDomainRepository currencyDomainRepository) {
        super(null, null);
    }
}