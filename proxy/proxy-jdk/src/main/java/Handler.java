import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {

  private final ICommon original;

  public Handler(ICommon original) {
    this.original = original;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("BEFORE");
    method.invoke(original, args);
    System.out.println("AFTER");
    return null;
  }
}
