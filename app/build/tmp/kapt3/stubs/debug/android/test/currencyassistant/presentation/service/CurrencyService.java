package android.test.currencyassistant.presentation.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\u0006\u0010\u001f\u001a\u00020\u001aJ\u0006\u0010 \u001a\u00020\u001aR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Landroid/test/currencyassistant/presentation/service/CurrencyService;", "Landroid/app/Service;", "()V", "binder", "Landroid/os/Binder;", "getBinder", "()Landroid/os/Binder;", "setBinder", "(Landroid/os/Binder;)V", "delay", "", "handler", "Landroid/os/Handler;", "started", "", "timer", "Ljava/util/Timer;", "getTimer", "()Ljava/util/Timer;", "setTimer", "(Ljava/util/Timer;)V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onDestroy", "", "onStartCommand", "", "flags", "startId", "sendCurrencyUpdate", "startUpdates", "app_debug"})
public final class CurrencyService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    private android.os.Binder binder;
    @org.jetbrains.annotations.NotNull()
    private java.util.Timer timer;
    private final long delay = 1000L;
    private final android.os.Handler handler = null;
    private boolean started;
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Binder getBinder() {
        return null;
    }
    
    public final void setBinder(@org.jetbrains.annotations.NotNull()
    android.os.Binder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Timer getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.NotNull()
    java.util.Timer p0) {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    public final void startUpdates() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public final void sendCurrencyUpdate() {
    }
    
    public CurrencyService() {
        super();
    }
}