package android.test.currencyassistant.presentation.presenter;

import android.test.currencyassistant.domain.usecases.CurrencyListUseCases;
import android.test.currencyassistant.presentation.utils.ErrorHelper;
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
public final class CurrencyFragmentPresenter_Factory implements Factory<CurrencyFragmentPresenter> {
  private final Provider<CurrencyListUseCases> currencyListUseCasesProvider;

  private final Provider<ErrorHelper> errorHelperProvider;

  public CurrencyFragmentPresenter_Factory(
      Provider<CurrencyListUseCases> currencyListUseCasesProvider,
      Provider<ErrorHelper> errorHelperProvider) {
    this.currencyListUseCasesProvider = currencyListUseCasesProvider;
    this.errorHelperProvider = errorHelperProvider;
  }

  @Override
  public CurrencyFragmentPresenter get() {
    return newInstance(currencyListUseCasesProvider.get(), errorHelperProvider.get());
  }

  public static CurrencyFragmentPresenter_Factory create(
      Provider<CurrencyListUseCases> currencyListUseCasesProvider,
      Provider<ErrorHelper> errorHelperProvider) {
    return new CurrencyFragmentPresenter_Factory(currencyListUseCasesProvider, errorHelperProvider);
  }

  public static CurrencyFragmentPresenter newInstance(CurrencyListUseCases currencyListUseCases,
      ErrorHelper errorHelper) {
    return new CurrencyFragmentPresenter(currencyListUseCases, errorHelper);
  }
}
