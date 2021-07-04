# Binary Tree Level Order Traversal

Given the ```root``` of a binary tree, return *the level order traversal of its nodes' values*. (i.e., from left to right, level by level).

**Example 1:**

![image](https://user-images.githubusercontent.com/19383145/124373504-bd8c6d00-dc60-11eb-8ee2-ea484815550e.png)
> **Input:** root = [3,9,20,null,null,15,7]
> 
> **Output:** [[3],[9,20],[15,7]]

**Example 2:**
> **Input:** root = [1]
> 
> **Output:** [[1]]

**Example 3:**
> **Input:** root = []
> 
> **Output:** []

**Constraints:**
- The number of nodes in the tree is in the range ```[0, 2000]```.
- ```-1000 <= Node.val <= 1000```

## Solution

### How to traverse the tree

There are two general strategies to traverse a tree:

- Depth First Search (```DFS```)

  - In this strategy, we adopt the depth as the priority, so that one would start from a root and reach all the way down to certain leaf, and then back to root to reach another branch.

  - The DFS strategy can further be distinguished as preorder, inorder, and postorder depending on the relative order among the root node, left node and right node.

- Breadth First Search (```BFS```)

  - We scan through the tree level by level, following the order of height, from top to bottom. The nodes on higher level would be visited before the ones with lower levels.

On the following figure the nodes are numerated in the order you visit them, please follow ```1-2-3-4-5``` to compare different strategies.

![image](https://user-images.githubusercontent.com/19383145/124373637-f6791180-dc61-11eb-95c5-76f1a6b33b09.png)

Here the problem is to implement split-level BFS traversal : ```[[1], [2, 3], [4, 5]]```.

### Approach 1: Recursion

**Algorithm**

The simplest way to solve the problem is to use a recursion. Let's first ensure that the tree is not empty, and then call recursively the function ```helper(node, level)```, which takes the current node and its level as the arguments.

This function does the following :

- The output list here is called levels, and hence the current level is just a length of this list ```len(levels)```. Compare the number of a current level ```len(levels)``` with a node level ```level```. If you're still on the previous level - add the new one by adding a new list into ```levels```.

- Append the node value to the last list in ```levels```.

- Process recursively child nodes if they are not ```None``` : ```helper(node.left / node.right, level + 1)```.

**Implementation**

![image](https://user-images.githubusercontent.com/19383145/124373677-57a0e500-dc62-11eb-97bb-8490be0b4efa.png)

![image](https://user-images.githubusercontent.com/19383145/124373682-65566a80-dc62-11eb-9509-4fee75609bd7.png)

![image](https://user-images.githubusercontent.com/19383145/124373688-73a48680-dc62-11eb-9360-2910b2b6c2e6.png)

![image](https://user-images.githubusercontent.com/19383145/124373691-7c955800-dc62-11eb-95b4-31e99f1e911e.png)

![image](https://user-images.githubusercontent.com/19383145/124373696-88811a00-dc62-11eb-91cd-73ee49844652.png)

![image](https://user-images.githubusercontent.com/19383145/124373700-9171eb80-dc62-11eb-9aef-d0fe9a022575.png)

![image](https://user-images.githubusercontent.com/19383145/124373703-9d5dad80-dc62-11eb-9a19-937410e4983b.png)

![image](https://user-images.githubusercontent.com/19383145/124373708-a8184280-dc62-11eb-8f03-cbdbe5630a10.png)

![image](https://user-images.githubusercontent.com/19383145/124373711-b1a1aa80-dc62-11eb-8e2c-d0dbc7b5c0ad.png)

![image](https://user-images.githubusercontent.com/19383145/124373714-bbc3a900-dc62-11eb-983e-dedc99039844.png)

![image](https://user-images.githubusercontent.com/19383145/124373889-5ec8f280-dc64-11eb-9467-810fb669f54c.png)

![image](https://user-images.githubusercontent.com/19383145/124374647-2842a600-dc6b-11eb-9cbb-efc39bb70f8f.png)

![image](https://user-images.githubusercontent.com/19383145/124374660-43151a80-dc6b-11eb-8c57-5db7b7105dd9.png)

![image](https://user-images.githubusercontent.com/19383145/124374667-4f997300-dc6b-11eb-9dfc-6eeab727245b.png)

![image](https://user-images.githubusercontent.com/19383145/124374670-59bb7180-dc6b-11eb-8216-536d255bfa34.png)

```
class Solution {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public void helper(TreeNode node, int level) {
        // start the current level
        if (levels.size() == level)
            levels.add(new ArrayList<Integer>());

         // fulfil the current level
         levels.get(level).add(node.val);

         // process child nodes for the next level
         if (node.left != null)
            helper(node.left, level + 1);
         if (node.right != null)
            helper(node.right, level + 1);
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }
}
```

**Complexity Analysis**

- Time complexity : *O(N)* since each node is processed exactly once.

- Space complexity : *O(N)* to keep the output structure which contains ```N``` node values.

### Approach 2: Iteration

**Algorithm**

The recursion above could be rewritten in the iteration form.

Let's keep nodes of each tree level in the *queue* structure, which typically orders elements in a FIFO (first-in-first-out) manner. In Java one could use [```LinkedList``` implementation of the ```Queue``` interface](https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html). In Python using [```Queue``` structure](https://docs.python.org/3/library/queue.html) would be an overkill since it's designed for a safe exchange between multiple threads and hence requires locking which leads to a performance loose. In Python the queue implementation with a fast atomic ```append()``` and ```popleft()``` is deque.

The zero level contains only one node ```root```. The algorithm is simple :

- Initiate queue with a ```root``` and start from the level number ```0``` : ```level = 0```.

- While queue is not empty :

  - Start the current level by adding an empty list into output structure levels.

  - Compute how many elements should be on the current level : it's a queue length.

  - Pop out all these elements from the queue and add them into the current level.

  - Push their child nodes into the queue for the next level.

  - Go to the next level level++.

**Implementation**

```
class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();
    if (root == null) return levels;

    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    int level = 0;
    while ( !queue.isEmpty() ) {
      // start the current level
      levels.add(new ArrayList<Integer>());

      // number of elements in the current level
      int level_length = queue.size();
      for(int i = 0; i < level_length; ++i) {
        TreeNode node = queue.remove();

        // fulfill the current level
        levels.get(level).add(node.val);

        // add child nodes of the current level
        // in the queue for the next level
        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
      }
      // go to next level
      level++;
    }
    return levels;
  }
}
```

**Complexity Analysis**

- Time complexity : *O(N)* since each node is processed exactly once.

- Space complexity : *O(N)* to keep the output structure which contains ```N``` node values.
