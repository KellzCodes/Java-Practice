# For Each Loop

1. Start with this code

```
import java.util.ArrayList;

class MostExpensive {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double mostExpensive = 0;
    
    // Iterate over expenses
    
    
    System.out.println(mostExpensive);
    
  }
  
}
```

2. Let’s use a for-each loop to find the priciest item in ```expenses```.

	Build a for-each loop that iterates through each ```expense``` in ```expenses```. For now, leave the body of the loop empty.

3. Inside the for-each loop, check if ```expense``` is greater than ```mostExpensive```.

	If it is, set ```mostExpensive``` equal to expense.

Example solution can be found in the [MostExpensive.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/7.%20Loops/For%20Each%20Loop/MostExpensive.java) file