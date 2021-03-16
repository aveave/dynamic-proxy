public class RealInternetAccess implements OfficeInternetAccess {

  private String employeeName;

  public RealInternetAccess(String employeeName) {
    this.employeeName = employeeName;
  }

  public void grantInternetAccess() {
    System.out.println("Grant internet acces for employee " + employeeName);
  }
}
