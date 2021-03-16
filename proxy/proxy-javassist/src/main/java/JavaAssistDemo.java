import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

public class JavaAssistDemo {

  public static void main(String[] args) throws IllegalAccessException, InstantiationException {

    Original original = new Original();
    MethodHandler handler = new Handler(original);

    ProxyFactory factory = new ProxyFactory();
    factory.setSuperclass(Original.class);
    Object instance = factory.createClass().newInstance();
    ((ProxyObject) instance).setHandler(handler);

    Original originalProxy = (Original) instance;
    originalProxy.originalMethod("Hello");
  }
}
