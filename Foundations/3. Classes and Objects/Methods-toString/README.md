# Methods: toString()

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
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookies", 5);

  }
}
```

2. In the ```main()``` method, print the Objects ```lemonadeStand``` and ```cookieShop```. Are these printouts helpful in understanding these Objects?

3. Create a ```toString()``` method for the ```Store``` class. The method signature should say that it is ```public```, and that it returns a ```String```. It shouldn’t take in any parameters. For now, have it return the ```String``` ```"Store"```.

4. ```"Store"``` isn’t very helpful! What kind of Store is it?

	Change the ```toString()``` to return a ```String``` that describes this ```Store``` object.

	Your ```String``` should look like:

```
	This store sells productType at a price of price.
```

Where ```productType``` and ```price``` are the values in those instance fields. For example, if it was a hat store where hats cost 8, the ```String``` would say:

```
This store sells hats at a price of 8.
```

Example code can be found in the [Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Methods-toString/Store.java) file.


