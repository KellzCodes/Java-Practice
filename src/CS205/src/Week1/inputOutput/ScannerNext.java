package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerNext {
   public static void main(String[] args) throws FileNotFoundException {
       File file = new File("input.txt");
       Scanner scanner = new Scanner(file);
       String s1 = scanner.next(); // s1 is assigned to Pebbles
       System.out.println(s1);
       String s2 = scanner.next(); // s2 is assigned to Flintstone
       System.out.println(s2);
       int x = scanner.nextInt(); // x is assigned to 1
       System.out.println(x);
       double y = scanner.nextDouble(); // y is assigned to 2.2
       System.out.println(y);
       scanner.nextLine(); // Advance scanner to beginning of next line
       String s3 = scanner.nextLine();
       System.out.println(s3);
       scanner.close(); // s3 is assigned to "This is a line of text"
   }
}
