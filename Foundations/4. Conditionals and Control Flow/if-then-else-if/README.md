# if-then-else-if 

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
	 	// declare conditional statement here
    
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

2. We need to calculate the shipping costs for our orders.

	There’s a new instance field, ```String shipping```, that we use to calculate the cost.

	Use a chained ```if-then-else``` to check for different values within the ```calculateShipping()``` method.

	When the ```shipping``` instance field equals ```"Regular"```, the method should return ```0```.

	When the ```shipping``` instance field equals ```"Express"```, the method should return ```1.75```.

	Else the method should return ```.50```.

Example code can be found in the [Order.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/if-then-else-if/Order.java) file.