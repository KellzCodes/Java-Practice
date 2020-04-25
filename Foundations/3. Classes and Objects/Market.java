public class Market {
  // declare instance fields here!
  String productType;
  
  // constructor method
  public Market() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method
  public static void main(String[] args) {
    System.out.println("This code is inside the main method.");
    
    Market lemonadeStand = new Market();
    
    System.out.println(lemonadeStand);
  }
}