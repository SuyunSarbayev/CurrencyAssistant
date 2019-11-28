package android.test.currencyassistant.domain.usecases;

import android.test.currencyassistant.domain.repository.CurrencyDomainRepository;
import dagger.internal.Factory;
import io.reactivex.Scheduler;
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
public final class CurrencyListUseCases_Factory implements Factory<CurrencyListUseCases> {
  private final Provider<Scheduler> executorThreadProvider;

  private final Provider<Scheduler> uiThreadProvider;

  private final Provider<CurrencyDomainRepository> currencyDomainRepositoryProvider;

  public CurrencyListUseCases_Factory(Provider<Scheduler> executorThreadProvider,
      Provider<Scheduler> uiThreadProvider,
      Provider<CurrencyDomainRepository> currencyDomainRepositoryProvider) {
    this.executorThreadProvider = executorThreadProvider;
    this.uiThreadProvider = uiThreadProvider;
    this.currencyDomainRepositoryProvider = currencyDomainRepositoryProvider;
  }

  @Override
  public CurrencyListUseCases get() {
    return newInstance(executorThreadProvider.get(), uiThreadProvider.get(), currencyDomainRepositoryProvider.get());
  }

  public static CurrencyListUseCases_Factory create(Provider<Scheduler> executorThreadProvider,
      Provider<Scheduler> uiThreadProvider,
      Provider<CurrencyDomainRepository> currencyDomainRepositoryProvider) {
    return new CurrencyListUseCases_Factory(executorThreadProvider, uiThreadProvider, currencyDomainRepositoryProvider);
  }

  public static CurrencyListUseCases newInstance(Scheduler executorThread, Scheduler uiThread,
      CurrencyDomainRepository currencyDomainRepository) {
    return new CurrencyListUseCases(executorThread, uiThread, currencyDomainRepository);
  }
}
