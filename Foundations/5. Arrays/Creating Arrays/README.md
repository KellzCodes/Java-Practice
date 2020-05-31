# Creating Arrays

1. Start with this code:

```
public class Newsfeed {
  
  
  public Newsfeed(){
    
  }
  
  // Create getTopics() below:
  

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    /*
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);
    */
  }
}

```

2. We have an empty ```Newsfeed``` class that does not store anything yet.

	First, make a method called ```getTopics()```, which:

	- is ```public```
	- returns a ```String``` array
	- does not take any parameters

	For now, leave the method empty.

3. Inside the ```getTopics()``` method, create a ```String``` array called ```topics``` and set it equal to an array containing these elements, in order:
	> Opinion
	> Tech
	> Science
	> Health

	Then, return ```topics``` from the method!

4. Uncomment the lines in the main method to see how the ```getTopics()``` method works on a ```Newsfeed``` instance.

Example solution can be found in the [Newsfeed.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/5.%20Arrays/Creating%20Arrays/Newsfeed.java) file