package android.test.currencyassistant.presentation.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BE\u0012\u001e\u0010\u0002\u001a\u001a\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003j\f\u0012\b\u0012\u00060\u0004R\u00020\u0005`\u0006\u0012\u001e\u0010\u0007\u001a\u001a\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003j\f\u0012\b\u0012\u00060\u0004R\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R*\u0010\u0007\u001a\u001e\u0012\b\u0012\u00060\u0004R\u00020\u0005\u0018\u00010\u0003j\u000e\u0012\b\u0012\u00060\u0004R\u00020\u0005\u0018\u0001`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0002\u001a\u001e\u0012\b\u0012\u00060\u0004R\u00020\u0005\u0018\u00010\u0003j\u000e\u0012\b\u0012\u00060\u0004R\u00020\u0005\u0018\u0001`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Landroid/test/currencyassistant/presentation/utils/UtilCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "Ljava/util/ArrayList;", "Landroid/test/currencyassistant/domain/models/Currency$CurrencyItem;", "Landroid/test/currencyassistant/domain/models/Currency;", "Lkotlin/collections/ArrayList;", "newList", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "app_debug"})
public final class UtilCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
    private java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> oldList;
    private java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> newList;
    
    @java.lang.Override()
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
    
    @java.lang.Override()
    public int getOldListSize() {
        return 0;
    }
    
    @java.lang.Override()
    public int getNewListSize() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
    
    public UtilCallback(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> oldList, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> newList) {
        super();
    }
}