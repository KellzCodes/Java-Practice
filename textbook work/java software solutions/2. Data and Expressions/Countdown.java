//********************************************************************
// Countdown.java Author: Lewis/Loftus
//
// Demonstrates the difference between print and println.
//********************************************************************
public class Countdown
 {
   //-----------------------------------------------------------------
   // Prints two lines of output representing a rocket countdown.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
     System.out.print("Three... ");
     System.out.print("Two... ");
     System.out.print("One... ");
     System.out.print("Zero... ");
     System.out.println("Liftoff!"); // appears on first output line
     System.out.println("Houston, we have a problem.");
   }
 } 
