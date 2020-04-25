public class SmallStore {
  // instance fields
  String productType;
  
  // constructor method
  public SmallStore(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
		System.out.println("Selling " + productType + "!");
    System.out.println("Come spend some money!");
  }
  
  // main method
  public static void main(String[] args) {
    SmallStore lemonadeStand = new SmallStore("Lemonade");
    lemonadeStand.advertise();
    lemonadeStand.advertise();
    lemonadeStand.advertise();
  }
}