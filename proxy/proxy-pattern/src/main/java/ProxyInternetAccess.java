import java.util.HashMap;
import java.util.Map;

public class ProxyInternetAccess implements OfficeInternetAccess {

  private String employeeName;
  private RealInternetAccess realInternetAccess;

  private static Map<String, Integer> accessRight = new HashMap<String, Integer>();

  static {
    accessRight.put("John Doe", 1);
    accessRight.put("Bon Jovi", 3);
    accessRight.put("Bryan Adams", 2);
  }

  public ProxyInternetAccess(String employeeName) {
    this.employeeName = employeeName;
  }

  public void grantInternetAccess() {
    if (getRole(employeeName) > 2) {
      realInternetAccess = new RealInternetAccess(employeeName);
      realInternetAccess.grantInternetAccess();
    } else {
      System.out.println("Employee doesn't have right to access");
    }
  }

  private int getRole(String employeeName) {
    if (accessRight.get(employeeName) != null) {
      return accessRight.get(employeeName);
    } else {
      return 0;
    }
  }
}
