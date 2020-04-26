public class BigStore {
  // instance fields
  String productType;
  
  // constructor method
  public BigStore(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  public void greetCustomer(String customer){
    System.out.println("Welcome to the BigStore, " + customer + "!");
  }
  
  // main method
  public static void main(String[] args) {
    BigStore lemonadeStand = new BigStore("Lemonade");
    lemonadeStand.greetCustomer("Betty");
  }
}