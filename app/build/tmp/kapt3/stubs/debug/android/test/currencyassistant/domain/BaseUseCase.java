package android.test.currencyassistant.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H&J\u0006\u0010\u0017\u001a\u00020\u0014J\u0014\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Landroid/test/currencyassistant/domain/BaseUseCase;", "T", "", "executorThread", "Lio/reactivex/Scheduler;", "uiThread", "(Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "compositeDisposableObserver", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposableObserver", "()Lio/reactivex/disposables/CompositeDisposable;", "setCompositeDisposableObserver", "(Lio/reactivex/disposables/CompositeDisposable;)V", "getExecutorThread", "()Lio/reactivex/Scheduler;", "setExecutorThread", "(Lio/reactivex/Scheduler;)V", "getUiThread", "setUiThread", "clear", "", "createObservable", "Lio/reactivex/Single;", "dispose", "execute", "disposableObserver", "Lio/reactivex/observers/DisposableSingleObserver;", "app_debug"})
public abstract class BaseUseCase<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.disposables.CompositeDisposable compositeDisposableObserver;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.Scheduler executorThread;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.Scheduler uiThread;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposableObserver() {
        return null;
    }
    
    public final void setCompositeDisposableObserver(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Scheduler getExecutorThread() {
        return null;
    }
    
    public final void setExecutorThread(@org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Scheduler getUiThread() {
        return null;
    }
    
    public final void setUiThread(@org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler p0) {
    }
    
    public final void execute(@org.jetbrains.annotations.NotNull()
    io.reactivex.observers.DisposableSingleObserver<T> disposableObserver) {
    }
    
    public final void dispose() {
    }
    
    public final void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<T> createObservable();
    
    public BaseUseCase(@org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler executorThread, @org.jetbrains.annotations.NotNull()
    io.reactivex.Scheduler uiThread) {
        super();
    }
}