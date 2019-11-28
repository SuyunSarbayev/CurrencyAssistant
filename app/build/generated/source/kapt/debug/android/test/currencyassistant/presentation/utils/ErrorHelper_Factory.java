package android.test.currencyassistant.presentation.utils;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ErrorHelper_Factory implements Factory<ErrorHelper> {
  @Override
  public ErrorHelper get() {
    return newInstance();
  }

  public static ErrorHelper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ErrorHelper newInstance() {
    return new ErrorHelper();
  }

  private static final class InstanceHolder {
    private static final ErrorHelper_Factory INSTANCE = new ErrorHelper_Factory();
  }
}
