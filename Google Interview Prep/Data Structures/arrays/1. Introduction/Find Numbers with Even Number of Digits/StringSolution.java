public class StringSolution{
	public int findNumbers(int[] nums) {
        int even = 0;
        for(int i = 0; i < nums.length; i++){
            String digit = String.valueOf(nums[i]);
            if(digit.length() % 2 == 0){
                even++;
            }
        }
        return even;
    }
}