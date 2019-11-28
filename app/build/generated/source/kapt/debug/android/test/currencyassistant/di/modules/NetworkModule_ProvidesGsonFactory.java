package android.test.currencyassistant.di.modules;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesGsonFactory implements Factory<Gson> {
  private final NetworkModule module;

  public NetworkModule_ProvidesGsonFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return providesGson(module);
  }

  public static NetworkModule_ProvidesGsonFactory create(NetworkModule module) {
    return new NetworkModule_ProvidesGsonFactory(module);
  }

  public static Gson providesGson(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.providesGson(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
