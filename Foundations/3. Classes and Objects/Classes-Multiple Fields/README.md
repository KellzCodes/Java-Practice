# Classes: Multiple Fields

Multiple instance fields

1. Start with this code:

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    
  }
}
```

2. Add two new instance fields for ```Store```.

	```inventoryCount``` of type ```int```. ```inventoryPrice``` of type ```double```.

3. Update the ```Store``` constructor method with the new parameters.

	The parameters should be ```product```, ```count```, and ```price```, **in that order**.

	You must use that order and include the types for each parameter.

	For example, ```product``` is of type ```String``` because that value is assigned to the instance field ```String productType```.

4. In the body of the ```Store``` constructor, assign the parameter values to the appropriate instance fields.

5. Inside ```main()```, create an instance of ```Store``` called ```cookieShop```.

	```cookieShop``` has ```"cookies"``` as the product.

	```cookieShop``` has ```12``` cookies to sell and each cookie costs ```3.75```.

Example code can be found in the [Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Classes-Multiple%20Fields/Store.java) file.