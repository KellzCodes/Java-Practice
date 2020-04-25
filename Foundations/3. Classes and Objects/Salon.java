public class Salon {
  // instance fields
  String productType;
  
  // constructor method
  public Salon(String product) {
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