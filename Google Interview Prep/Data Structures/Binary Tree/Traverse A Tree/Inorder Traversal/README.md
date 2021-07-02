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

<img src="https://user-images.githubusercontent.com/19383145/124208450-8e85c800-dab5-11eb-82ca-3b033d6e7d85.png" alt="inorder1" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124208485-a3faf200-dab5-11eb-809c-a73fac87be5f.png" alt="inorder2" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124208542-bc6b0c80-dab5-11eb-8016-c7c61572d368.png" alt="inorder3" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124208583-d4429080-dab5-11eb-91ec-9785ae58632d.png" alt="inorder4" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124208643-f50ae600-dab5-11eb-926a-3645015be6e3.png" alt="inorder5" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124208666-0a801000-dab6-11eb-805b-52711cddd37d.png" alt="inorder6" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124208734-271c4800-dab6-11eb-894b-2ab76f34c47f.png" alt="inorder7" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124208764-40bd8f80-dab6-11eb-8f1d-a0783d061a59.png" alt="inorder8" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124208851-74001e80-dab6-11eb-9cd0-4e76fa2d6296.png" alt="inorder9" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124208884-88441b80-dab6-11eb-9a34-8a9d21c94cac.png" alt="inorder10" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124208918-9bef8200-dab6-11eb-8d9c-600345d48de3.png" alt="inorder11" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124208952-b0337f00-dab6-11eb-82cf-a8acffee5470.png" alt="inorder12" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124209003-c80b0300-dab6-11eb-86a8-e5c985b9f699.png" alt="inorder13" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124209080-e113b400-dab6-11eb-93a7-8157804ab20d.png" alt="inorder14" width="500"/>

```
public class Solution {
    public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}
```

**Complexity Analysis**

- Time complexity : *O(n)*.

- Space complexity : *O(n)*.

### Approach 3: Morris Traversal

In this method, we have to use a new data structure-Threaded Binary Tree, and the strategy is as follows:

```
Step 1: Initialize current as root

Step 2: While current is not NULL,

If current does not have left child

    a. Add current’s value

    b. Go to the right, i.e., current = current.right

Else

    a. In current's left subtree, make current the right child of the rightmost node

    b. Go to this left child, i.e., current = current.left
```

For example:

```
          1
        /   \
       2     3
      / \   /
     4   5 6
```

First, 1 is the root, so initialize 1 as current, 1 has left child which is 2, the current's left subtree is

```
         2
        / \
       4   5
```

So in this subtree, the rightmost node is 5, then make the current(1) as the right child of 5. Set current = cuurent.left (current = 2). The tree now looks like:

```
         2
        / \
       4   5
            \
             1
              \
               3
              /
             6
```

For current 2, which has left child 4, we can continue with thesame process as we did above

```
        4
         \
          2
           \
            5
             \
              1
               \
                3
               /
              6
```

then add 4 because it has no left child, then add 2, 5, 1, 3 one by one, for node 3 which has left child 6, do the same as above. Finally, the inorder taversal is [4,2,5,1,6,3].

For more details, please check [Threaded binary tree](https://en.wikipedia.org/wiki/Threaded_binary_tree) and [Explaination of Morris Method](https://stackoverflow.com/questions/5502916/explain-morris-inorder-tree-traversal-without-using-stacks-or-recursion)

```
class Solution {
    public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        TreeNode curr = root;
        TreeNode pre;
        while (curr != null) {
            if (curr.left == null) {
                res.add(curr.val);
                curr = curr.right; // move to next right node
            } else { // has a left subtree
                pre = curr.left;
                while (pre.right != null) { // find rightmost
                    pre = pre.right;
                }
                pre.right = curr; // put cur after the pre node
                TreeNode temp = curr; // store cur node
                curr = curr.left; // move cur to the top of the new tree
                temp.left = null; // original cur left be null, avoid infinite loops
            }
        }
        return res;
    }
}
```

![image](https://user-images.githubusercontent.com/19383145/124209853-559b2280-dab8-11eb-8a16-f6e81d941a5f.png)
