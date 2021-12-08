//********************************************************************
// Echo.java Author: Lewis/Loftus
//
// Demonstrates the use of the nextLine method of the Scanner class
// to read a string from the user.
//********************************************************************
import java.util.Scanner;

public class Echo {
    //-----------------------------------------------------------------
    // Reads a character string from the user and prints it.
    //-----------------------------------------------------------------
    public static void main(String[] args){
        String message;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        message = scan.nextLine();
        System.out.println("You entered: \"" + message + "\"");
    }
}
