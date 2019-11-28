package android.test.currencyassistant.data.repositories;

import com.google.gson.Gson;
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
public final class CurrencyMapper_Factory implements Factory<CurrencyMapper> {
  private final Provider<Gson> gsonProvider;

  public CurrencyMapper_Factory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public CurrencyMapper get() {
    return newInstance(gsonProvider.get());
  }

  public static CurrencyMapper_Factory create(Provider<Gson> gsonProvider) {
    return new CurrencyMapper_Factory(gsonProvider);
  }

  public static CurrencyMapper newInstance(Gson gson) {
    return new CurrencyMapper(gson);
  }
}
