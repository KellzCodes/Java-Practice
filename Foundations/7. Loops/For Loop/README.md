# For Loop

1. Start with this code

```
class Coffee {
  
  public static void main(String[] args) {
    
    int cupsOfCoffee = 1;
    
    while (cupsOfCoffee <= 100) {
      
      System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
      cupsOfCoffee++;
      
    }
    
  }
  
}
```

2. We’ve provided a ```while``` loop that loops from ```1``` to ```100``` outputting a string on each iteration. Refactor (rewrite) this code as a ```for``` loop.

	Remember, the syntax of a for loop looks like:

```
for (int i = 0; i < 5; i++) {

  // code that will run

}
```

Example solution can be found in the [Coffee.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/7.%20Loops/For%20Loop/Coffee.java) file