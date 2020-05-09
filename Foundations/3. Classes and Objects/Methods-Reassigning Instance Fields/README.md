# Reassigning Instance Fields

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
    
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    
  }
}
```

2. We have added a ```price``` instance field to the Store class.

	However, to combat inflation costs, we’ve found ourselves increasing the price of our product over and over. We’ve added an empty ```increasePrice()``` method to the Store class. It takes a ```double``` parameter ```priceToAdd```.

	Inside of the ```increasePrice()``` method, create a variable called ```newPrice```. Declare it to be a ```double```, and set it equal to the ```price``` plus the ```priceToAdd```.

3. Inside of ```increasePrice()```, set the instance field price to be ```newPrice```!

4. In the ```main()``` method, increase the price at the lemonade stand by ```1.5```. Then, print the ```lemonadeStand.price``` to see how it has changed!

Example code can be found in the [Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Methods-Reassigning%20Instance%20Fields/Store.java) file.