# Changing a Value

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
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Set each to-do below:
    
    
    System.out.println("Sherlock's to-do list:");
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println("Poirot's to-do list:");
    System.out.println(poirotsToDos.toString());
  }
  
}
```

2. Modify ```sherlocksToDos``` so that the value at ```"play violin"``` becomes ```"listen to Dr. Watson for amusement"```.

3. Modify ```poirotsToDos``` so that the value at ```"trim mustache"``` becomes ```"listen to Captain Hastings for amusement"```.

Example solution can be found in the [ToDos.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/6.%20ArrayLists/Changing%20a%20Value/ToDos.java) file.