# Instance Fields

Demonstrates use of instance fields

1. Start with this code:

```
public class Store {
  // declare instance fields here!
  
  
  // constructor method
  public Store() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method
  public static void main(String[] args) {
    System.out.println("This code is inside the main method.");
    
    Store lemonadeStand = new Store();
    
    System.out.println(lemonadeStand);
  }
}
```

2. Add some state to our ```Store``` class.

	Declare a ```String``` instance field for ```productType```.

Example code can be found in the [Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Classes-Instance%20Fields/Store.java) file.