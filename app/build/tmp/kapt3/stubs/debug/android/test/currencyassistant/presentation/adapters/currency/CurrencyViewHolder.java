package android.test.currencyassistant.presentation.adapters.currency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0012\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J*\u0010*\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0016J\u0012\u00100\u001a\u00020\'2\n\u00101\u001a\u000602R\u000203J\u0006\u00104\u001a\u00020\'J\u0012\u00105\u001a\u00020\'2\n\u00101\u001a\u000602R\u000203J\u0012\u00106\u001a\u00020\'2\n\u00101\u001a\u000602R\u000203J\u0006\u00107\u001a\u00020\'J\u0006\u00108\u001a\u00020\'J\u0012\u00109\u001a\u00020\'2\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010;\u001a\u00020\'2\b\u0010:\u001a\u0004\u0018\u00010\u00062\u0006\u0010<\u001a\u00020=H\u0016J*\u0010>\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\u0006\u0010?\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0016J\u0010\u0010@\u001a\u00020\'2\b\u0010A\u001a\u0004\u0018\u00010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006B"}, d2 = {"Landroid/test/currencyassistant/presentation/adapters/currency/CurrencyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/text/TextWatcher;", "itemView", "Landroid/view/View;", "context", "Landroid/content/Context;", "currencyClickInterface", "Landroid/test/currencyassistant/presentation/interfaces/CurrencyClickInterface;", "currencyValueUpdatedCallback", "Landroid/test/currencyassistant/presentation/interfaces/CurrencyValueUpdatedCallback;", "(Landroid/view/View;Landroid/content/Context;Landroid/test/currencyassistant/presentation/interfaces/CurrencyClickInterface;Landroid/test/currencyassistant/presentation/interfaces/CurrencyValueUpdatedCallback;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getCurrencyClickInterface", "()Landroid/test/currencyassistant/presentation/interfaces/CurrencyClickInterface;", "setCurrencyClickInterface", "(Landroid/test/currencyassistant/presentation/interfaces/CurrencyClickInterface;)V", "getCurrencyValueUpdatedCallback", "()Landroid/test/currencyassistant/presentation/interfaces/CurrencyValueUpdatedCallback;", "setCurrencyValueUpdatedCallback", "(Landroid/test/currencyassistant/presentation/interfaces/CurrencyValueUpdatedCallback;)V", "decimalFormat", "Ljava/text/DecimalFormat;", "getDecimalFormat", "()Ljava/text/DecimalFormat;", "setDecimalFormat", "(Ljava/text/DecimalFormat;)V", "picasso", "Lcom/squareup/picasso/Picasso;", "getPicasso", "()Lcom/squareup/picasso/Picasso;", "setPicasso", "(Lcom/squareup/picasso/Picasso;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "bind", "currencyItem", "Landroid/test/currencyassistant/domain/models/Currency$CurrencyItem;", "Landroid/test/currencyassistant/domain/models/Currency;", "initializeCurrencyField", "initializeData", "initializeIcon", "initializeListeners", "initiateFocus", "onClick", "v", "onFocusChange", "hasFocus", "", "onTextChanged", "before", "openKeyboard", "view", "app_debug"})
public final class CurrencyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.text.TextWatcher {
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface currencyClickInterface;
    @org.jetbrains.annotations.NotNull()
    private android.test.currencyassistant.presentation.interfaces.CurrencyValueUpdatedCallback currencyValueUpdatedCallback;
    @org.jetbrains.annotations.NotNull()
    private com.squareup.picasso.Picasso picasso;
    @org.jetbrains.annotations.NotNull()
    private java.text.DecimalFormat decimalFormat;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.picasso.Picasso getPicasso() {
        return null;
    }
    
    public final void setPicasso(@org.jetbrains.annotations.NotNull()
    com.squareup.picasso.Picasso p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.DecimalFormat getDecimalFormat() {
        return null;
    }
    
    public final void setDecimalFormat(@org.jetbrains.annotations.NotNull()
    java.text.DecimalFormat p0) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.domain.models.Currency.CurrencyItem currencyItem) {
    }
    
    public final void initializeData(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.domain.models.Currency.CurrencyItem currencyItem) {
    }
    
    public final void initializeIcon(@org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.domain.models.Currency.CurrencyItem currencyItem) {
    }
    
    public final void initializeListeners() {
    }
    
    public final void initiateFocus() {
    }
    
    public final void initializeCurrencyField() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onFocusChange(@org.jetbrains.annotations.Nullable()
    android.view.View v, boolean hasFocus) {
    }
    
    public final void openKeyboard(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    public CurrencyViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.interfaces.CurrencyClickInterface currencyClickInterface, @org.jetbrains.annotations.NotNull()
    android.test.currencyassistant.presentation.interfaces.CurrencyValueUpdatedCallback currencyValueUpdatedCallback) {
        super(null);
    }
}