package android.test.currencyassistant.di.modules;

import android.test.currencyassistant.data.repositories.CurrencyDataRepository;
import android.test.currencyassistant.domain.repository.CurrencyDomainRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class NetworkModule_ProvidesCurrencyDomainRepositoryFactory implements Factory<CurrencyDomainRepository> {
  private final NetworkModule module;

  private final Provider<CurrencyDataRepository> currencyDataRepositoryProvider;

  public NetworkModule_ProvidesCurrencyDomainRepositoryFactory(NetworkModule module,
      Provider<CurrencyDataRepository> currencyDataRepositoryProvider) {
    this.module = module;
    this.currencyDataRepositoryProvider = currencyDataRepositoryProvider;
  }

  @Override
  public CurrencyDomainRepository get() {
    return providesCurrencyDomainRepository(module, currencyDataRepositoryProvider.get());
  }

  public static NetworkModule_ProvidesCurrencyDomainRepositoryFactory create(NetworkModule module,
      Provider<CurrencyDataRepository> currencyDataRepositoryProvider) {
    return new NetworkModule_ProvidesCurrencyDomainRepositoryFactory(module, currencyDataRepositoryProvider);
  }

  public static CurrencyDomainRepository providesCurrencyDomainRepository(NetworkModule instance,
      CurrencyDataRepository currencyDataRepository) {
    return Preconditions.checkNotNull(instance.providesCurrencyDomainRepository(currencyDataRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
