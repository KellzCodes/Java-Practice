public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    // Create an instance of Store
    Store lemonadeStand = new Store("lemonade");
    
    // print instance field productType from lemonadeStand
    System.out.println(lemonadeStand.productType);
  }
}