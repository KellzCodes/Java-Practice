# ArrayList Size

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
    
    // Print the size of each ArrayList below:
    
      
    // Print the name of the detective with the larger to-do list:
    
  }
  
}
```

2. Detectives do a lot to solve a case. But who has more to do?

	Print out the size of each detective’s to-do ```ArrayList```:

	- ```sherlocksToDos``` for Sherlock Holmes
	- ```poirotsToDos``` for Hercules Poirot

3. So who has more to do? Print the name of the detective whose to-do list is longer. Was it Sherlock or Poirot?

Example solution can be found in the [ToDos.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/6.%20ArrayLists/ArrayList%20Size/ToDos.java) file.