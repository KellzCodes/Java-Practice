# Traverse A Tree

In the introduction, we have gone through the concept of a tree and a binary tree.

In this repo, we will focus on the traversal methods used in a binary tree. Understanding these traversal methods will definitely help you have a better understanding of the tree structure and have a solid foundation for the further study.

The goal of this repo is to:

1. Understand the difference between different tree traversal methods;
2. Be able to solve preorder, inorder and postorder traversal ```recursively```;
3. Be able to solve preorder, inorder and postorder traversal ```iteratively```;
4. Be able to do ```level traversal``` using ```BFS```.

[Given the ```root``` of a binary tree, return *the preorder traversal of its nodes' values.*](https://github.com/keldavis/Java-Practice/tree/master/Google%20Interview%20Prep/Data%20Structures/Binary%20Tree/Traverse%20A%20Tree/Preorder%20Traversal)

[Given the ```root``` of a binary tree, return *the inorder traversal of its nodes' values*.](https://github.com/keldavis/Java-Practice/tree/master/Google%20Interview%20Prep/Data%20Structures/Binary%20Tree/Traverse%20A%20Tree/Inorder%20Traversal)

[Given the ```root``` of a binary tree, return *the postorder traversal of its nodes' values*.](https://github.com/keldavis/Java-Practice/tree/master/Google%20Interview%20Prep/Data%20Structures/Binary%20Tree/Traverse%20A%20Tree/Postorder%20Traversal)

## Binary Tree Traversal - Solution

In this repo, we will provide the recursive solution for the three traversal methods we have mentioned. And talk about the implementation of the iterative solution. Finally, we will discuss the difference between them.

### Pre-order Traversal - Recursive Solution

```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void preorderTraversal(TreeNode root, List<Integer> answer) {
        if (root == null) {
            return;
        }
        answer.add(root.val);                   // visit the root
        preorderTraversal(root.left, answer);   // traverse left subtree
        preorderTraversal(root.right, answer);  // traverse right subtree
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        preorderTraversal(root, answer);
        return answer;
    }
}
```

### In-order Traversal - Recursive Solution

```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void inorderTraversal(TreeNode root, List<Integer> answer) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, answer);   // traverse left subtree
        answer.add(root.val);                  // visit the root
        inorderTraversal(root.right, answer);  // traverse right subtree
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        inorderTraversal(root, answer);
        return answer;
    }
}
```

### Post-order Traversal - Recursive Solution

```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void postorderTraversal(TreeNode root, List<Integer> answer) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left, answer);   // traverse left subtree
        postorderTraversal(root.right, answer);  // traverse right subtree
        answer.add(root.val);                    // visit the root
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        postorderTraversal(root, answer);
        return answer;
    }
}
```

### Iterative Solution

There are several iterative solutions for tree traversal. One of the solutions is to use a stack to simulate the recursion process.

Taking pre-order traversal as an example, in each iteration, we pop one node from the stack and visit this node. Then if this node has a right child, push its right child into the stack. If this node has a left child, push its left child into the stack. It is noteworthy that we push the right child first so that we can visit the left child first since the nature of the stack is LIFO(last in first out). After that, we can continue to the next iteration until the stack is empty.

```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        if (root != null) {
            s.push(root);
        }
        TreeNode cur;
        while (!s.empty()) {
            cur = s.pop();
            answer.add(cur.val);            // visit the root
            if (cur.right != null) {
                s.push(cur.right);          // push right child to stack if it is not null
            }
            if (cur.left != null) {
                s.push(cur.left);           // push left child to stack if it is not null
            }
        }
        return answer;
    }
}
```

### Complexity Analysis

![image](https://user-images.githubusercontent.com/19383145/124372717-713e2e80-dc5a-11eb-9acf-6c191a09dec8.png)
