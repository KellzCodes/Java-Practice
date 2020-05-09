# Methods: Calling Methods

1. Start with this code:

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
		System.out.println("Selling " + productType + "!");
    System.out.println("Come spend some money!");
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    
  }
}
```

2. Call the ```advertise()``` method on the ```lemonadeStand``` object in the ```main()``` method and see what the output is!

3. Now, call the ```advertise()``` method on the ```lemonadeStand``` object two more times. It should be called in the ```main()``` method three times total.

Example code can be found in the [Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Methods-Calling%20Methods/Store.java) file.