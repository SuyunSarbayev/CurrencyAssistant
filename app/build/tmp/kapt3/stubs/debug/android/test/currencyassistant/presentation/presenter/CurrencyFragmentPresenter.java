package android.test.currencyassistant.presentation.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0017\u001a\u00020\u00162\n\u0010\u0018\u001a\u00060\u0019R\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Landroid/test/currencyassistant/presentation/presenter/CurrencyFragmentPresenter;", "Landroid/test/currencyassistant/presentation/contract/CurrencyFragmentContract$Presenter;", "currencyListUseCases", "Landroid/test/currencyassistant/domain/usecases/CurrencyListUseCases;", "errorHelper", "Landroid/test/currencyassistant/presentation/utils/ErrorHelper;", "(Landroid/test/currencyassistant/domain/usecases/CurrencyListUseCases;Landroid/test/currencyassistant/presentation/utils/ErrorHelper;)V", "getCurrencyListUseCases", "()Landroid/test/currencyassistant/domain/usecases/CurrencyListUseCases;", "setCurrencyListUseCases", "(Landroid/test/currencyassistant/domain/usecases/CurrencyListUseCases;)V", "getErrorHelper", "()Landroid/test/currencyassistant/presentation/utils/ErrorHelper;", "setErrorHelper", "(Landroid/test/currencyassistant/presentation/utils/ErrorHelper;)V", "view", "Landroid/test/currencyassistant/presentation/contract/CurrencyFragmentContract$View;", "getView", "()Landroid/test/currencyassistant/presentation/contract/CurrencyFragmentContract$View;", "setView", "(Landroid/test/currencyassistant/presentation/contract/CurrencyFragmentContract$View;)V", "attach", "", "currencyList", "currentCurrency", "Landroid/test/currencyassistant/domain/models/Currency$CurrencyItem;", "Landroid/test/currencyassistant/domain/models/Currency;", "dispose", "CurrencyListObserver", "app_debug"})
public final class CurrencyFragmentPresenter implements android.test.currencyassistant.presentation.contract.CurrencyFragmentContract.Presenter {
    @org.jetbrains.annotations.NotNull()
    public android.test.currencyassistant.presentation.contract.CurrencyFragmentContract.View view;
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.domain.usecases.CurrencyListUseCases currencyListUseCases;
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.presentation.utils.ErrorHelper errorHelper;
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.presentation.contract.CurrencyFragmentContract.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.contract.CurrencyFragmentContract.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.domain.usecases.CurrencyListUseCases getCurrencyListUseCases() {
        return null;
    }
    
    public final void setCurrencyListUseCases(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.domain.usecases.CurrencyListUseCases p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.presentation.utils.ErrorHelper getErrorHelper() {
        return null;
    }
    
    public final void setErrorHelper(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.utils.ErrorHelper p0) {
    }
    
    @java.lang.Override()
    public void currencyList(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.domain.models.Currency.CurrencyItem currentCurrency) {
    }
    
    @java.lang.Override()
    public void attach(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.contract.CurrencyFragmentContract.View view) {
    }
    
    @java.lang.Override()
    public void dispose() {
    }
    
    @javax.inject.Inject()
    public CurrencyFragmentPresenter(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.domain.usecases.CurrencyListUseCases currencyListUseCases, @org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.utils.ErrorHelper errorHelper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a8\u0006\n"}, d2 = {"Landroid/test/currencyassistant/presentation/presenter/CurrencyFragmentPresenter$CurrencyListObserver;", "Lio/reactivex/observers/DisposableSingleObserver;", "Landroid/test/currencyassistant/domain/models/Currency;", "(Landroid/test/currencyassistant/presentation/presenter/CurrencyFragmentPresenter;)V", "onError", "", "e", "", "onSuccess", "result", "app_debug"})
    public final class CurrencyListObserver extends io.reactivex.observers.DisposableSingleObserver<android.test.currencyassistant.domain.models.Currency> {
        
        @java.lang.Override()
        public void onSuccess(@org.jetbrains.annotations.NotNull()
        android.test.currencyassistant.domain.models.Currency result) {
        }
        
        @java.lang.Override()
        public void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
        
        public CurrencyListObserver() {
            super();
        }
    }
}