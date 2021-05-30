# Find All Numbers Disappeared in an Array

## Given an array ```nums``` of ```n``` integers where ```nums[i]``` is in the range ```[1, n]```, return an array of all the integers in the range ```[1, n]``` that do not appear in ```nums```.

#### Example 1:
> **Input**: nums = [4,3,2,7,8,2,3,1]
> 
> **Output**: [5,6]

#### Example 2:
> **Input**: nums = [1,1]
> **Output**: [2]
 

#### Constraints:

- ```n == nums.length```
- ```1 <= n <= 105```
- ```1 <= nums[i] <= n```
 
**Follow up**: Could you do it without extra space and in *O(n)* runtime? You may assume the returned list does not count as extra space.

#### Hints

- This is a really easy problem if you decide to use additional memory. For those trying to write an initial solution using additional memory, think **counters**!
- However, the trick really is to not use any additional space than what is already available to use. Sometimes, multiple passes over the input array help find the solution. However, there's an interesting piece of information in this problem that makes it easy to re-use the input array itself for the solution.
- The problem specifies that the numbers in the array will be in the range [1, n] where n is the number of elements in the array. Can we use this information and modify the array in-place somehow to find what we need?

## Solution

### Approach 1: Using Hash Map

**Intuition**

The intuition behind using a hash map is pretty clear in this case. We are given that the array would be of size N and it should contain numbers from 1 to N. However, some of the numbers are missing. All we have to do is keep track of which numbers we encounter in the array and then iterate from 1⋯N and check which numbers did not appear in the hash table. Those will be our missing numbers. Let's look at a formal algorithm based on this idea and then an animation explaining the same with the help of a simple example.

**Algorithm**

1. Initialize a hash map, hash to keep track of the numbers that we encounter in the array. Note that we can use a set data structure as well in this case since we are not concerned about the frequency counts of elements.

![image](https://user-images.githubusercontent.com/19383145/120093597-620f1280-c0e9-11eb-938d-0c6375145ef2.png)
> Note that for the purposes of illustration, we have use a hash map of size 14 and have ordered the keys of the hash map from 0 to 14. Also, we will be using a simple hash function that directly maps the array entries to their corresponding keys in the hash map. Usually, the mapping is not this simple and is dependent upon the hash function being used in the implementation of the hash map.

2. Next, iterate over the given array one element at a time and for each element, insert an entry in the hash map. Even if an entry were to exist before in the hash map, it will simply be over-written. For the above example, let's look at the final state of the hash map once we process the last element of the array.

![image](https://user-images.githubusercontent.com/19383145/120093624-88cd4900-c0e9-11eb-93f9-0e008f3fb354.png)

3. Now that we know the unique set of elements from the array, we can simply find out the missing elements from the range 1⋯N.

4. Iterate over all the numbers from 1⋯N and for each number, check if there's an entry in the hash map. If there is no entry, add that missing number to a result array that we will return from the function eventually.

```
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        // Hash table for keeping track of the numbers in the array
        // Note that we can also use a set here since we are not 
        // really concerned with the frequency of numbers.
        HashMap<Integer, Boolean> hashTable = new HashMap<Integer, Boolean>();
        
        // Add each of the numbers to the hash table
        for (int i = 0; i < nums.length; i++) {
            hashTable.put(nums[i], true);
        }
        
        // Response array that would contain the missing numbers
        List<Integer> result = new LinkedList<Integer>();
        
        // Iterate over the numbers from 1 to N and add all those
        // that don't appear in the hash table. 
        for (int i = 1; i <= nums.length; i++) {
            if (!hashTable.containsKey(i)) {
                result.add(i);
            }
        }
        
        return result;
    }
}
```

**Complexity Analysis**

- Time Complexity : *O(N)*
- Space Complexity : *O(N)*

### Approach 2: O(1) Space InPlace Modification Solution

**Intuition**

We definitely need to keep track of all the unique numbers that appear in the array. However, we don't want to use any extra space for it. This solution that we will look at in just a moment springs from the fact that
> All the elements are in the range ```[1, N]```

Since we are given this information, we can make use of the input array itself to somehow mark visited numbers and then find our missing numbers. Now, we don't want to change the actual data in the array but who's stopping us from changing the magnitude of numbers in the array? That is the basic idea behind this algorithm.
> We will be negating the numbers seen in the array and use the sign of each of the numbers for finding our missing numbers. We will be treating numbers in the array as indices and mark corresponding locations in the array as negative.

**Algorithm**

1. Iterate over the input array one element at a time.
2. For each element ```nums[i]```, mark the element at the corresponding location negative if it's not already marked so i.e. ```nums[nums[i] - 1 * -1]```.
3. Now, loop over numbers from 1⋯N and for each number check if nums[j] is negative. If it is negative, that means we've seen this number somewhere in the array.
4. Add all the numbers to the resultant array which don't have their corresponding locations marked as negative in the original array.

```
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        // Iterate over each of the elements in the original array
        for (int i = 0; i < nums.length; i++) {
            
            // Treat the value as the new index
            int newIndex = Math.abs(nums[i]) - 1;
            
            // Check the magnitude of value at this new index
            // If the magnitude is positive, make it negative 
            // thus indicating that the number nums[i] has 
            // appeared or has been visited.
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }
        
        // Response array that would contain the missing numbers
        List<Integer> result = new LinkedList<Integer>();
        
        // Iterate over the numbers from 1 to N and add all those
        // that have positive magnitude in the array
        for (int i = 1; i <= nums.length; i++) {
            
            if (nums[i - 1] > 0) {
                result.add(i);
            }
        }
        
        return result;
    }
}
```

#### Complexity Analysis

- Time Complexity : *O(N)*
- Space Complexity : *O(1)* since we are reusing the input array itself as a hash table and the space occupied by the output array doesn't count toward the space complexity of the algorithm.
