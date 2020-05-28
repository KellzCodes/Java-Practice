# Get Element By Index

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
  
  public String getTopTopic(){
    
  }
  
  public void viewTopic(int topicIndex){
    
  }

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    System.out.println("The top topic is "+ sampleFeed.getTopTopic());
    
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(3);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(1);
    
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
  }
}

```

2. We have augmented the ```Newsfeed``` class to start with the ```topics``` array as an instance field.

	Fill in the ```getTopTopic()``` method to return the 0th index of the ```topics``` array.

3. But wait — we added more to the ```Newsfeed``` class. Now, each instance starts with an array of zeros called ```views``` as an instance field.

	Every time someone views a topic, we want to increment the value of the appropriate field in ```views```.

	For example, if someone views an ```"Opinion"``` piece, we want to increase the value of the 0th index of ```views``` from ```0``` to ```1```. If they view it again, we want to increase the value to ```2```.

	We have written a method signature for ```viewTopic()```, which takes in an ```int``` called ```topicIndex```.

	Inside the method, set the value of the ```views``` array at the index ```topicIndex``` to the current value plus ```1```.

Example solution can be found in the [Newsfeed.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/5.%20Arrays/Get%20Element%20By%20Index/Newsfeed.java) file