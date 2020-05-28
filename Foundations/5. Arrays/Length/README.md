# Length

1. Start with this code:

```
import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
  public Newsfeed(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  public int getNumTopics(){
    
  }
  
  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
   
  }
}

```

2. In the method ```getNumTopics()```, return the length of the ```topics``` array.

Example solution can be found in the [Newsfeed.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/5.%20Arrays/Length/Newsfeed.java) file.