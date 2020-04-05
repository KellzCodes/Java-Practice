public class HappyNumber {
    public static void main(String args[]){
        // print whether the number is a happy number
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int number) {
        while(number != 1 && number != 4) {
            int current = number;
            number = 0;
            while(current > 0) {
                int digit = current % 10;
                number += digit * digit;
                current /= 10;
            }
        }
        return number == 1;
    }
}
