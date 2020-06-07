# String Methods

1. Start with this code

```
public class TweetCounter {
  
	public static void main(String[] args) {
    
    String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";  

    // What's the character count?
    
    
  }
  
}
```

2. Twitter allows users to post tweets with a character limit. They capture the message the user enters as a ```String```, count the length of the message, and use its length to decide whether or not to let the user post the message. The limit is 280 characters.

	Let’s check ```tweet``` follow’s Twitter’s policy. Print out the number of characters in ```tweet``` using the ```length()``` method.

Example solution can be found in the [TweetCounter.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/8.%20String%20Methods/length/TweetCounter.java) file