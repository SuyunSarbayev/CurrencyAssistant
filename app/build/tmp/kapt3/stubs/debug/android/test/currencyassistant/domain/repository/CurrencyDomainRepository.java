package android.test.currencyassistant.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`\bH&\u00a8\u0006\t"}, d2 = {"Landroid/test/currencyassistant/domain/repository/CurrencyDomainRepository;", "", "currencyList", "Lio/reactivex/Single;", "Landroid/test/currencyassistant/domain/models/Currency;", "params", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "app_debug"})
public abstract interface CurrencyDomainRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<android.test.currencyassistant.domain.models.Currency> currencyList(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> params);
}