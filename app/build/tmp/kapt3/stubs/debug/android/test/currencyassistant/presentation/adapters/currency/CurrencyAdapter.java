package android.test.currencyassistant.presentation.adapters.currency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u001e\u0010\u0005\u001a\u001a\u0012\b\u0012\u00060\u0007R\u00020\b0\u0006j\f\u0012\b\u0012\u00060\u0007R\u00020\b`\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020 H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R2\u0010\u0005\u001a\u001a\u0012\b\u0012\u00060\u0007R\u00020\b0\u0006j\f\u0012\b\u0012\u00060\u0007R\u00020\b`\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006)"}, d2 = {"Landroid/test/currencyassistant/presentation/adapters/currency/CurrencyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "currencyList", "Ljava/util/ArrayList;", "Landroid/test/currencyassistant/domain/models/Currency$CurrencyItem;", "Landroid/test/currencyassistant/domain/models/Currency;", "Lkotlin/collections/ArrayList;", "currencyClickInterface", "Landroid/test/currencyassistant/presentation/interfaces/CurrencyClickInterface;", "currencyValueUpdatedCallback", "Landroid/test/currencyassistant/presentation/interfaces/CurrencyValueUpdatedCallback;", "(Landroid/content/Context;Ljava/util/ArrayList;Landroid/test/currencyassistant/presentation/interfaces/CurrencyClickInterface;Landroid/test/currencyassistant/presentation/interfaces/CurrencyValueUpdatedCallback;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getCurrencyClickInterface", "()Landroid/test/currencyassistant/presentation/interfaces/CurrencyClickInterface;", "setCurrencyClickInterface", "(Landroid/test/currencyassistant/presentation/interfaces/CurrencyClickInterface;)V", "getCurrencyList", "()Ljava/util/ArrayList;", "setCurrencyList", "(Ljava/util/ArrayList;)V", "getCurrencyValueUpdatedCallback", "()Landroid/test/currencyassistant/presentation/interfaces/CurrencyValueUpdatedCallback;", "setCurrencyValueUpdatedCallback", "(Landroid/test/currencyassistant/presentation/interfaces/CurrencyValueUpdatedCallback;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class CurrencyAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> currencyList;
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface currencyClickInterface;
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.presentation.interfaces.CurrencyValueUpdatedCallback currencyValueUpdatedCallback;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> getCurrencyList() {
        return null;
    }
    
    public final void setCurrencyList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface getCurrencyClickInterface() {
        return null;
    }
    
    public final void setCurrencyClickInterface(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.test.currencyassistant.presentation.interfaces.CurrencyValueUpdatedCallback getCurrencyValueUpdatedCallback() {
        return null;
    }
    
    public final void setCurrencyValueUpdatedCallback(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.interfaces.CurrencyValueUpdatedCallback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public CurrencyAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> currencyList, @org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface currencyClickInterface, @org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.interfaces.CurrencyValueUpdatedCallback currencyValueUpdatedCallback) {
        super();
    }
}