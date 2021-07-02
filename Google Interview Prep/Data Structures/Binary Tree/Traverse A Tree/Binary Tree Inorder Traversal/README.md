# Binary Tree Inorder Traversal

Given the ```root``` of a binary tree, return *the inorder traversal of its nodes' values*.

**Example 1:**

![image](https://user-images.githubusercontent.com/19383145/124207065-a90a7200-dab2-11eb-9701-d0184f6c0bb4.png)
> **Input:** root = [1,null,2,3]
> 
> **Output:** [1,3,2]

**Example 2:**
> **Input:** root = []
> 
> **Output:** []

**Example 3:**
> **Input:** root = [1]
> 
> **Output:** [1]

**Example 4:**

![image](https://user-images.githubusercontent.com/19383145/124207181-f25ac180-dab2-11eb-8dd2-14a577e6ea3e.png)
> **Input:** root = [1,2]
> 
> **Output:** [2,1]

**Example 5:**

![image](https://user-images.githubusercontent.com/19383145/124207271-22a26000-dab3-11eb-9307-625c7235a2cf.png)
> **Input:** root = [1,null,2]
> 
> **Output:** [1,2]

**Constraints:**
- The number of nodes in the tree is in the range ```[0, 100]```.
- ```-100 <= Node.val <= 100```

**Follow up:** Recursive solution is trivial, could you do it iteratively?

## Solution

### Approach 1: Recursive Approach

The first method to solve this problem is using recursion. This is the classical method and is straightforward. We can define a helper function to implement recursion.

```
class Solution {
    public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List < Integer > res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }
}
```

**Complexity Analysis**

- Time complexity : *O(n)*. The time complexity is *O(n)* because the recursive function is *T(n)=2⋅T(n/2)+1*.

- Space complexity : The worst case space required is *O(n)*, and in the average case it's *O(logn)* where *n* is number of nodes.

### Approach 2: Iterating method using Stack

The strategy is very similiar to the first method, the different is using stack.

Here is an illustration:

