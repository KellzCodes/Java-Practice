# Conditional AND: &&

1. Start with this code:

```
public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    /* 
       Write conditional
       ~~~~~~~~~~~~~~~~~
       if restaurantCapacity is greater
       or equal to guestCount
       AND
       the restaurant is open:
         print "Reservation confirmed"
         set isConfirmed to true
       else:
         print "Reservation denied"
         set isConfirmed to false
    */
  }
  
  public void informUser() {
    System.out.println("Please enjoy your meal!");
  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}
```

2. Our ```Reservation``` class has the method ```confirmReservation()``` which validates if a restaurant can accomodate a given reservation.

	We need to build the conditional logic into ```confirmReservation()``` using two parameters:

	- ```restaurantCapacity```
	- ```isRestaurantOpen```
	
	Use an ```if-then-else``` statement:

	If ```restaurantCapacity``` is greater than or equal to ```guestCount``` **and** the restaurant is open, print ```"Reservation confirmed"``` and set ```isConfirmed``` to ```true```.

	```else``` print ```"Reservation denied"``` and set ```isConfirmed``` to ```false```.

Example code can be found in the [Reservation.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/Conditional%20AND/Reservation.java) file.