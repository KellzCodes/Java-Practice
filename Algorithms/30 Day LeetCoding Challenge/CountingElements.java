public class CountingElements {
    public static void main(String[] args){
        int[] nums = {1,3,2,3,5,0};
        System.out.println(countElements(nums));
    }
    public static int countElements(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == arr[i] + 1){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
