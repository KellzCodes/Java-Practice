# Methods: Returns

1. Start with this code:

```
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
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);

  }
}
```

2. We want to have a method that returns the price plus tax.

  Define a method called ```getPriceWithTax()``` that is intended to return the price plus the tax. It should take in no parameters and return a ```double```.

  You can leave the body of the method empty for now. **Note**: the code will have an error until we return the correct type from the method, which we will do in the next step.

3. Inside the ```getPriceWithTax()``` method, create a ```double``` variable ```totalPrice``` that is equal to ```price + price * 0.08```. ```0.08``` is the tax applied to the price.

  Then, return ```totalPrice```.

4. Example code can be found in the [Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Methods-Returns/Store.java) file.