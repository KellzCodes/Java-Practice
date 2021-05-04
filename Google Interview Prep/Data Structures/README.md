# Overview of Data Structures

A data structure is a particular way of organizing data in a computer so that it can be used effectively. The idea is to reduce the space and time complexities of different tasks. 

- [Linear Data Structures](#Linear-Data-Structures)
	- [Array](#Array)
	- [Linked List](#Linked-List)
	- [Stack](#Stack)
	- [Queue](#Queue)
- [Binary Tree, BST, Heap and Hash](#Binary-tree-bst-heap-and-hash)
	- [Binary Tree](#binary-tree)
	- [Binary Search Tree](#Binary-Search-Tree)
	- [Binary Heap](#Binary-Heap)
	- [Hashing](#Hashing)
- [Graph, Trie, Segment Tree and Suffix Tree](#graph-trie-segment-tree-and-suffix-tree)
	- [Graph](#Graph)
	- [Trie](#Trie)
	- [Segment Tree](#Segment-Tree)
	- [Suffix Tree](#Suffix-Tree)
- [Abstract Data Types](#Abstract-Data-Types)
	- [List ADT](#List-ADT)
	- [Stack ADT](#Stack-ADT)
	- [Queue ADT](#Queue-ADT)

## Linear Data Structures

Below is an overview of some popular linear data structures.

### Array

An array is a simple data structure for storing lots of similar items. They exist in all programming languages, and are used as the basis for most other data structures. On their own, Arrays can be used to solve many interesting problems. Arrays come up very often in interview problems, so being a guru with them is a must!

```
Let size of array be n.

Accessing Time: O(1) [This is possible because elements
                      are stored at contiguous locations] 

Search Time:   O(n) for Sequential Search: 
               O(log n) for Binary Search [If Array is sorted]

Insertion Time: O(n) [The worst case occurs when insertion 
                     happens at the Beginning of an array and 
                     requires shifting all of the elements]

Deletion Time: O(n) [The worst case occurs when deletion 
                     happens at the Beginning of an array and 
                     requires shifting all of the elements]
```

**Example**: Let's say, we want to store the marks of all students in a class. We can use an array. This helps in reducing the use of number of variables as we don’t need to create a separate variable for marks of every subject. All marks can be accessed by simply traversing the array.

### Linked List

A linked list is a linear data structure (like an array) where each element is a separate object. Each element (node) of a list is comprising of two items – the data and a reference to the next node.

Types of Linked List :

1. **Singly Linked List** : In this type of linked list, every node stores address or reference of next node. The last node has the next address or reference as NULL. For example 1->2->3->4->NULL

2. **Doubly Linked List** : In this type of Linked list, there are two references associated with each node: the next node and the previous node. The advantage of this data structure is that we can traverse in both the directions and for deletion, we don’t need to have explicit access to previous node. Eg. NULL<-1<->2<->3->NULL

3. **Circular Linked List** : Linked list where all nodes are connected to form a circle. There is no NULL at the end. A circular linked list can be a singly circular linked list or doubly circular linked list. Advantage of this data structure is that any node can be made as starting node. This is useful in implementation of circular queue in linked list. Eg. 1->2->3->1 [The next pointer of last node is pointing to the first]

```
Accessing time of an element : O(n)

Search time of an element : O(n)

Insertion of an Element : O(1) [If we are at the position 
                                where we have to insert 
                                an element] 

Deletion of an Element : O(1) [If we know address of node
                               previous the node to be 
                               deleted] 
```

**Example** : Consider the previous example where we made an array of student marks. If a new subject is added in the course, its marks should also be added to the array. But the size of the array is fixed and already full so we can not add any new elements. If we make an array of a size lot more than the number of subjects it is possible that most of the array will remain empty. To avoid wasting space, Linked List is formed which adds a node only when a new element is introduced. Insertions and deletions also become easier with linked list.

One big drawback of linked list is random access is not allowed. With arrays, we can access i’th element in O(1) time. In linked list, it takes Θ(i) time.

### Stack

A stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added. In stack, both the operations of push and pop takes place at the same end: the top of the stack. It can be implemented by using both array and linked list.

```
Insertion : O(1)
Deletion :  O(1)
Access Time : O(n) [Worst Case]
Insertion and Deletion are allowed on one end.
```

**Example** : Stacks are used for maintaining function calls (the last called function must finish execution first). We can always alleviate the need for recursion with the help of stacks. Stacks are also used in cases where we have to reverse a word, check for balanced parenthesis, and in editors where the last word you typed is the first to be removed when you use undo operation. Similarly, to implement back functionality in web browsers.

### Queue

A queue or FIFO (first in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: enqueue, the process of adding an element to the collection (The element is added from the rear side) and dequeue, the process of removing the first element that was added (The element is removed from the front side). It can be implemented by using both array and linked list.

```
Insertion : O(1)
Deletion  : O(1)
Access Time : O(n) [Worst Case]
```

**Example**: A queue is like a line at a bus stop or train station. The person who is at the front of the line (stood in line first) is the first one to get a ticket. This data structure is good for any situation where resources are shared among users on a first come, first serve basis. Examples include: CPU scheduling and disk scheduling. Another queue application is when data is transferred asynchonously (data not received at same rate it is sent) between two processes such as: IO Buffers, pipes, file IO, etc.

**Circular Queue** The advantage of this data structure is that it reduces wastage of space in case of array implementation, As the insertion of the (n+1)’th element is done at the 0’th index if it is empty.

## Binary Tree BST Heap and Hash

### Binary Tree

Unlike linear data structures, trees are hierarchical data structures. A binary tree is a data structure in which each node has at most two children, which are called the left child and the right child. It is mainly implemented by using Links.

**Binary Tree Representation**: A tree is represented by a pointer to the topmost node in tree. If the tree is empty, then the value of the root is NULL. A Binary Tree node contains following parts:
1. Data 
2. Pointer to left child 
3. Pointer to right child 

A Binary Tree can be traversed in two ways: 
**Depth First Traversal**: Inorder (Left-Root-Right), Preorder (Root-Left-Right) and Postorder (Left-Right-Root) 
**Breadth First Traversal**: Level Order Traversal 

**Binary Tree Properties**: 

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/BT-properties.jpg" alt="BT-properties" width="500"/>

**Examples**: Binary Trees are perfect for the things that form a hierarchy. They are useful in File structures where there is a specific hierarchy associated with files and directories. Another example where Trees are useful is storing hierarchical objects like JavaScript Document Object Model where an HTML page is considered a tree with a nesting of tags as parent child relations. 

### Binary Search Tree

A Binary Search Tree is a Binary Tree with following additional properties: 
1. The left subtree of a node contains only nodes with keys less than the node’s key. 
2. The right subtree of a node contains only nodes with keys greater than the node’s key. 
3. The left and right subtree each must also be a binary search tree. 

Time Complexities: 

```
Search :  O(h)
Insertion : O(h)
Deletion : O(h)
Extra Space : O(n) for pointers

h: Height of BST
n: Number of nodes in BST

If Binary Search Tree is Height Balanced, 
then h = O(Log n) 

Self-Balancing BSTs such as AVL Tree, Red-Black
Tree and Splay Tree make sure that height of BST 
remains O(Log n)
```

BST provide moderate access/search (quicker than Linked List and slower than arrays). 
BST provide moderate insertion/deletion (quicker than Arrays and slower than Linked Lists). 

**Examples**: BSTs are commonly used in search applications where data is constantly moving in/out and needs to printed in sorted order. For example BSTs are used in E-commerce websites where a new product is added or product goes out of stock and all products are listed in sorted order. 