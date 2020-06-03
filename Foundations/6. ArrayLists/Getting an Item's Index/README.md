# Getting an Item's Index

1. Start with this code:

```
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("listen to Dr. Watson for amusement");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    sherlocksToDos.remove("visit the crime scene");
    
    // Calculate to-dos until case is solved:
    
      
    // Change the value printed:
    System.out.println("PRINT THE ANSWER HERE");

  }
  
}
```

2. After visiting the crime scene, the ever-impatient Dr. Watson wants to know how many to-dos are left until Sherlock solves the case.

	To help Dr. Watson figure this out, use ```indexOf()``` to determine where in the to-do list ```"solve the case"``` is.

	Print this information out. That’s the number of to-dos remaining before Sherlock reaches ```"solve the case"```.

Example solution can be found in the [ToDos.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/6.%20ArrayLists/Getting%20an%20Item's%20Index/ToDos.java) file