import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.InvocationHandlerAdapter;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.reflect.InvocationHandler;

public class ByteBuddyProxyDemo {

  public static void main(String[] args) throws IllegalAccessException, InstantiationException {

    Original original = new Original();
    InvocationHandler handler = new Handler(original);

    Original proxy  = new ByteBuddy()
             .subclass(Original.class)
             .method(ElementMatchers.any())
             .intercept(InvocationHandlerAdapter.of(handler))
             .make()
             .load(Original.class.getClassLoader())
             .getLoaded()
             .newInstance();

    proxy.originalMethod("Hello");



  }
}
