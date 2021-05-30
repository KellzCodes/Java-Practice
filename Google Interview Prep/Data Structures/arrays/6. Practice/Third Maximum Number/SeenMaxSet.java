class Solution {

    public int thirdMax(int[] nums) {    

        Set<Integer> seenMaximums = new HashSet<>();
        
        for (int i = 0; i < 3; i++) {
            Integer curMaximum = maxIgnoringSeenMaximums(nums, seenMaximums);
            if (curMaximum == null) {
                return Collections.max(seenMaximums);
            }
            seenMaximums.add(curMaximum);
        }

        return Collections.min(seenMaximums);
    }


    private Integer maxIgnoringSeenMaximums(int[] nums, Set<Integer> seenMaximums) {
        
        Integer maximum = null;
        for (int num : nums) {
            if (seenMaximums.contains(num)) {
                continue;
            }
            if (maximum == null || num > maximum) {
                maximum = num;
            }
        }
        return maximum;
    }
}
