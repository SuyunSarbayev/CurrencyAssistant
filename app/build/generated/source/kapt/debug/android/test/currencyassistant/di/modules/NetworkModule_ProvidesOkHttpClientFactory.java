package android.test.currencyassistant.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<Cache> cacheProvider;

  public NetworkModule_ProvidesOkHttpClientFactory(NetworkModule module,
      Provider<Cache> cacheProvider) {
    this.module = module;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return providesOkHttpClient(module, cacheProvider.get());
  }

  public static NetworkModule_ProvidesOkHttpClientFactory create(NetworkModule module,
      Provider<Cache> cacheProvider) {
    return new NetworkModule_ProvidesOkHttpClientFactory(module, cacheProvider);
  }

  public static OkHttpClient providesOkHttpClient(NetworkModule instance, Cache cache) {
    return Preconditions.checkNotNull(instance.providesOkHttpClient(cache), "Cannot return null from a non-@Nullable @Provides method");
  }
}
