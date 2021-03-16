import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class CglibProxyDemo {

  public static void main(String[] args) {
    Original original = new Original();
    MethodInterceptor handler = new Handler(original);
    Original f = (Original) Enhancer.create(Original.class, handler);
    f.originalMethod("Hello");
  }
}
