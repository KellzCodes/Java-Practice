public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  // method with parameter
  public void greetCustomer(String customer){
    System.out.println("Welcome to the Store, " + customer + "!");
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    lemonadeStand.greetCustomer("Betty");
  }
}