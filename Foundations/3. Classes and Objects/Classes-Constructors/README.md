# Classes: Constructors

Demonstrates the use of a constructor

1. Start with this code:

```
public class Store {
  
  // new method: constructor!
  public Store() {

  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    
    // create the instance below
    
    // print the instance below
    
  }
}
```

2. Let’s explore how code execution moves around the file with two methods.

	Add a print statement inside our ```Store``` constructor with the message: ```I am inside the constructor method.```

	We’ll see this message whenever we create an instance of ```Store``` by calling the constructor.

3. We did not see our constructor message printed because **we haven’t run the code inside the constructor**.

	Inside ```main()```, create an instance of ```Store``` called ```lemonadeStand```. Don’t forget the ```new``` keyword!

	We should see the constructor message.

4. Inside ```main()```, print ```lemonadeStand``` to see how Java represents this instance.

	Review the order of the printed messages:

	1. Running the program invokes ```main()```
	2. We create an instance so we move from ```main()``` to ```Store()```
	3. The code inside ```Store()``` runs
	4. When ```Store()``` finishes execution, we **return** to ```main()```

Example code can be found in the [Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Classes-Constructors/Store.java) file.