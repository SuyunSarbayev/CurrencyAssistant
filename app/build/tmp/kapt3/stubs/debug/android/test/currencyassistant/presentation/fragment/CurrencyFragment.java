package android.test.currencyassistant.presentation.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 c2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002cdB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010,\u001a\u00020-H\u0016J\b\u0010\f\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020.H\u0014J\b\u00100\u001a\u00020.H\u0016J\b\u00101\u001a\u00020.H\u0016J\b\u00102\u001a\u00020.H\u0016J\b\u00103\u001a\u00020.H\u0016J\n\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020.H\u0016J\u0010\u00107\u001a\u00020.2\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020.H\u0016J\b\u0010;\u001a\u00020.H\u0016J\b\u0010<\u001a\u00020.H\u0016J\b\u0010=\u001a\u00020.H\u0016J\b\u0010>\u001a\u00020.H\u0016J\b\u0010?\u001a\u00020.H\u0016J\b\u0010@\u001a\u00020.H\u0016J\u0010\u0010A\u001a\u00020.2\u0006\u00108\u001a\u000209H\u0016JH\u0010B\u001a\u00020.2\u001e\u0010C\u001a\u001a\u0012\b\u0012\u00060\u000eR\u00020\u000f0\rj\f\u0012\b\u0012\u00060\u000eR\u00020\u000f`\u00102\u001e\u0010D\u001a\u001a\u0012\b\u0012\u00060\u000eR\u00020\u000f0\rj\f\u0012\b\u0012\u00060\u000eR\u00020\u000f`\u0010H\u0016J\u0010\u0010E\u001a\u00020.2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010F\u001a\u00020.2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J&\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0018\u0010O\u001a\u00020.2\u0006\u00108\u001a\u0002092\u0006\u0010P\u001a\u000205H\u0016J\b\u0010Q\u001a\u00020.H\u0016J\b\u0010R\u001a\u00020.H\u0016J\b\u0010S\u001a\u000209H\u0014J\b\u0010T\u001a\u00020.H\u0016J\b\u0010U\u001a\u00020.H\u0016J\b\u0010V\u001a\u00020.H\u0016J\b\u0010W\u001a\u00020.H\u0016J\u0010\u0010X\u001a\u00020.2\u0006\u00108\u001a\u000209H\u0016J\u001a\u0010Y\u001a\u00020.2\u0006\u0010Z\u001a\u00020J2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0010\u0010[\u001a\u00020.2\u0006\u0010\\\u001a\u00020\u000fH\u0016J\u0012\u0010]\u001a\u00020.2\b\u0010^\u001a\u0004\u0018\u000105H\u0016J\b\u0010_\u001a\u00020.H\u0016J\b\u0010`\u001a\u00020.H\u0016J\b\u0010a\u001a\u00020.H\u0016J\b\u0010b\u001a\u00020.H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR2\u0010\f\u001a\u001a\u0012\b\u0012\u00060\u000eR\u00020\u000f0\rj\f\u0012\b\u0012\u00060\u000eR\u00020\u000f`\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00060\u0016R\u00020\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00060\u000eR\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006e"}, d2 = {"Landroid/test/currencyassistant/presentation/fragment/CurrencyFragment;", "Landroid/test/currencyassistant/presentation/base/BaseFragment;", "Landroid/test/currencyassistant/presentation/contract/CurrencyFragmentContract$View;", "Landroid/test/currencyassistant/presentation/interfaces/CurrencyClickInterface;", "Landroid/test/currencyassistant/presentation/interfaces/CurrencyValueUpdatedCallback;", "()V", "currencyAdapter", "Landroid/test/currencyassistant/presentation/adapters/currency/CurrencyAdapter;", "getCurrencyAdapter", "()Landroid/test/currencyassistant/presentation/adapters/currency/CurrencyAdapter;", "setCurrencyAdapter", "(Landroid/test/currencyassistant/presentation/adapters/currency/CurrencyAdapter;)V", "currencyList", "Ljava/util/ArrayList;", "Landroid/test/currencyassistant/domain/models/Currency$CurrencyItem;", "Landroid/test/currencyassistant/domain/models/Currency;", "Lkotlin/collections/ArrayList;", "getCurrencyList", "()Ljava/util/ArrayList;", "setCurrencyList", "(Ljava/util/ArrayList;)V", "currencyUpdateReceiver", "Landroid/test/currencyassistant/presentation/fragment/CurrencyFragment$CurrencyUpdateReceiver;", "getCurrencyUpdateReceiver", "()Landroid/test/currencyassistant/presentation/fragment/CurrencyFragment$CurrencyUpdateReceiver;", "setCurrencyUpdateReceiver", "(Landroid/test/currencyassistant/presentation/fragment/CurrencyFragment$CurrencyUpdateReceiver;)V", "currentCurrency", "getCurrentCurrency", "()Landroid/test/currencyassistant/domain/models/Currency$CurrencyItem;", "setCurrentCurrency", "(Landroid/test/currencyassistant/domain/models/Currency$CurrencyItem;)V", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "presenter", "Landroid/test/currencyassistant/presentation/presenter/CurrencyFragmentPresenter;", "getPresenter", "()Landroid/test/currencyassistant/presentation/presenter/CurrencyFragmentPresenter;", "setPresenter", "(Landroid/test/currencyassistant/presentation/presenter/CurrencyFragmentPresenter;)V", "context", "Landroid/content/Context;", "", "customizeActionBar", "dismissEmptyPage", "dismissLoader", "displayEmptyPage", "displayLoader", "getFragmentTag", "", "initializeAdapter", "initializeCurrentCurrency", "position", "", "initializeDependencies", "initializeLayoutManager", "initializeListeners", "initializeRecyclerView", "initializeViews", "initializeViewsData", "initiateFocusFirstElement", "initiateMoveElementToTop", "initiateUpdateCurrencyList", "oldCurrencyList", "newCurrencyList", "onAttach", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCurrencyValueUpdated", "value", "onDestroy", "onDestroyView", "onLayoutId", "onPause", "onResume", "onStart", "onStop", "onViewClicked", "onViewCreated", "view", "processCurrency", "currency", "processError", "withText", "registerCurrencyReceiver", "startCurrencyUpdateService", "stopCurrencyUpdateService", "unregisterCurrencyReceiver", "Companion", "CurrencyUpdateReceiver", "app_debug"})
public final class CurrencyFragment extends android.test.currencyassistant.presentation.base.BaseFragment implements android.test.currencyassistant.presentation.contract.CurrencyFragmentContract.View, android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface, android.test.currencyassistant.presentation.interfaces.CurrencyValueUpdatedCallback {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.test.currencyassistant.presentation.presenter.CurrencyFragmentPresenter presenter;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.LinearLayoutManager layoutManager;
    @org.jetbrains.annotations.NotNull()
    public android.test.currencyassistant.presentation.adapters.currency.CurrencyAdapter currencyAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> currencyList;
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.presentation.fragment.CurrencyFragment.CurrencyUpdateReceiver currencyUpdateReceiver;
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.domain.models.Currency.CurrencyItem currentCurrency;
    public static final android.test.currencyassistant.presentation.fragment.CurrencyFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.presentation.presenter.CurrencyFragmentPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.presenter.CurrencyFragmentPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getLayoutManager() {
        return null;
    }
    
