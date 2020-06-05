# Iterating Over Arrays and ArrayLists

1. Start with this code

```
import java.util.ArrayList;

class CalculateTotal {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double total = 0;
    
    // Iterate over expenses
    
    
    System.out.println(total);
    
  }
  
}
```

2. Let’s use a ```for``` loop to iterate over ```expenses``` and sum up the ```total``` of all items.

	Start with the skeleton of a ```for``` loop:

	- Initialize a counter ```i``` with a value of ```0```.
	- The loop should run while ```i``` is less than the ```size()``` of ```expenses```.
	- Increment ```i```.

	You can leave the body empty for now.

3. Inside the ```for``` loop, add the item’s value to ```total```.

Example solution can be found in the [CalculateTotal.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/7.%20Loops/Iterating%20Over%20Arrays%20and%20ArrayLists/CalculateTotal.java) file