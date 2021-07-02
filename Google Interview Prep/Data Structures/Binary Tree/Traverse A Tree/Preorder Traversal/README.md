Given the ```root``` of a binary tree, return *the preorder traversal of its nodes' values*.

**Example 1:**

![image](https://user-images.githubusercontent.com/19383145/124204244-a60c8300-daac-11eb-8d12-9433c4cf35e3.png)
> **Input:** root = [1,null,2,3]
> 
> **Output:** [1,2,3]

**Example 2:**
> **Input:** root = []
> 
> **Output:** []

**Example 3:**
> **Input:** root = [1]
> 
> **Output:** [1]

**Example 4:**

![image](https://user-images.githubusercontent.com/19383145/124204377-f2f05980-daac-11eb-8499-49bf913640de.png)
> **Input:** root = [1,2]
> 
> **Output:** [1,2]

**Example 5:**

![image](https://user-images.githubusercontent.com/19383145/124204566-511d3c80-daad-11eb-98e9-09135f8cd665.png)

> **Input:** root = [1,null,2]
> 
> **Output:** [1,2]

**Constraints:**

- The number of nodes in the tree is in the range ```[0, 100]```.
- ```-100 <= Node.val <= 100```

**Follow up:** Recursive solution is trivial, could you do it iteratively?

## Solution

### How to traverse the tree

There are two general strategies to traverse a tree:

- Breadth First Search (```BFS```)

  - We scan through the tree level by level, following the order of height, from top to bottom. The nodes on higher level would be visited before the ones with lower levels.

- Depth First Search (```DFS```)

  - In this strategy, we adopt the ```depth``` as the priority, so that one would start from a root and reach all the way down to certain leaf, and then back to root to reach another branch.

  - The DFS strategy can further be distinguished as ```preorder```, ```inorder```, and ```postorder``` depending on the relative order among the root node, left node and right node.

On the following figure the nodes are numerated in the order you visit them, please follow ```1-2-3-4-5``` to compare different strategies.

![image](https://user-images.githubusercontent.com/19383145/124204820-e15b8180-daad-11eb-8ba4-2f6ab8fb4bbe.png)

Here the problem is to implement preorder traversal using iterations.

### Approach 1: Iterations

**Algorithm**

First of all, here is the definition of the ```TreeNode``` which we would use in the following implementation.

```
/* Definition for a binary tree node. */
public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}
```

Let's start from the root and then at each iteration pop the current node out of the stack and push its child nodes. In the implemented strategy we push nodes into output list following the order ```Top->Bottom``` and ```Left->Right```, that naturally reproduces preorder traversal.

```
class Solution {
  public List<Integer> preorderTraversal(TreeNode root) {
    LinkedList<TreeNode> stack = new LinkedList<>();
    LinkedList<Integer> output = new LinkedList<>();
    if (root == null) {
      return output;
    }

    stack.add(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pollLast();
      output.add(node.val);
      if (node.right != null) {
        stack.add(node.right);
      }
      if (node.left != null) {
        stack.add(node.left);
      }
    }
    return output;
  }
}
```

**Complexity Analysis**
- Time complexity : we visit each node exactly once, thus the time complexity is *O(N)*, where *N* is the number of nodes, i.e. the size of tree.

- Space complexity : depending on the tree structure, we could keep up to the entire tree, therefore, the space complexity is *O(N)*.

### Approach 2: Morris traversal

This approach is based on [Morris's article](https://www.sciencedirect.com/science/article/pii/0020019079900681) which is intended to optimize the space complexity. The algorithm does not use additional space for the computation, and the memory is only used to keep the output. If one prints the output directly along the computation, the space complexity would be *O(1)*.

**Algorithm**

Here the idea is to go down from the node to its predecessor, and each predecessor will be visited twice. For this go one step left if possible and then always right till the end. When we visit a leaf (node's predecessor) first time, it has a zero right child, so we update output and establish the pseudo link ```predecessor.right = root``` to mark the fact the predecessor is visited. When we visit the same predecessor the second time, it already points to the current node, thus we remove pseudo link and move right to the next node.

If the first one step left is impossible, update output and move right to next node.


<img src="https://user-images.githubusercontent.com/19383145/124205460-4368b680-daaf-11eb-8517-f7e6b4b1e8e6.png" alt="preorder1" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124205715-d6095580-daaf-11eb-9f1b-b71138660355.png" alt="preorder2" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124205791-f76a4180-daaf-11eb-9525-ab905ff42791.png" alt="preorder3" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124205834-12d54c80-dab0-11eb-98bc-94b9cd2c71af.png" alt="preorder4" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124205879-339da200-dab0-11eb-8e72-d1a2ca7e6ee0.png" alt="preorder5" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124205941-516b0700-dab0-11eb-8f2b-67fc59658d75.png" alt="preorder6" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124205985-6b0c4e80-dab0-11eb-8eb0-4b1ccb39e87f.png" alt="preorder7" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124206066-8d05d100-dab0-11eb-964a-245ea4df5cc4.png" alt="preorder8" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124206180-d2c29980-dab0-11eb-9e62-849e621d5414.png" alt="preorder9" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124206260-fa196680-dab0-11eb-8f19-f3da6e674b9f.png" alt="preorder10" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124206302-13baae00-dab1-11eb-829f-5abccc414617.png" alt="preorder11" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124206346-2e8d2280-dab1-11eb-9f97-f2bdb7ddc87d.png" alt="preorder12" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124206430-5aa8a380-dab1-11eb-9a0f-ab6d95e6cfe7.png" alt="preorder13" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124206463-6eeca080-dab1-11eb-8b15-5d111a08bb6f.png" alt="preorder14" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/124206498-83309d80-dab1-11eb-89d3-fe8018cdc88e.png" alt="preorder15" width="500"/>

```
class Solution {
  public List<Integer> preorderTraversal(TreeNode root) {
    LinkedList<Integer> output = new LinkedList<>();

    TreeNode node = root;
    while (node != null) {
      if (node.left == null) {
        output.add(node.val);
        node = node.right;
      }
      else {
        TreeNode predecessor = node.left;
        while ((predecessor.right != null) && (predecessor.right != node)) {
          predecessor = predecessor.right;
        }

        if (predecessor.right == null) {
          output.add(node.val);
          predecessor.right = node;
          node = node.left;
        }
        else{
          predecessor.right = null;
          node = node.right;
        }
      }
    }
    return output;
  }
}
```

**Complexity Analysis**

- Time complexity : we visit each predecessor exactly twice descending down from the node, thus the time complexity is *O(N)*, where *N* is the number of nodes, i.e. the size of tree.

- Space complexity : we use no additional memory for the computation itself, but output list contains *N* elements, and thus space complexity is *O(N)*.
