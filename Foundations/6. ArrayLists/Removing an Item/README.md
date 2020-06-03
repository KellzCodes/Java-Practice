# Removing an Item

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
    
    // Remove each to-do below:
    
    
      
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println(poirotsToDos.toString());
  }
  
}
```

2. Sherlock Holmes and Hercules Poirot have each already visited their respective crime scenes.

	Remove ```"visit the crime scene"``` from ```sherlocksToDos``` and ```poirotsToDos``` using ```remove()```.

	Moreover, Sherlock Holmes has also gotten some violin playing done.

	So you can remove ```"play violin"``` from ```sherlocksToDos``` as well.

Example solution can be found in the [ToDos.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/6.%20ArrayLists/Removing%20an%20Item/ToDos.java) file.