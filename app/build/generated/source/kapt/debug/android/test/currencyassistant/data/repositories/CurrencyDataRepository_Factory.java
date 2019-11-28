package android.test.currencyassistant.data.repositories;

import android.test.currencyassistant.data.api.ApiImplementation;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrencyDataRepository_Factory implements Factory<CurrencyDataRepository> {
  private final Provider<ApiImplementation> apiImplementationProvider;

  private final Provider<CurrencyMapper> currencyMapperProvider;

  public CurrencyDataRepository_Factory(Provider<ApiImplementation> apiImplementationProvider,
      Provider<CurrencyMapper> currencyMapperProvider) {
    this.apiImplementationProvider = apiImplementationProvider;
    this.currencyMapperProvider = currencyMapperProvider;
  }

  @Override
  public CurrencyDataRepository get() {
    return newInstance(apiImplementationProvider.get(), currencyMapperProvider.get());
  }

  public static CurrencyDataRepository_Factory create(
      Provider<ApiImplementation> apiImplementationProvider,
      Provider<CurrencyMapper> currencyMapperProvider) {
    return new CurrencyDataRepository_Factory(apiImplementationProvider, currencyMapperProvider);
  }

  public static CurrencyDataRepository newInstance(ApiImplementation apiImplementation,
      CurrencyMapper currencyMapper) {
    return new CurrencyDataRepository(apiImplementation, currencyMapper);
  }
}
