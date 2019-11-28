package android.test.currencyassistant.presentation.contract;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Landroid/test/currencyassistant/presentation/contract/CurrencyFragmentContract;", "", "Presenter", "View", "app_debug"})
public abstract interface CurrencyFragmentContract {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&JH\u0010\u0011\u001a\u00020\u00052\u001e\u0010\u0012\u001a\u001a\u0012\b\u0012\u00060\u0014R\u00020\u00150\u0013j\f\u0012\b\u0012\u00060\u0014R\u00020\u0015`\u00162\u001e\u0010\u0017\u001a\u001a\u0012\b\u0012\u00060\u0014R\u00020\u00150\u0013j\f\u0012\b\u0012\u00060\u0014R\u00020\u0015`\u0016H&J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0015H&J\b\u0010\u001a\u001a\u00020\u0005H&J\b\u0010\u001b\u001a\u00020\u0005H&J\b\u0010\u001c\u001a\u00020\u0005H&J\b\u0010\u001d\u001a\u00020\u0005H&\u00a8\u0006\u001e"}, d2 = {"Landroid/test/currencyassistant/presentation/contract/CurrencyFragmentContract$View;", "Landroid/test/currencyassistant/presentation/base/BaseView;", "context", "Landroid/content/Context;", "currencyList", "", "dismissEmptyPage", "displayEmptyPage", "initializeAdapter", "initializeCurrentCurrency", "position", "", "initializeDependencies", "initializeLayoutManager", "initializeRecyclerView", "initiateFocusFirstElement", "initiateMoveElementToTop", "initiateUpdateCurrencyList", "oldCurrencyList", "Ljava/util/ArrayList;", "Landroid/test/currencyassistant/domain/models/Currency$CurrencyItem;", "Landroid/test/currencyassistant/domain/models/Currency;", "Lkotlin/collections/ArrayList;", "newCurrencyList", "processCurrency", "currency", "registerCurrencyReceiver", "startCurrencyUpdateService", "stopCurrencyUpdateService", "unregisterCurrencyReceiver", "app_debug"})
    public static abstract interface View extends android.test.currencyassistant.presentation.base.BaseView {
        
        public abstract void processCurrency(@org.jetbrains.annotations.NotNull()
        android.test.currencyassistant.domain.models.Currency currency);
        
        public abstract void initializeAdapter();
        
        public abstract void initializeLayoutManager();
        
        public abstract void currencyList();
        
        public abstract void initializeDependencies();
        
        public abstract void initializeCurrentCurrency(int position);
        
        public abstract void initiateMoveElementToTop(int position);
        
        public abstract void initiateUpdateCurrencyList(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> oldCurrencyList, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> newCurrencyList);
        
        public abstract void initiateFocusFirstElement();
        
        public abstract void displayEmptyPage();
        
        public abstract void dismissEmptyPage();
        
        public abstract void startCurrencyUpdateService();
        
        public abstract void stopCurrencyUpdateService();
        
        public abstract void registerCurrencyReceiver();
        
        public abstract void unregisterCurrencyReceiver();
        
        public abstract void initializeRecyclerView();
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.content.Context context();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006R\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Landroid/test/currencyassistant/presentation/contract/CurrencyFragmentContract$Presenter;", "Landroid/test/currencyassistant/presentation/base/BasePresenter;", "Landroid/test/currencyassistant/presentation/contract/CurrencyFragmentContract$View;", "currencyList", "", "currentCurrency", "Landroid/test/currencyassistant/domain/models/Currency$CurrencyItem;", "Landroid/test/currencyassistant/domain/models/Currency;", "app_debug"})
    public static abstract interface Presenter extends android.test.currencyassistant.presentation.base.BasePresenter<android.test.currencyassistant.presentation.contract.CurrencyFragmentContract.View> {
        
        public abstract void currencyList(@org.jetbrains.annotations.NotNull()
        android.test.currencyassistant.domain.models.Currency.CurrencyItem currentCurrency);
    }
}