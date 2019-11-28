package android.test.currencyassistant.presentation.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Landroid/test/currencyassistant/presentation/interfaces/CurrencyValueUpdatedCallback;", "", "onCurrencyValueUpdated", "", "position", "", "value", "", "app_debug"})
public abstract interface CurrencyValueUpdatedCallback {
    
    public abstract void onCurrencyValueUpdated(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String value);
}