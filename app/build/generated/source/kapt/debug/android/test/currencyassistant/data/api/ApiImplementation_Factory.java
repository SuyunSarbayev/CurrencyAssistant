package android.test.currencyassistant.data.api;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiImplementation_Factory implements Factory<ApiImplementation> {
  private final Provider<Retrofit> retrofitProvider;

  public ApiImplementation_Factory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiImplementation get() {
    return newInstance(retrofitProvider.get());
  }

  public static ApiImplementation_Factory create(Provider<Retrofit> retrofitProvider) {
    return new ApiImplementation_Factory(retrofitProvider);
  }

  public static ApiImplementation newInstance(Retrofit retrofit) {
    return new ApiImplementation(retrofit);
  }
}
