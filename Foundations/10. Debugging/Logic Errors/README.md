# Logic Errors

1. Start with this code

```
public class Debug {

  public static void main(String[] args) {
    
    int steps = 10;
    
    for (int i = 0; i <= steps; i++) {
      
      System.out.println("Step #" + i);
      
    }
    
  }
  
}
```

2. Run **Debug.java**. There should be no error messages.

	But the program is supposed to output steps from #1 - #10. The program is somehow starting from 0…

	Find the logic error.

Example solution can be found in the [Debug.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/10.%20Debugging/Logic%20Errors/Debug.java) file