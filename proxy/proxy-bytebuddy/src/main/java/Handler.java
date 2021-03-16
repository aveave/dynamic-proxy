import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {

  private Original original;

  public Handler(Original original) {
    this.original = original;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("BEFORE");
    method.invoke(original, args);
    System.out.println("AFTER");
    return null;
  }
}
