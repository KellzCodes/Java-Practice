package Week1.exceptionHandling;

/*
* Checked exceptions must be thrown or handled.
*
* One type of checked expression is java.io.FileNotFoundException which is the
* superclass for all exceptions that arise because of failed input/output operations.
* */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowingExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        someFunction();
        /*
        * The java virtual machine will terminate the program then print a
        * stack trace
        * */
    }

    private static void someFunction() throws FileNotFoundException {
        /*
        * If not handled the output will be
        * Error:(15, 24) java: unreported exception java.io.FileNotFoundException;
        * must be caught or declared to be thrown
        * */
        Scanner in = new Scanner(new File("does-not-exist.txt"));


    }
}
