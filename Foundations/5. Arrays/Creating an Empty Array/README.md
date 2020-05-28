# Creating an Empty Array

1. Start with this code: 

```
import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  String[] favoriteArticles;
  
  public Newsfeed(){
    // Initialize favoriteArticles here:
    
  }
  
  public void setFavoriteArticle(int favoriteIndex, String newArticle){
    // Add newArticle to favoriteArticles:
    
    
  }
    
  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
    sampleFeed.setFavoriteArticle(0, "Oil News");
    
    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
  }
}

```

2. We now want a ```Newsfeed``` to be able to keep track of a user’s top 10 articles.

	We’ve declared a ```String``` array called ```favoriteArticles```, but we haven’t initialized it yet.

	In the constructor for ```Newsfeed```, set ```favoriteArticles``` to be a new empty ```String``` array of size 10.

3. Inside the method ```setFavoriteArticle()```, set the value of the ```favoriteArticles``` array at index ```favoriteIndex``` to be the value of ```newArticle```.

	For example, if I called ```setFavoriteArticle(2, "Celebrity Hands Throughout the Decades")```, the value of ```favoriteArticles``` at index ```2``` would be set to ```"Celebrity Hands Throughout the Decades"```.

Example code can be found in the [Newsfeed.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/5.%20Arrays/Creating%20an%20Empty%20Array/Newsfeed.java) file.