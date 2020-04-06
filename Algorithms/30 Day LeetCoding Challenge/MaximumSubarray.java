public class MaximumSubarray {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int number = nums.length;
        int maximum =  nums[0];
        int sum = nums[0];
        for(int i = 1;i < number;i++){
            if(sum < 0)
                sum = nums[i];
            else
                sum = sum + nums[i];
            maximum = Math.max(sum,maximum);
        }
        return maximum;
    }
}