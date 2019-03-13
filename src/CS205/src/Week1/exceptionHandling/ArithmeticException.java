package Week1.exceptionHandling;

/*
* A runtime exception is an object of the class java.lang.RuntimeException
* or one of its subclasses and runtime exceptions are a form of unchecked
* exception (Does not need to be handled). Runtime exceptions are generally
* thrown because of bugs in the code. For example, an attempt to divide
* by zero will cause an instance of java.lang.ArithmeticException to be thrown.
 * */

public class ArithmeticException {
    public static void main (String[] args){
        new ArithmeticException(); // line 13
    }

    public ArithmeticException(){
        int a = 10;
        for(int i = 0; i < 10; ++i){
            System.out.print(a / i); // line 19
        }
    }
}

/*
* Output:
*
* Exception in thread "main" java.lang.ArithmeticException: / by zero
*    at Week1.exceptionHandling.ArithmeticException.<init>(ArithmeticException.java:19)
*    at Week1.exceptionHandling.ArithmeticException.main(ArithmeticException.java:13)
*
* Reason: the i in the for loop starts at zero which will cause the code to attempt
* to divide a by zero.
* */
