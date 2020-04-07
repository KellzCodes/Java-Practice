public class MoveZeroes {
    public static void main (String[] args){
        int[] nums = {0,1,0,3,12};
    }

    public static void moveZeroes(int[] nums) {
        int i = -1, j = 0;
        while (++i < nums.length) if (nums[i] != 0) nums[j++] = nums[i];
        while (j < nums.length) nums[j++] = 0;
    }
}
