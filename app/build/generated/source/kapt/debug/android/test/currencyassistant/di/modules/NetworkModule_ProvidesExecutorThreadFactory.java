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
public final class NetworkModule_ProvidesExecutorThreadFactory implements Factory<Scheduler> {
  private final NetworkModule module;

  public NetworkModule_ProvidesExecutorThreadFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Scheduler get() {
    return providesExecutorThread(module);
  }

  public static NetworkModule_ProvidesExecutorThreadFactory create(NetworkModule module) {
    return new NetworkModule_ProvidesExecutorThreadFactory(module);
  }

  public static Scheduler providesExecutorThread(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.providesExecutorThread(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
