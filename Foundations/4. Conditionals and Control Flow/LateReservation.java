public class LateReservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public LateReservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid Reservation!");
    }
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
    /*
    If their Reservation is not confirmed, 
    write Unable to confirm Reservation, 
    please contact restaurant. 
    Else write: Please enjoy your meal!
    */
    if(!isConfirmed){
      System.out.println("Unable to confirm Reservation, please contact restaurant.");
    } else{
      System.out.println("Please enjoy your meal!");
    }

  }
  
  public static void main(String[] args) {
    LateReservation partyOfThree = new LateReservation(3, 12, true);
    LateReservation partyOfFour = new LateReservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}