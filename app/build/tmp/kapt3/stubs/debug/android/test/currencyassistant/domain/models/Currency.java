package android.test.currencyassistant.domain.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\t\u001a\u001a\u0012\b\u0012\u00060\u000bR\u00020\u00000\nj\f\u0012\b\u0012\u00060\u000bR\u00020\u0000`\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR>\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2 = {"Landroid/test/currencyassistant/domain/models/Currency;", "", "()V", "base", "", "getBase", "()Ljava/lang/String;", "setBase", "(Ljava/lang/String;)V", "currencyList", "Ljava/util/ArrayList;", "Landroid/test/currencyassistant/domain/models/Currency$CurrencyItem;", "Lkotlin/collections/ArrayList;", "getCurrencyList", "()Ljava/util/ArrayList;", "setCurrencyList", "(Ljava/util/ArrayList;)V", "date", "getDate", "setDate", "rates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getRates", "()Ljava/util/HashMap;", "setRates", "(Ljava/util/HashMap;)V", "toString", "CurrencyItem", "app_debug"})
public final class Currency {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "base")
    private java.lang.String base;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "date")
    private java.lang.String date;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "rates")
    private java.util.HashMap<java.lang.String, java.lang.Object> rates;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "currency_list")
    private java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> currencyList;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBase() {
        return null;
    }
    
    public final void setBase(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.HashMap<java.lang.String, java.lang.Object> getRates() {
        return null;
    }
    
    public final void setRates(@org.jetbrains.annotations.Nullable()
    java.util.HashMap<java.lang.String, java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> getCurrencyList() {
        return null;
    }
    
    public final void setCurrencyList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<android.test.currencyassistant.domain.models.Currency.CurrencyItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Currency() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0018"}, d2 = {"Landroid/test/currencyassistant/domain/models/Currency$CurrencyItem;", "", "(Landroid/test/currencyassistant/domain/models/Currency;)V", "currencyIcon", "", "getCurrencyIcon", "()Ljava/lang/Integer;", "setCurrencyIcon", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "currencyName", "", "getCurrencyName", "()Ljava/lang/String;", "setCurrencyName", "(Ljava/lang/String;)V", "currencyPrice", "", "getCurrencyPrice", "()Ljava/lang/Double;", "setCurrencyPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "toString", "app_debug"})
    public final class CurrencyItem {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "currency_name")
        private java.lang.String currencyName;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "currency_price")
        private java.lang.Double currencyPrice;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "currency_icon")
        private java.lang.Integer currencyIcon;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrencyName() {
            return null;
        }
        
        public final void setCurrencyName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getCurrencyPrice() {
            return null;
        }
        
        public final void setCurrencyPrice(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCurrencyIcon() {
            return null;
        }
        
        public final void setCurrencyIcon(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public CurrencyItem() {
            super();
        }
    }
}