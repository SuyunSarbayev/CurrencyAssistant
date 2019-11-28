package android.test.currencyassistant.di.components;

import android.test.currencyassistant.data.api.ApiImplementation;
import android.test.currencyassistant.data.repositories.CurrencyDataRepository;
import android.test.currencyassistant.data.repositories.CurrencyMapper;
import android.test.currencyassistant.di.modules.NetworkModule;
import android.test.currencyassistant.di.modules.NetworkModule_ProvidesCurrencyDomainRepositoryFactory;
import android.test.currencyassistant.di.modules.NetworkModule_ProvidesExecutorThreadFactory;
import android.test.currencyassistant.di.modules.NetworkModule_ProvidesGsonFactory;
import android.test.currencyassistant.di.modules.NetworkModule_ProvidesOkHttpCacheFactory;
import android.test.currencyassistant.di.modules.NetworkModule_ProvidesOkHttpClientFactory;
import android.test.currencyassistant.di.modules.NetworkModule_ProvidesRetrofitFactory;
import android.test.currencyassistant.di.modules.NetworkModule_ProvidesUiThreadFactory;
import android.test.currencyassistant.domain.repository.CurrencyDomainRepository;
import android.test.currencyassistant.domain.usecases.CurrencyListUseCases;
import android.test.currencyassistant.presentation.fragment.CurrencyFragment;
import android.test.currencyassistant.presentation.fragment.CurrencyFragment_MembersInjector;
import android.test.currencyassistant.presentation.presenter.CurrencyFragmentPresenter;
import android.test.currencyassistant.presentation.utils.ErrorHelper;
import com.google.gson.Gson;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerNetworkComponent implements NetworkComponent {
  private final NetworkModule networkModule;

  private Provider<Gson> providesGsonProvider;

  private Provider<Cache> providesOkHttpCacheProvider;

  private Provider<OkHttpClient> providesOkHttpClientProvider;

  private Provider<Retrofit> providesRetrofitProvider;

  private DaggerNetworkComponent(NetworkModule networkModuleParam) {
    this.networkModule = networkModuleParam;
    initialize(networkModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  private ApiImplementation getApiImplementation() {
    return new ApiImplementation(providesRetrofitProvider.get());}

  private CurrencyMapper getCurrencyMapper() {
    return new CurrencyMapper(providesGsonProvider.get());}

  private CurrencyDataRepository getCurrencyDataRepository() {
    return new CurrencyDataRepository(getApiImplementation(), getCurrencyMapper());}

  private CurrencyDomainRepository getCurrencyDomainRepository() {
    return NetworkModule_ProvidesCurrencyDomainRepositoryFactory.providesCurrencyDomainRepository(networkModule, getCurrencyDataRepository());}

  private CurrencyListUseCases getCurrencyListUseCases() {
    return new CurrencyListUseCases(NetworkModule_ProvidesExecutorThreadFactory.providesExecutorThread(networkModule), NetworkModule_ProvidesUiThreadFactory.providesUiThread(networkModule), getCurrencyDomainRepository());}

  private CurrencyFragmentPresenter getCurrencyFragmentPresenter() {
    return new CurrencyFragmentPresenter(getCurrencyListUseCases(), new ErrorHelper());}

  @SuppressWarnings("unchecked")
  private void initialize(final NetworkModule networkModuleParam) {
    this.providesGsonProvider = DoubleCheck.provider(NetworkModule_ProvidesGsonFactory.create(networkModuleParam));
    this.providesOkHttpCacheProvider = DoubleCheck.provider(NetworkModule_ProvidesOkHttpCacheFactory.create(networkModuleParam));
    this.providesOkHttpClientProvider = DoubleCheck.provider(NetworkModule_ProvidesOkHttpClientFactory.create(networkModuleParam, providesOkHttpCacheProvider));
    this.providesRetrofitProvider = DoubleCheck.provider(NetworkModule_ProvidesRetrofitFactory.create(networkModuleParam, providesGsonProvider, providesOkHttpClientProvider));
  }

  @Override
  public void inject(CurrencyFragment currencyFragment) {
    injectCurrencyFragment(currencyFragment);}

  private CurrencyFragment injectCurrencyFragment(CurrencyFragment instance) {
    CurrencyFragment_MembersInjector.injectPresenter(instance, getCurrencyFragmentPresenter());
    return instance;
  }

  public static final class Builder {
    private NetworkModule networkModule;

    private Builder() {
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public NetworkComponent build() {
      Preconditions.checkBuilderRequirement(networkModule, NetworkModule.class);
      return new DaggerNetworkComponent(networkModule);
    }
  }
}
