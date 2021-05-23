class DivideBy10Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            int digit = 0;
            int number = n;
            while (number > 0) {
                number /= 10;
                digit++;
            }
            if(digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
