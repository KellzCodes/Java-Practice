public class Factorial{
    public static void main(String[] args){
        long l = (long) 4.123848475;
        long newLong = fact(l);
        System.out.println(newLong);
    }

    public static long fact(long n){
        // The base case is n = 1 and since 1! = 1, we return 1
        if (n == 1) {
            return 1;
        }
        // Otherwise, n > 1 so we first determine (n-1)! and then
        // multiply n by (n-1)!
        else{
            return n * fact(n - 1);
        }
    }
}