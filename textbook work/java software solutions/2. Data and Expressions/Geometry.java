//********************************************************************
// Geometry.java Author: Lewis/Loftus
//
// Demonstrates the use of an assignment statement to change the
// value stored in a variable.
//********************************************************************
 public class Geometry
 {
     //-----------------------------------------------------------------
     // Prints the number of sides of several geometric shapes.
     //-----------------------------------------------------------------
     public static void main(String[] args)
     {
       int sides = 7; // declaration with initialization
       System.out.println("A heptagon has " + sides + " sides.");
       sides = 10; // assignment statement
       System.out.println("A decagon has " + sides + " sides.");
       sides = 12;
       System.out.println("A dodecagon has " + sides + " sides.");
     }
 }
