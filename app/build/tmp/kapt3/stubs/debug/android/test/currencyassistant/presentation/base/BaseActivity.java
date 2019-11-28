package android.test.currencyassistant.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\nH\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\n\u0010\u0014\u001a\u0004\u0018\u00010\fH$J\b\u0010\u0015\u001a\u00020\nH\u0014J\b\u0010\u0016\u001a\u00020\nH\u0014J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0013H\u0014J\b\u0010\u0019\u001a\u00020\nH\u0014J\b\u0010\u001a\u001a\u00020\nH\u0014J\b\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001d"}, d2 = {"Landroid/test/currencyassistant/presentation/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "allowTransaction", "", "getAllowTransaction", "()Z", "setAllowTransaction", "(Z)V", "displayFragment", "", "fragment", "Landroid/test/currencyassistant/presentation/base/BaseFragment;", "getCurrentFragment", "initializeLayout", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInitFragment", "onPause", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "popBackStack", "popCurrentFragment", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private boolean allowTransaction;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getAllowTransaction() {
        return false;
    }
    
    public final void setAllowTransaction(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract android.test.currencyassistant.presentation.base.BaseFragment onInitFragment();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final int initializeLayout() {
        return 0;
    }
    
    private final android.test.currencyassistant.presentation.base.BaseFragment getCurrentFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public void displayFragment(@org.jetbrains.annotations.Nullable()
    android.test.currencyassistant.presentation.base.BaseFragment fragment) {
    }
    
    public void popBackStack() {
    }
    
    public void popCurrentFragment() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public BaseActivity() {
        super();
    }
}