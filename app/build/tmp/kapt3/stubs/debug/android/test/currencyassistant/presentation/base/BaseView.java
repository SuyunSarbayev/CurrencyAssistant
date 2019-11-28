package android.test.currencyassistant.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\u000b"}, d2 = {"Landroid/test/currencyassistant/presentation/base/BaseView;", "", "dismissLoader", "", "displayLoader", "initializeListeners", "initializeViews", "initializeViewsData", "processError", "withText", "", "app_debug"})
public abstract interface BaseView {
    
    public abstract void initializeViews();
    
    public abstract void initializeViewsData();
    
    public abstract void initializeListeners();
    
    public abstract void displayLoader();
    
    public abstract void dismissLoader();
    
    public abstract void processError(@org.jetbrains.annotations.Nullable()
    java.lang.String withText);
}