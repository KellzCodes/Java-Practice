# Minimum Size Subarray Sum

Given an array of positive integers ```nums``` and a positive integer ```target```, return the minimal length of a **contiguous subarray** [numsl, nums<sub>l+1</sub>, ..., nums<sub>r-1</sub>, nums<sub>r</sub>] of which the sum is greater than or equal to target. If there is no such subarray, return ```0``` instead.

**Example 1:**
> **Input:** target = 7, nums = [2,3,1,2,4,3]
> 
> **Output:** 2
> 
> **Explanation:** The subarray [4,3] has the minimal length under the problem constraint.

**Example 2:**
> **Input:** target = 4, nums = [1,4,4]
> 
> **Output:** 1

**Example 3:**
> **Input:** target = 11, nums = [1,1,1,1,1,1,1,1]
> 
> **Output:** 0

**Constraints:**
- 1 <= target <= 10<sup>9</sup>
- 1 <= nums.length <= 10<sup>5</sup>
- 1 <= nums[i] <= 10<sup>5</sup>

**Follow up:** If you have figured out the ```O(n)``` solution, try coding another solution of which the time complexity is ```O(n log(n))```.

## Solution

### Approach #1 Brute force [Time Limit Exceeded]

**Intuition**

Do as directed in question. Find the sum for all the possible subarrays and update the ```ans``` as and when we get a better subarray that fulfill the requirements ```sum≥s```.

**Algorithm**

- Initialize *ans=INT_MAX*
- Iterate the array from left to right using *i*:
  - Iterate from the current element to the end of vector using *j*:
      - Find the \text{sum}sum of elements from index *i* to *j*
      - If sum is greater then *s*:
        - Update *ans=min(ans,(j−i+1))*
        - Start the next *i*th iteration, since, we got the smallest subarray with *sum≥s* starting from the current index.

```
int minSubArrayLen(int s, vector<int>& nums)
{
    int n = nums.size();
    int ans = INT_MAX;
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum += nums[k];
            }
            if (sum >= s) {
                ans = min(ans, (j - i + 1));
                break; //Found the smallest subarray with sum>=s starting with index i, hence move to next index
            }
        }
    }
    return (ans != INT_MAX) ? ans : 0;
}
```

![image](https://user-images.githubusercontent.com/19383145/123533782-3bdb9300-d6e6-11eb-80a6-ae34a29a3b5e.png)

![image](https://user-images.githubusercontent.com/19383145/123533790-5150bd00-d6e6-11eb-9b14-39881bbf75ab.png)

```
int minSubArrayLen(int s, vector<int>& nums)
{
    int n = nums.size();
    if (n == 0)
        return 0;
    int ans = INT_MAX;
    vector<int> sums(n);
    sums[0] = nums[0];
    for (int i = 1; i < n; i++)
        sums[i] = sums[i - 1] + nums[i];
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int sum = sums[j] - sums[i] + nums[i];
            if (sum >= s) {
                ans = min(ans, (j - i + 1));
                break; //Found the smallest subarray with sum>=s starting with index i, hence move to next index
            }
        }
    }
    return (ans != INT_MAX) ? ans : 0;
}
```

**Complexity analysis**

![image](https://user-images.githubusercontent.com/19383145/123533809-8230f200-d6e6-11eb-92c3-212eac3a9106.png)

### Approach #3 Using Binary search [Accepted]

**Intuition**

![image](https://user-images.githubusercontent.com/19383145/123533826-a260b100-d6e6-11eb-8942-6f08f4bd9c9b.png)

**Algorithm**

![image](https://user-images.githubusercontent.com/19383145/123533831-b6a4ae00-d6e6-11eb-9d1a-3dc47f5968fa.png)

```
int minSubArrayLen(int s, vector<int>& nums)
{
    int n = nums.size();
    if (n == 0)
        return 0;
    int ans = INT_MAX;
    vector<int> sums(n + 1, 0); //size = n+1 for easier calculations
    //sums[0]=0 : Meaning that it is the sum of first 0 elements
    //sums[1]=A[0] : Sum of first 1 elements
    //ans so on...
    for (int i = 1; i <= n; i++)
        sums[i] = sums[i - 1] + nums[i - 1];
    for (int i = 1; i <= n; i++) {
        int to_find = s + sums[i - 1];
        auto bound = lower_bound(sums.begin(), sums.end(), to_find);
        if (bound != sums.end()) {
            ans = min(ans, static_cast<int>(bound - (sums.begin() + i - 1)));
        }
    }
    return (ans != INT_MAX) ? ans : 0;
}
```

**Complexity analysis**

![image](https://user-images.githubusercontent.com/19383145/123533847-d4721300-d6e6-11eb-95c4-92e5467af6e2.png)

### Approach #4 Using 2 pointers [Accepted]

**Intuition**

Until now, we have kept the starting index of subarray fixed, and found the last position. Instead, we could move the starting index of the current subarray as soon as we know that no better could be done with this index as the starting index. We could keep 2 pointer,one for the start and another for the end of the current subarray, and make optimal moves so as to keep the *sum* greater than ss as well as maintain the lowest size possible.

**Algorithm**

![image](https://user-images.githubusercontent.com/19383145/123533894-0c795600-d6e7-11eb-9997-409639983a14.png)

```
int minSubArrayLen(int s, vector<int>& nums)
{
    int n = nums.size();
    int ans = INT_MAX;
    int left = 0;
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += nums[i];
        while (sum >= s) {
            ans = min(ans, i + 1 - left);
            sum -= nums[left++];
        }
    }
    return (ans != INT_MAX) ? ans : 0;
}
```

**Complexity analysis**

![image](https://user-images.githubusercontent.com/19383145/123533904-24e97080-d6e7-11eb-953d-2d65b99a825d.png)

### Two Pointer Java Solution

```
public int minSubArrayLen(int s, int[] a) {
  if (a == null || a.length == 0)
    return 0;
  
  int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
  
  while (j < a.length) {
    sum += a[j++];
    
    while (sum >= s) {
      min = Math.min(min, j - i);
      sum -= a[i++];
    }
  }
  
  return min == Integer.MAX_VALUE ? 0 : min;
}
```
