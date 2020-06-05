# While Loop

1. Start with this code:

```
// Importing the Random library
import java.util.Random;

class LuckyFive {
  
  public static void main(String[] args) {
    
    // Creating a random number generator
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(6) + 1;

    // Repeat while roll isn't 5
    
    
  }
  
}
```

2. Take a look at **LuckyFive.java**. We’ve set up a random number generator that allows you to simulate the roll of a die.

	Create a ```while``` loop that will continue to loop while ```dieRoll``` is NOT ```5```.

	**Do NOT run your code yet** — you will get an infinite loop here because the value of ```dieRoll``` is never changed.

	Inside the loop, reset ```dieRoll``` with a new random value between ```1``` and ```6```.

	Now you can run the code.
	
3. Inside the ```while``` loop, above the line where you reset ```dieRoll```, print out ```dieRoll``` to the terminal.

Example solution can be found in the [LuckyFive.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/7.%20Loops/While%20Loop/LuckyFive.java) file