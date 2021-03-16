import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Handler implements MethodInterceptor {

  private final Original original;

  public Handler(Original original) {
    this.original = original;
  }

  public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
    System.out.println("BEFORE");
    method.invoke(original, args);
    System.out.println("AFTER");
    return null;
  }
}
