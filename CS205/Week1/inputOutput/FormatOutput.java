package inputOutput;

/*
* The java.io.PrintStream (System.out is an instance of PrintStream)
* and java.io.PrintWriter classes contain a method named printf()
* that can be used to format output.
 *
 * The syntax of printf() is:
 *      printf(String format, [value, ...]
 * where format is a String that contains format specifiers
 * that tell printf() how to format the values being printed.
 * Common types are:
 * d    formats a decimal integer (int)
 * f    formats a floating point number (double)
 * s    formats a string
 * A format specifier has this syntax:
 *      1. It starts with %
 *      2. The % is followed by optional format flags.
 *         A hyphen - causes the value to be printed left-justified
 *         in a field of a specific width; if - is not present, the
 *         value is printed right-justified in the field.
 *         A comma , causes commas to be displayed in the printed
 *         number.
 *      3. If a value is to be printed in a field of a specific width,
 *         the field width appears next. For controlling the number of
 *         digits after the decimal point in a floating point number, the
 *         syntax is width.<number of digits>
 *      4. It ends with format type
 *
 **/
public class FormatOutput {
    public static void main(String[] args){
        int x = 123, y = 456789;
        double a = 3.1743985798, b = 4.4389;
        String first = "Wilma", last = "Flintstone";
        System.out.printf("%6d %-,8d\n", x, y);
        // writeOutputFile:    123  456,789
        System.out.printf("%5.2f %-7.4f\n", a, b);
        // writeOutputFile:  3.17 4.4389
        System.out.printf("first = [%s] last = [%12s]\n", first, last);
        // writeOutputFile: first = [Wilma] last = [  Flintstone]
    }
}
