public class EarlyReservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public EarlyReservation(int count, int capacity, boolean open) {
    /*
    If count is less than 1 OR greater than 8 
    we want to write the following message: 
    Invalid Reservation!
    */
    if(count < 1 || count > 8){
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
    System.out.println("Please enjoy your meal!");
  }
  
  public static void main(String[] args) {
    EarlyReservation partyOfThree = new EarlyReservation(3, 12, true);
    EarlyReservation partyOfFour = new EarlyReservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}