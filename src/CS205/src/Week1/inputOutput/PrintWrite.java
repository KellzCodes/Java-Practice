package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
* Data are written to the output file by calling print() and
* println() on the PrintWriter. After all output has been
* written, the file must be closed by calling close() on
* the PrintWriter
* */

public class PrintWrite {
    public static void main(String[] args) throws FileNotFoundException {
        int x = 20;
        double y = 3.14159265;
        char ch1 = '$', ch2 = 'A';
        String s1 = "Fred", s2 = "Flintstone";
        File file = new File("C:\\Users\\kelda\\Documents\\Java-Algorithm-Practice\\src\\CS205\\src\\inputOutput\\output.txt");
        PrintWriter out = new PrintWriter(file);
        out.print(x + " " + y);
        out.println(ch1);
        out.println(ch2 + " " + s2);
        out.close();
    }
}
