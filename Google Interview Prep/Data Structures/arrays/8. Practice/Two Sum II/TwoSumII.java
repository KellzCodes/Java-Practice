class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j= numbers.length-1;
        while(i<j) {
            if(numbers[i]+numbers[j]==target)
                break;
            else if(numbers[i]+numbers[j] < target)
                i++;
            else 
                j--;
        }
        if(i>=j) return new int[]{-1,-1};
        return new int[]{i+1,j+1} ;
    }
}
