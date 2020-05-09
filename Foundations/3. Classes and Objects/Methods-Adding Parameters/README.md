# Adding Parameters

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
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    
  }
}
```

2. Add a method to the Store class called ```greetCustomer()```. It should be accessible by other classes, and return no output. For now, have it take no parameters and leave the body of the method empty.

3. Modify the ```greetCustomer()``` method so that it accepts a String parameter called ```customer```.

4. Inside of the ```greetCustomer()``` method, add a print statement to print:
```
	"Welcome to the store, " + customer + "!"
```

5. Inside the ```main()``` method, call the ```greetCustomer()``` method on the ```lemonadeStand``` object. Pass in a ```String``` argument of your choice!

Example code can be found in the [Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Methods-Adding%20Parameters/Store.java) file.