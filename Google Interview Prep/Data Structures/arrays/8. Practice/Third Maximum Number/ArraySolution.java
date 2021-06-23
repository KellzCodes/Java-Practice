class Solution {
    
    public int thirdMax(int[] nums) {
	    int k = 3; //change this for kth largest
	    // initialize maxs array to hold required number of maximums
		// array will contain elements with maxs[i] > maxs[i+1] ,i.e., largest to smallest
        Integer[] maxs = new Integer[k];
		// note: at starting every element will be null because we use Integer object instead of int primitive
		// and we will using this null check with logic below
		
        
		// iterate over each number and try to add it in array of maxs
        for (int n : nums) {
            insert(maxs, n);
        }
		
        // check if we have required number of maxs
		// if we have, return kth largest, which is at the end
		// else return the largest, which is at the beginning
        return maxs[k-1] != null ? maxs[k-1] : maxs[0];
    }
    
	// this is basically an insertion sort algorithm which will run in O(k) time instead of O(k * k)
	// because all the time we are only traversing k elements; first for finding position and then 
	// for right shifting from that position
	// see below rightShift() method as well
    private void insert(Integer[] array, int num) {
        int len = array.length;
        int pos = 0;
        // find location to insert
        while(pos < len) {
            Integer max = array[pos];
            if (max == null || max < num) break; //found an empty location or value is lesser
            if (max == num) pos = len; // handle duplicate entry, do not insert; see if() statement below
            pos++;
        }
		
		// only insert num if we have valid pos
        if (pos < len) {
			// shift array show that there is room for num
            rightShift(array,pos);
			// write num to pos
            array[pos] = num;
        }
    }
    
	// this method will shift all the elements to the right from fromIndex
	// time complexity of which is O(k) and is added to insertion sort complexity above
    private void rightShift(Integer[] array, int fromIndex) {
        for (int i = array.length-1; i > fromIndex; i--) {
            array[i] = array[i-1];
        }
    }
}
