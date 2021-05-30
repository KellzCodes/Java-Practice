public int thirdMax(int[] nums) {

    // Put the input integers into a HashSet.
    Set<Integer> setNums = new HashSet<>();
    for (int num : nums) setNums.add(num);

    // Find the maximum.
    int maximum = Collections.max(setNums);

    // Check whether or not this is a case where we
    // need to return the *maximum*.
    if (setNums.size() < 3) {
        return maximum;
    }

    // Otherwise, continue on to finding the third maximum.
    setNums.remove(maximum);
    int secondMaximum = Collections.max(setNums);
    setNums.remove(secondMaximum);
    return Collections.max(setNums);
}
