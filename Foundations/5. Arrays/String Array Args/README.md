# String[] args

1. Start with this code:

```
import java.util.Arrays;

public class Newsfeed {
  
  String[] topics;
  
  public Newsfeed(String[] initialTopics) {
		topics = initialTopics;
  }
  
  public static void main(String[] args) {
		Newsfeed feed;
    if (args[0].equals("Human")) {
      
      //topics for a Human feed:
      String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
			feed = new Newsfeed(humanTopics);
      
    } else if(_____________) {
      
      //topics for a Robot feed:
      String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
      feed = new Newsfeed(robotTopics);
      
    } else {
      String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
      feed = new Newsfeed(genericTopics);
    }
        
    System.out.println("The topics in this feed are:");
    System.out.println(Arrays.toString(feed.topics));
  }
}

```

2. We want to give the user an option to make a ```Newsfeed``` object for robots or for humans. We will take either ```"Robot"``` or ```"Human"``` as an argument to the ```main()``` method when the **Newsfeed.java** file is run.

	- If the ```args``` array holds ```"Human"```, we will initialize the feed with human topics.
	- If the ```args``` array holds ```"Robot"```, we will initialize the feed with robot topics.

	Replace the blank in the conditional statement to reflect this expected control flow.

3. In the terminal, run the **Newsfeed.java** file with the argument ```"Robot"```.

	Now, run the **Newsfeed.java** file with the argument ```"Human"```.

Example solution can be found in the [Newsfeed.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/5.%20Arrays/String%20Array%20Args/Newsfeed.java) file.