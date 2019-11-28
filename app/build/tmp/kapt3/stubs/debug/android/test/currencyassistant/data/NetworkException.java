package android.test.currencyassistant.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u0004\u0018\u00010\tR\u001e\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\n"}, d2 = {"Landroid/test/currencyassistant/data/NetworkException;", "Lretrofit2/HttpException;", "response", "Lretrofit2/Response;", "(Lretrofit2/Response;)V", "getResponse", "()Lretrofit2/Response;", "setResponse", "errorBody", "", "app_debug"})
public final class NetworkException extends retrofit2.HttpException {
    @org.jetbrains.annotations.NotNull()
    private retrofit2.Response<?> response;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Response<?> getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<?> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String errorBody() {
        return null;
    }
    
    public NetworkException(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<?> response) {
        super(null);
    }
}