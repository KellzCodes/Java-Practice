package Week1.inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExamAvg {
    public static void main(String[] args) throws FileNotFoundException {
        // Open "scores-in.txt" for reading
        Scanner in = new Scanner(new File("Week1/inputOutput/text-files/scores-in.txt"));

        // Open "scores-out.txt" for writing
        PrintWriter out = new PrintWriter(new File("Week1/inputOutput/text-files/scores-out.txt"));

        // Print the column headers
        out.println("Exam 1   Exam 2    Exam 3    Exam Avg");
        out.println("------   ------    ------    --------");

        /*
        * Read tge exam scores from "scores-in.txt, calculate the exam average,
        * and print the formatted output to the output file
        * */
        while (in.hasNext()){
            int e1 = in.nextInt();
            int e2 = in.nextInt();
            int e3 = in.nextInt();
            double avg = (e1 + e2 + e3) / 3.0;
            out.printf("%6d %6d %6d %8.1f\n", e1, e2, e3, avg);
        }

        // Close the input file
        in.close();

        // Close the output file
        out.close();
    }
}
