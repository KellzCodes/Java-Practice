public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    // create a double variable and set it equal to the price plus the priceToAdd.
    double newPrice = price + priceToAdd;
    // set the instance field price to be newPrice
    price = newPrice;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    // increase the price at the lemonade stand by 1.5
    lemonadeStand.increasePrice(1.5);
    // print the lemonadeStand price
    System.out.println(lemonadeStand.price);
  }
}