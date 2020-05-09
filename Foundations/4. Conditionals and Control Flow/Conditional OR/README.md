
# Conditional OR: ||

Shows how to use Conditional OR operator

1. Start with this code:

```
public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    // Write conditional statement below
    
    
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
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

2. Let’s write a message inside the ```Reservation()``` constructor that warns against bad input.

	Our restaurants can’t seat parties of more than ```8``` people, and we don’t want reservations for ```0``` or less because that would be silly.

	Inside ```Reservation()```, write a conditional that uses ```||```.

	If ```count``` is less than ```1``` **OR** greater than ```8``` we want to write the following message: ```Invalid reservation!```.

Example code can be found in the [Reservation.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/Conditional%20OR/Reservation.java) file.