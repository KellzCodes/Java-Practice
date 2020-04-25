public class Mart {
  
  // new method: constructor!
  public Mart() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    
    // create the instance below
    Mart lemonadeStand = new Mart();
    
    // print the instance below
    System.out.println(lemonadeStand);
  }
}