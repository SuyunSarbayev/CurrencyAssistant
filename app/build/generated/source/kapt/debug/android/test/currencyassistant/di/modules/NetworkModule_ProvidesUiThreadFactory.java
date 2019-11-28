package android.test.currencyassistant.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.Scheduler;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesUiThreadFactory implements Factory<Scheduler> {
  private final NetworkModule module;

  public NetworkModule_ProvidesUiThreadFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Scheduler get() {
    return providesUiThread(module);
  }

  public static NetworkModule_ProvidesUiThreadFactory create(NetworkModule module) {
    return new NetworkModule_ProvidesUiThreadFactory(module);
  }

  public static Scheduler providesUiThread(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.providesUiThread(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
