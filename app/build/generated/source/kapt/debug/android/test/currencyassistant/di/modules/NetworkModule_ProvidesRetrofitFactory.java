package android.test.currencyassistant.di.modules;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
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
public final class NetworkModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvidesRetrofitFactory(NetworkModule module, Provider<Gson> gsonProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return providesRetrofit(module, gsonProvider.get(), okHttpClientProvider.get());
  }

  public static NetworkModule_ProvidesRetrofitFactory create(NetworkModule module,
      Provider<Gson> gsonProvider, Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvidesRetrofitFactory(module, gsonProvider, okHttpClientProvider);
  }

  public static Retrofit providesRetrofit(NetworkModule instance, Gson gson,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(instance.providesRetrofit(gson, okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
