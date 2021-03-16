import java.lang.reflect.Proxy;

public class JdkProxyDemo {

  public static void main(String[] args) {
    Original original = new Original();
    Handler handler = new Handler(original);
    ICommon common = (ICommon) Proxy.newProxyInstance(ICommon.class.getClassLoader(),
                                                      new Class[]{ICommon.class},
                                                      handler);
    common.originalMethod("Hello");

  }
}
