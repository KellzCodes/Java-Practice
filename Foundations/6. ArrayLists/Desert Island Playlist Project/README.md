# Desert Island Playlist Project Project

1. Start with this code:

```
import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    
  }
  
}
```

2. We’ve provided you with **Playlist.java**.

	- Since you’re working with ```ArrayList```s, import ```ArrayList``` from ```java.util```.
	- Create a ```Playlist``` class with a ```main()``` method.

3. Inside ```main()```, create a new ```ArrayList``` called ```desertIslandPlaylist``` that can hold ```String``` values.

4. Time to add songs!

	Use ```add()``` to add several (more than five) of your favorite songs to ```desertIslandPlaylist```.

5. Check out your personally curated selection of music by printing ```desertIslandPlaylist``` to the terminal. Then run your code.

6. Yikes! It turns out you can only bring five songs now… You’ll need to make some cuts.

	First, check the number of songs on your playlist using ```size()```. Print the number to the terminal.

7. Now, you’ll need to make some tough decisions. Remove songs from your playlist using ```remove()``` until you only have five songs left.

	You can check the size of your playlist along the way using ```.size()``` and print out the playlist to see the current songs remaining.

8. You’ve grown a little bored of the playlist order. Fortunately, you can change up the ```ArrayList```. Pick out two songs whose order you’d like to swap.

	This part is a bit trickier, so start by reading the steps you’ll take to make the switch:

	1. Get the indices of the songs you want to swap.
	2. Create a temporary variable to store the value of song ```a```. (We’ll call the songs ```a``` and ```b``` here.)
	3. Rewrite the value at the index of ```a``` to the value of ```b```.
	4. Rewrite the value at the index of ```b``` to the value of the temporary variable.

9. Use ```indexOf()``` to get the indices of the two songs you want to swap in ```desertIslandPlaylist```. (You can store these as variables or print them out.)

10. Create a new ```String``` variable called ```tempA``` and initialize it with the value of song ```a```.

11. Call ```set()``` on ```desertIslandPlaylist``` to rewrite the song at the index of ```a``` with song ```b```. (You’re adding song ```b``` where ```a``` was in the playlist.)

	You can print the playlist and run the code. Song ```b``` should appear twice in the playlist now.

12. Ready to complete the swap?

	Use ```set()``` again on ```desertIslandPlaylist```. This time, give the original index of song ```b``` the value of your temporary variable (which is really song ```a```). In other words, you’re putting song ```a``` where song ```b``` used to be.

	Print the final playlist to see the songs swapped from their original positions.

13. Nice work using ```ArrayList``` to build your desert island playlist!

Example solution can be found in the [Playlist.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/6.%20ArrayLists/Desert%20Island%20Playlist%20Project/Playlist.java) file