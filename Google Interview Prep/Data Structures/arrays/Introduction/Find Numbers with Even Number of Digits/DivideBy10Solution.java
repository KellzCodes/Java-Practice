class DivideBy10Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int digit = 0;
        for (int n: nums){
            while(n > 0){
                n /= 10;
                digit++;
            }
            
            if(digit % 2 == 0){
                count++;
            }
        }
        
        return count;
    }
}