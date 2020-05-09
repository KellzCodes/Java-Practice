# Methods: Defining Methods

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
  
  // main method
  public static void main(String[] args) {
    
  }
}
```

2.  In between the constructor and the ```main()``` method, add a method called ```advertise()``` to the ```Store``` class. It should be accessible by other classes, and should have no output.

	You can leave the body of the method empty.

3. Inside the ```advertise()``` method, type two print statements. They should result in the printouts:
	> "Come spend some money!"
	> "Selling productType!"

	where ```productType``` is replaced with the value in the variable ```productType```.

	However, we’re not going to see these Strings printed out yet!

Example code can be found in the [Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Methods-Defining%20Methods/Store.java) file.