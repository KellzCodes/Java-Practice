public class ReverseString {
    public static void main(String[] args){
        String hello = "hello";
        char[] charArray = hello.toCharArray();
        System.out.println(charArray);
        reverseString(charArray);
        System.out.println(charArray);
    }

    public static void reverseString(char[] charArray) {
        char swapChar;
        for (int currentIndex = 0; currentIndex < (charArray.length) / 2; currentIndex++) {
            swapChar = charArray[currentIndex];
            charArray[currentIndex] = charArray[charArray.length - 1 - currentIndex];
            charArray[charArray.length - 1 - currentIndex] = swapChar;
        }
    }
}
