# Binary Tree Postorder Traversal

Given the ```root``` of a binary tree, return *the postorder traversal of its nodes' values*.

Example 1:

![image](https://user-images.githubusercontent.com/19383145/124210865-30a7af00-daba-11eb-950e-86d1acd55376.png)
Input: root = [1,null,2,3]
Output: [3,2,1]

Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
Example 4:

![image](https://user-images.githubusercontent.com/19383145/124210913-45844280-daba-11eb-9c20-ccc301caec79.png)

Input: root = [1,2]

Output: [2,1]

Example 5:

![image](https://user-images.githubusercontent.com/19383145/124211864-db6c9d00-dabb-11eb-9d7a-2b4b85a248c8.png)

Input: root = [1,null,2]

Output: [2,1]

Constraints:

- The number of the nodes in the tree is in the range [0, 100].
- ```-100 <= Node.val <= 100```
 

Follow up: Recursive solution is trivial, could you do it iteratively?