    public final void setLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.presentation.adapters.currency.CurrencyAdapter getCurrencyAdapter() {
        return null;
    }
    
    public final void setCurrencyAdapter(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.adapters.currency.CurrencyAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> getCurrencyList() {
        return null;
    }
    
    public final void setCurrencyList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.presentation.fragment.CurrencyFragment.CurrencyUpdateReceiver getCurrencyUpdateReceiver() {
        return null;
    }
    
    public final void setCurrencyUpdateReceiver(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.fragment.CurrencyFragment.CurrencyUpdateReceiver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.domain.models.Currency.CurrencyItem getCurrentCurrency() {
        return null;
    }
    
    public final void setCurrentCurrency(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.domain.models.Currency.CurrencyItem p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getFragmentTag() {
        return null;
    }
    
    @java.lang.Override()
    protected int onLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void customizeActionBar() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context context() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void startCurrencyUpdateService() {
    }
    
    @java.lang.Override()
    public void stopCurrencyUpdateService() {
    }
    
    @java.lang.Override()
    public void registerCurrencyReceiver() {
    }
    
    @java.lang.Override()
    public void unregisterCurrencyReceiver() {
    }
    
    @java.lang.Override()
    public void processCurrency(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.domain.models.Currency currency) {
    }
    
    @java.lang.Override()
    public void initializeRecyclerView() {
    }
    
    @java.lang.Override()
    public void initializeAdapter() {
    }
    
    @java.lang.Override()
    public void initializeLayoutManager() {
    }
    
    @java.lang.Override()
    public void initializeViews() {
    }
    
    @java.lang.Override()
    public void initializeViewsData() {
    }
    
    @java.lang.Override()
    public void initializeListeners() {
    }
    
    @java.lang.Override()
    public void initializeCurrentCurrency(int position) {
    }
    
    @java.lang.Override()
    public void initiateUpdateCurrencyList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> oldCurrencyList, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> newCurrencyList) {
    }
    
    @java.lang.Override()
    public void initiateFocusFirstElement() {
    }
    
    @java.lang.Override()
    public void initiateMoveElementToTop(int position) {
    }
    
    @java.lang.Override()
    public void displayLoader() {
    }
    
    @java.lang.Override()
    public void dismissLoader() {
    }
    
    @java.lang.Override()
    public void displayEmptyPage() {
    }
    
    @java.lang.Override()
    public void dismissEmptyPage() {
    }
    
    @java.lang.Override()
    public void processError(@org.jetbrains.annotations.Nullable()
    java.lang.String withText) {
    }
    
    @java.lang.Override()
    public void initializeDependencies() {
    }
    
    @java.lang.Override()
    public void currencyList() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onViewClicked(int position) {
    }
    
    @java.lang.Override()
    public void onCurrencyValueUpdated(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public CurrencyFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.test.currencyassistant.presentation.fragment.CurrencyFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Landroid/test/currencyassistant/presentation/fragment/CurrencyFragment$CurrencyUpdateReceiver;", "Landroid/content/BroadcastReceiver;", "(Landroid/test/currencyassistant/presentation/fragment/CurrencyFragment;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public final class CurrencyUpdateReceiver extends android.content.BroadcastReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
        }
        
        public CurrencyUpdateReceiver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Landroid/test/currencyassistant/presentation/fragment/CurrencyFragment$Companion;", "", "()V", "newInstance", "Landroid/test/currencyassistant/presentation/fragment/CurrencyFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.test.currencyassistant.presentation.fragment.CurrencyFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}