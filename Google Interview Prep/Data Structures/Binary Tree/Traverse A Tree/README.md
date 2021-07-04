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

[Given the ```root``` of a binary tree, return the *level order traversal of its nodes' values.* (i.e., from left to right, level by level).](https://github.com/keldavis/Java-Practice/tree/master/Google%20Interview%20Prep/Data%20Structures/Binary%20Tree/Traverse%20A%20Tree/Level%20Order%20Traversal)

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

## Level-order Traversal - Introduction

Level-order traversal is to traverse the tree level by level.

```Breadth-First Search``` is an algorithm to traverse or search in data structures like a tree or a graph. The algorithm starts with a root node and visit the node itself first. Then traverse its neighbors, traverse its second level neighbors, traverse its third level neighbors, so on and so forth.

When we do breadth-first search in a tree, the order of the nodes we visited is in level order.

Here is an example of level-order traversal:

![image](https://user-images.githubusercontent.com/19383145/124372754-c1b58c00-dc5a-11eb-9411-804b00aeb1f1.png)

![image](https://user-images.githubusercontent.com/19383145/124372759-cc702100-dc5a-11eb-89a1-0105ce7e821f.png)

![image](https://user-images.githubusercontent.com/19383145/124372765-d42fc580-dc5a-11eb-9168-c6dc5229ccd5.png)

![image](https://user-images.githubusercontent.com/19383145/124372767-dc880080-dc5a-11eb-85c2-b69eec2fc35a.png)

![image](https://user-images.githubusercontent.com/19383145/124372770-e4e03b80-dc5a-11eb-94db-9678cf94e257.png)

![image](https://user-images.githubusercontent.com/19383145/124372774-ef9ad080-dc5a-11eb-96b6-5557454b9fb1.png)

![image](https://user-images.githubusercontent.com/19383145/124372777-f7f30b80-dc5a-11eb-843f-890bde15e4d5.png)

![image](https://user-images.githubusercontent.com/19383145/124372781-017c7380-dc5b-11eb-8b55-dbe54e044623.png)

![image](https://user-images.githubusercontent.com/19383145/124372783-093c1800-dc5b-11eb-979f-befa97cc1f57.png)

![image](https://user-images.githubusercontent.com/19383145/124372788-122ce980-dc5b-11eb-88e1-1b14004b1fa2.png)

![image](https://user-images.githubusercontent.com/19383145/124372795-207b0580-dc5b-11eb-8ddf-3115d42b4ada.png)

![image](https://user-images.githubusercontent.com/19383145/124372798-2b359a80-dc5b-11eb-9ca2-3f8ed8395e9b.png)

![image](https://user-images.githubusercontent.com/19383145/124372807-3a1c4d00-dc5b-11eb-90b9-b705551d9a62.png)

![image](https://user-images.githubusercontent.com/19383145/124372813-46080f00-dc5b-11eb-9235-c33f73f26ff6.png)

![image](https://user-images.githubusercontent.com/19383145/124372817-51f3d100-dc5b-11eb-91cb-c77d1a929598.png)

![image](https://user-images.githubusercontent.com/19383145/124372823-5b7d3900-dc5b-11eb-867b-65b64c57453d.png)

![image](https://user-images.githubusercontent.com/19383145/124372830-6506a100-dc5b-11eb-8262-2d1916e27e9d.png)

## Binary Tree Level Traversal - Solution

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) {
            q.offer(root);
        }
        TreeNode cur;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> subAns = new LinkedList<Integer>();
            for (int i = 0; i < size; ++i) {        // traverse nodes in the same level
                cur = q.poll();
                subAns.add(cur.val);                // visit the root
                if (cur.left != null) {
                    q.offer(cur.left);              // push left child to queue if it is not null
                }
                if (cur.right != null) {
                    q.offer(cur.right);             // push right child to queue if it is not null
                }
            }
            ans.add(subAns);
        }
        return ans;
    }
}
```

Since each node in the tree will be pushed into the queue exactly once, the time complexity for level-order traversal is ```O(N)```, where ```N``` is the total number of nodes in the tree.

What about the space complexity? We have to maintain a queue to help us to do the traversal. And the size of the queue will be at most ```N``` because each node will be pushed into the queue exactly once. Therefore, the space complexity of level-order traversal is also ```O(N)```.
