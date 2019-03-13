package arrayList;

/*
* Reads a file named "ints-in.txt" containing integers and writes the integers to
* "ints-out.txt" in reverse order
* */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) throws FileNotFoundException {
        // Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<>();

        // Open "ints-in.txt" for reading
        Scanner scanner = new Scanner(new File("ints-in.txt"));

        // Read the integers from "ints-in.txt" placing them in the ArrayList
        while(scanner.hasNext()){
            list.add(scanner.nextInt());
        }

        // Close the input file
        scanner.close();

        // Open "ints-out.txt" for writing
        PrintWriter out = new PrintWriter(new File("ints-out.txt"));

        /*
        * Walk through the ArrayList in reverse order, printing each element
        * to the output file.
        * */
        for(int i = list.size() - 1; i >= 0; --i){
            out.println(list.get(i));
        }

        // Close the output file.
        out.close();
    }
}
