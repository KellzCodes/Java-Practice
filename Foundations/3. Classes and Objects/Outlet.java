public class Outlet {
  // instance fields
  String productType;
  
  // constructor method
  public Outlet(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    // Create an instance of Outlet
    Outlet lemonadeStand = new Outlet("lemonade");
    
    // print instance field productType from lemonadeStand
    System.out.println(lemonadeStand.productType);
  }
}