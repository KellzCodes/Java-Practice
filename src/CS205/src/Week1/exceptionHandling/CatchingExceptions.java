package Week1.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
* To write an exception handler for a checked (or unchecked) exception, we
* write a try/catch block
* */

public class CatchingExceptions {
    public static void main(String[] args){
        try{
            /*
            * Code to be executed that may throw an exception.
            * Some resource is acquired here and this resource
            * must be released before someFunction() returns
            * */
            someFunction();
        } catch (FileNotFoundException e){
            // code that handles the exception
            e.printStackTrace();
        }

    }

    private static void someFunction() throws FileNotFoundException{
        /*
         * If not handled the output will be
         * Error:(15, 24) java: unreported exception java.io.FileNotFoundException;
         * must be caught or declared to be thrown
         * */
        Scanner in = new Scanner(new File("does-not-exist.txt"));


    }
}
