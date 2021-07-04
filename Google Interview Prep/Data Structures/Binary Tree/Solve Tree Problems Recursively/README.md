# Solve Tree Problems Recursively

- [Top down Solution](#Top-Down-Solution)
- [Bottom up Solution](#Bottom-Up-Solution)
- [Conclusion](#Conclusion)

In previous sections, we have introduced how to solve tree traversal problems recursively. Recursion is one of the most powerful and frequently used techniques for solving tree problems.

As we know, a tree can be defined recursively as a node(the root node) that includes a value and a list of references to children nodes. Recursion is one of the natural features of a tree. Therefore, many tree problems can be solved recursively. For each recursive function call, we only focus on the problem for the current node and call the function recursively to solve its children.

Typically, we can solve a tree problem recursively using a top-down approach or using a bottom-up approach.

[Given the ```root``` of a binary tree, return *its maximum depth*.](https://github.com/keldavis/Java-Practice/tree/master/Google%20Interview%20Prep/Data%20Structures/Binary%20Tree/Solve%20Tree%20Problems%20Recursively/Maximum%20Depth)

### Top down Solution

"Top-down" means that in each recursive call, we will visit the node first to come up with some values, and pass these values to its children when calling the function recursively. So the "top-down" solution can be considered as a kind of **preorder** traversal. To be specific, the recursive function ```top_down(root, params)``` works like this:

```
1. return specific value for null node
2. update the answer if needed                      // answer <-- params
3. left_ans = top_down(root.left, left_params)      // left_params <-- root.val, params
4. right_ans = top_down(root.right, right_params)   // right_params <-- root.val, params
5. return the answer if needed                      // answer <-- left_ans, right_ans
```

For instance, consider this problem: given a binary tree, find its maximum depth.

We know that the depth of the root node is ```1```. For each node, if we know its depth, we will know the depth of its children. Therefore, if we pass the depth of the node as a parameter when calling the function recursively, all the nodes will know their depth. And for leaf nodes, we can use the depth to update the final answer. Here is the pseudocode for the recursive function ```maximum_depth(root, depth):```

```
1. return if root is null
2. if root is a leaf node:
3.     answer = max(answer, depth)         // update the answer if needed
4. maximum_depth(root.left, depth + 1)     // call the function recursively for left child
5. maximum_depth(root.right, depth + 1)    // call the function recursively for right child
```

Here is an example to help you understand how it works:

![image](https://user-images.githubusercontent.com/19383145/124375048-f41cb480-dc6d-11eb-8ae0-039babc4c431.png)

![image](https://user-images.githubusercontent.com/19383145/124375053-fc74ef80-dc6d-11eb-9fd3-6a84ac168eb2.png)

![image](https://user-images.githubusercontent.com/19383145/124375060-04cd2a80-dc6e-11eb-8f20-c20ef2254277.png)

![image](https://user-images.githubusercontent.com/19383145/124375063-0c8ccf00-dc6e-11eb-9757-013f821839f7.png)

![image](https://user-images.githubusercontent.com/19383145/124375068-144c7380-dc6e-11eb-8fc6-c8e5ca8a0728.png)

![image](https://user-images.githubusercontent.com/19383145/124375071-1b738180-dc6e-11eb-9206-89c7d6e501b0.png)

![image](https://user-images.githubusercontent.com/19383145/124375076-23cbbc80-dc6e-11eb-9f21-31bb2f635b18.png)

![image](https://user-images.githubusercontent.com/19383145/124375083-2c23f780-dc6e-11eb-9816-709b68b40f41.png)

![image](https://user-images.githubusercontent.com/19383145/124375087-347c3280-dc6e-11eb-853e-025b670ad8f2.png)

![image](https://user-images.githubusercontent.com/19383145/124375090-3ba34080-dc6e-11eb-9b9c-d078a602e72a.png)

![image](https://user-images.githubusercontent.com/19383145/124375095-4231b800-dc6e-11eb-937f-826e963818d8.png)

![image](https://user-images.githubusercontent.com/19383145/124375099-4958c600-dc6e-11eb-9eaf-d686a1c236f9.png)

```
private int answer; // don't forget to initialize answer before call maximum_depth
private void maximum_depth(TreeNode root, int depth) {
    if (root == null) {
        return;
    }
    if (root.left == null && root.right == null) {
        answer = Math.max(answer, depth);
    }
    maximum_depth(root.left, depth + 1);
    maximum_depth(root.right, depth + 1);
}
```

### Bottom Up Solution

"Bottom-up" is another recursive solution. In each recursive call, we will firstly call the function recursively for all the children nodes and then come up with the answer according to the returned values and the value of the current node itself. This process can be regarded as a kind of **postorder** traversal. Typically, a "bottom-up" recursive function ```bottom_up(root)``` will be something like this:

```
1. return specific value for null node
2. left_ans = bottom_up(root.left)      // call function recursively for left child
3. right_ans = bottom_up(root.right)    // call function recursively for right child
4. return answers                       // answer <-- left_ans, right_ans, root.val
```

Let's go on discussing the question about maximum depth but using a different way of thinking: for a single node of the tree, what will be the maximum depth ```x``` of the subtree rooted at itself?

  If we know the maximum depth ```l``` of the subtree rooted at its **left** child and the maximum depth ```r``` of the subtree rooted at its **right** child, can we answer the previous question? Of course yes, we can choose the maximum between them and add 1 to get the maximum depth of the subtree rooted at the current node. That is ```x = max(l, r) + 1```.

It means that for each node, we can get the answer after solving the problem for its children. Therefore, we can solve this problem using a "bottom-up" solution. Here is the pseudocode for the recursive function ```maximum_depth(root)```:

```
1. return 0 if root is null                 // return 0 for null node
2. left_depth = maximum_depth(root.left)
3. right_depth = maximum_depth(root.right)
4. return max(left_depth, right_depth) + 1  // return depth of the subtree rooted at root
```

![image](https://user-images.githubusercontent.com/19383145/124375371-d5b7b880-dc6f-11eb-8ea8-960896f7f197.png)

![image](https://user-images.githubusercontent.com/19383145/124375378-de0ff380-dc6f-11eb-8bbc-824627ed560f.png)

![image](https://user-images.githubusercontent.com/19383145/124375383-e700c500-dc6f-11eb-991b-831269a226ee.png)

![image](https://user-images.githubusercontent.com/19383145/124375388-eec06980-dc6f-11eb-87f1-dce928eb6b36.png)

![image](https://user-images.githubusercontent.com/19383145/124375393-f718a480-dc6f-11eb-828e-94299efa683e.png)

![image](https://user-images.githubusercontent.com/19383145/124375400-fed84900-dc6f-11eb-9fca-9cfdd4f06805.png)

![image](https://user-images.githubusercontent.com/19383145/124375404-07308400-dc70-11eb-94d2-1397f2fea13c.png)

![image](https://user-images.githubusercontent.com/19383145/124375414-0ef02880-dc70-11eb-8247-298fe709e4b8.png)

![image](https://user-images.githubusercontent.com/19383145/124375419-18799080-dc70-11eb-98bf-bef5c1355fed.png)

![image](https://user-images.githubusercontent.com/19383145/124375425-2202f880-dc70-11eb-82e4-dfcb91d8680a.png)

![image](https://user-images.githubusercontent.com/19383145/124375433-2a5b3380-dc70-11eb-80ce-65f991e059a8.png)

![image](https://user-images.githubusercontent.com/19383145/124375440-30e9ab00-dc70-11eb-8272-6264f34d09b6.png)

![image](https://user-images.githubusercontent.com/19383145/124375446-38a94f80-dc70-11eb-80a0-c8a5e974595d.png)

![image](https://user-images.githubusercontent.com/19383145/124375453-419a2100-dc70-11eb-857a-792ab24a59f6.png)

![image](https://user-images.githubusercontent.com/19383145/124375462-4ced4c80-dc70-11eb-88ae-7dfb93c86505.png)

![image](https://user-images.githubusercontent.com/19383145/124375474-5eceef80-dc70-11eb-8205-fd3182f1a74e.png)

![image](https://user-images.githubusercontent.com/19383145/124375492-76a67380-dc70-11eb-8589-52bf2167d24a.png)

![image](https://user-images.githubusercontent.com/19383145/124375497-7f974500-dc70-11eb-86da-1693386cfe9c.png)

![image](https://user-images.githubusercontent.com/19383145/124375502-8756e980-dc70-11eb-8c18-2aaef82ec372.png)

![image](https://user-images.githubusercontent.com/19383145/124375508-9047bb00-dc70-11eb-8067-920d8dad000c.png)

![image](https://user-images.githubusercontent.com/19383145/124375514-9a69b980-dc70-11eb-928a-454ee014f1a8.png)

![image](https://user-images.githubusercontent.com/19383145/124375517-a2c1f480-dc70-11eb-8754-5b6bee5abe8b.png)

![image](https://user-images.githubusercontent.com/19383145/124375525-aa819900-dc70-11eb-81a6-6111d4d55791.png)

![image](https://user-images.githubusercontent.com/19383145/124375530-b2d9d400-dc70-11eb-937c-0457a5ddcf55.png)

![image](https://user-images.githubusercontent.com/19383145/124375534-bbcaa580-dc70-11eb-9ff6-b4510240fe12.png)

```
public int maximum_depth(TreeNode root) {
    if (root == null) {
        return 0;                                   // return 0 for null node
    }
    int left_depth = maximum_depth(root.left);
    int right_depth = maximum_depth(root.right);
    return Math.max(left_depth, right_depth) + 1;   // return depth of the subtree rooted at root
}
```

### Conclusion

It is not easy to understand recursion and find out a recursive solution for the problem. It needs practice.
When you meet a tree problem, ask yourself two questions: Can you determine some parameters to help the node know its answer? Can you use these parameters and the value of the node itself to determine what should be the parameters passed to its children? If the answers are both yes, try to solve this problem using a ```"top-down"``` recursive solution.

Or, you can think of the problem in this way: for a node in a tree, if you know the answer of its children, can you calculate the answer of that node? If the answer is yes, solving the problem recursively using a ```bottom up``` approach might be a good idea.
