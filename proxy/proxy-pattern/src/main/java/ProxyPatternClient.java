public class ProxyPatternClient {

  public static void main(String[] args) {
    OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("Evgenii");
//    OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("Bon Jovi");
    officeInternetAccess.grantInternetAccess();
  }

}
