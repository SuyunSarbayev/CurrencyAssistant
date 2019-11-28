package android.test.currencyassistant.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.Cache;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesOkHttpCacheFactory implements Factory<Cache> {
  private final NetworkModule module;

  public NetworkModule_ProvidesOkHttpCacheFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Cache get() {
    return providesOkHttpCache(module);
  }

  public static NetworkModule_ProvidesOkHttpCacheFactory create(NetworkModule module) {
    return new NetworkModule_ProvidesOkHttpCacheFactory(module);
  }

  public static Cache providesOkHttpCache(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.providesOkHttpCache(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
