import javassist.util.proxy.MethodHandler;

import java.lang.reflect.Method;

public class Handler implements MethodHandler {

  private final Original original;

  public Handler(Original original) {
    this.original = original;
  }

  public Object invoke(Object self, Method thisMethod, Method proceed, Object[] objects) throws Throwable {
    System.out.println("BEFORE");
    thisMethod.invoke(original, objects);
    System.out.println("AFTER");
    return null;
  }
}
