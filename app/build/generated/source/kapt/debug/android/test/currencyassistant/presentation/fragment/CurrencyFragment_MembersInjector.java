package android.test.currencyassistant.presentation.fragment;

import android.test.currencyassistant.presentation.presenter.CurrencyFragmentPresenter;
import dagger.MembersInjector;
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
public final class CurrencyFragment_MembersInjector implements MembersInjector<CurrencyFragment> {
  private final Provider<CurrencyFragmentPresenter> presenterProvider;

  public CurrencyFragment_MembersInjector(Provider<CurrencyFragmentPresenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<CurrencyFragment> create(
      Provider<CurrencyFragmentPresenter> presenterProvider) {
    return new CurrencyFragment_MembersInjector(presenterProvider);}

  @Override
  public void injectMembers(CurrencyFragment instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(CurrencyFragment instance,
      CurrencyFragmentPresenter presenter) {
    instance.presenter = presenter;
  }
}
