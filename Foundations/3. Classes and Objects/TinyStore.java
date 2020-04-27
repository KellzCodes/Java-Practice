public class TinyStore {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public TinyStore(String product, double initialPrice) {
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
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    TinyStore lemonadeStand = new TinyStore("Lemonade", 3.75);
    TinyStore cookieShop = new TinyStore("Cookies", 5);
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }
  
  // to string method
  public String toString(){
    return "This Store sells " + productType + " at a price of " + price + ".";
  }
}