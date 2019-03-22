package Week1.exceptionHandling;

/*
 * A try block may have an associated finally clause:
 *
 * A finally block contains Code that is always executed whether or not an exception
 * occurs. The idea is that the code in the try
 * block may acquire some resource which needs to be released
 * before execution continues
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FinallyClause {
    public static void main(String[] args){
        // out is declared here so it will be in scope in the finally clause
        PrintWriter out = null;
        // Try to send some stuff to an output file named output.txt
        try{
            out = new PrintWriter(new File("Week1/exceptionHandling/output.txt"));
            out.println("blah blah blah");
            out.println("blah blah blah");
        } catch(FileNotFoundException e){
            // Code that handles exception
            e.printStackTrace();
        } finally {
            /*
            * This code will be executed whether or not the code in the try block
            * throws an exception. This code guarantees that the output file will
            * be closed.
            * */
            if(out != null){ // out will be nonull if the PrintWriter succeeded
                out.close();
            }
        }
    }
}
