public class MediumStore {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public MediumStore(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double totalPrice = price + price * 0.08;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    MediumStore lemonadeStand = new MediumStore("Lemonade", 3.75);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);
  }
}