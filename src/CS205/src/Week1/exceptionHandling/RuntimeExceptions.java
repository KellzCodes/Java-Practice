package Week1.exceptionHandling;

/*
* A runtime exception is an object of the class java.lang.RuntimeException
* or one of its subclasses and runtime exceptions are a form of unchecked
* exception (Does not need to be handled). Runtime exceptions are generally
* thrown because of bugs in the code.
*
* An attempt to divide by zero will cause an instance of java.lang.ArithmeticException
* to be thrown.
*
* java.lang.IndexOutOfBoundsException is thrown to indicate that an index of some
* sort (such as to an array, to a string, or to a vector) is out of range.
*
* java.util.InputMismatchException is thrown by a Scanner object when a token is
* retrieved that is not of the expected data type
*
* java.lang.NullPointerException is thrown when an application attempts to use
* null in a case where an object is required
* */

public class RuntimeExceptions {
    public static void main (String[] args){
        System.out.println(arithmeticException());
        System.out.println(indexOutOfBoundsException());
        Student steve = new Student();
        System.out.println(steve.getInitials());
        /*
        * Output:
        * Exception in thread "main" java.lang.NullPointerException
        * at Week1.exceptionHandling.Student.getInitials(Student.java:11)
        * at Week1.exceptionHandling.RuntimeExceptions.main(RuntimeExceptions.java:27)
        *
        * Reason: objects are automatically initialized to null
        * */
    }

    private static int indexOutOfBoundsException() {
        int[] a = new int[10];
        for (int i = 0; i <= 10; ++i){
            a[i] = 0;
        }
        return 1;
        /*
        * Output:
        * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
        * at Week1.exceptionHandling.RuntimeExceptions.indexOutOfBoundsException(RuntimeExceptions.java:40)
        * at Week1.exceptionHandling.RuntimeExceptions.main(RuntimeExceptions.java:25)
        *
        * Reason:
        * Index 10 is out of bounds because a does not have an element at index 10.
        * The index of the last element is 9.
        * */
    }

    public static int arithmeticException(){
        int a = 10;
        for(int i = 0; i < 10; ++i){
            System.out.print(a / i);
        }

        return 1;
        /*
        * Output:
        * Exception in thread "main" java.lang.ArithmeticException: / by zero
        * at Week1.exceptionHandling.RuntimeExceptions.arithmeticException(RuntimeExceptions.java:59)
        * at Week1.exceptionHandling.RuntimeExceptions.main(RuntimeExceptions.java:24)
        *
        * Reason: i equals zero at the first iteration of the for loop. This will cause
        * the code to attempt to divide a number by zero
        * */
    }

}


