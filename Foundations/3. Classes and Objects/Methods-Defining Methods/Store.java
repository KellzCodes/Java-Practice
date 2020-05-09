public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise(){
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType + "!");
  }
  
  // main method
  public static void main(String[] args) {
    
  }
}