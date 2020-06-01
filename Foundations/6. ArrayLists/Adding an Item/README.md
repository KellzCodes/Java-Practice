# Adding an Item

1. Start with this code:

```
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    // Add more to-dos here:
    
    
    // Add to-dos to toDoList
    
    
    System.out.println(toDoList);
      
    
  }
  
}
```

2. We’ve created an empty ```ArrayList``` called ```toDoList```. Time to add some to-dos!

	Below where we’ve initialized ```toDo1```, initialize two new ```String``` variables: ```toDo2``` and ```toDo3```.

	Set their values to any tasks you like.

3. Use ```.add()``` to add ```toDo1```, ```toDo2```, and ```toDo3``` to ```toDoList```.

Example solution can be found in the [ToDos.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/6.%20ArrayLists/Adding%20an%20Item/ToDos.java) file.