public class Debug {

  public static void main(String[] args) {
    
    int width = 20; // The error was a zero on this line
    int length = 40;
    
    int ratio = length / width; // A number cannot be divided by zero
    
    System.out.println(ratio);
    
  }
  
}