# Switch Statement

1. Start with this code:

```
public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
    double shippingCost;
	 	// declare switch statement here
    
    
    return shippingCost;
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}

```

2. We’ll rewrite the ```calculateShipping()``` method so it uses a ```switch``` statement instead.

	There’s an uninitialized variable ```shippingCost``` in ```calculateShipping()```. Assign the correct value to ```shippingCost``` using a ```switch``` statement:

	We’ll check the value of the instance field ```shipping```.

	- When ```shipping``` matches ```"Regular"```, ```shippingCost``` should be ```0```.
	- When ```shipping``` matches ```"Express"```, ```shippingCost``` should be ```1.75```.
	- The default should assign ```.50``` to ```shippingCost```.
	
	**Make sure the method returns ```shippingCost``` after the ```switch``` statement.**

Example code can be found in the [Order.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/switch%20statement/Order.java) file.