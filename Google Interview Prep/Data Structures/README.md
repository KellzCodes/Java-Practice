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

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/BT-properties.jpg" alt="BT-properties" width="550"/>

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

### Binary Heap

A Binary Heap is a Binary Tree with following properties. 
1. It’s a complete tree (All levels are completely filled except possibly the last level and the last level has all keys as left as possible). This property of Binary Heap makes them suitable to be stored in an array. 
2. A Binary Heap is either Min Heap or Max Heap. In a Min Binary Heap, the key at root must be minimum among all keys present in Binary Heap. The same property must be recursively true for all nodes in Binary Tree. Max Binary Heap is similar to Min Heap. It is mainly implemented using array. 

```
Get Minimum in Min Heap: O(1) [Or Get Max in Max Heap]
Extract Minimum Min Heap: O(Log n) [Or Extract Max in Max Heap]
Decrease Key in Min Heap: O(Log n)  [Or Decrease Key in Max Heap]
Insert: O(Log n) 
Delete: O(Log n)
```

**Example**: Used in implementing efficient priority-queues, which in turn are used for scheduling processes in operating systems. Priority Queues are also used in Dijikstra’s and Prim’s graph algorithms. 

The Heap data structure can be used to efficiently find the k smallest (or largest) elements in an array, merging k sorted arrays, median of a stream, etc. 

Heap is a special data structure and it cannot be used for searching of a particular element. 

### Hashing

**HashingHash Function**: A function that converts a given big input key to a small practical integer value. The mapped integer value is used as an index in hash table. A good hash function should have following properties 
1. Efficiently computable. 
2. Should uniformly distribute the keys (Each table position equally likely for each key) 

**Hash Table**: An array that stores pointers to records corresponding to a given phone number. An entry in hash table is NIL if no existing phone number has hash function value equal to the index for the entry. 

**Collision Handling**: Since a hash function gets us a small number for a key which is a big integer or string, there is possibility that two keys result in same value. The situation where a newly inserted key maps to an already occupied slot in hash table is called collision and must be handled using some collision handling technique. Following are the ways to handle collisions: 

- **Chaining**: The idea is to make each cell of hash table point to a linked list of records that have same hash function value. Chaining is simple, but requires additional memory outside the table. 

- **Open Addressing**: In open addressing, all elements are stored in the hash table itself. Each table entry contains either a record or NIL. When searching for an element, we one by one examine table slots until the desired element is found or it is clear that the element is not in the table. 

```
Space : O(n)
Search    : O(1) [Average]    O(n) [Worst case]
Insertion : O(1) [Average]    O(n) [Worst Case]
Deletion  : O(1) [Average]    O(n) [Worst Case]
```

Hashing seems better than BST for all the operations. But in hashing, elements are unordered. In BST, elements are stored in order. Also, BST is easy to implement but hash functions can sometimes be very complex to generate. In BST, we can also efficiently find floor and ceil of values.

**Example**: Hashing can be used to remove duplicates from a set of elements. Can also be used find frequency of all items. For example, in web browsers, we can check visited urls using hashing. In firewalls, we can use hashing to detect spam. We need to hash IP addresses. Hashing can be used in any situation where want search() insert() and delete() in O(1) time. 

## Graph Trie Segment Tree and Suffix Tree

### Graph

Graph is a data structure that consists of following two components:
1. A finite set of vertices also called nodes.
2. A finite set of ordered pair of the form (u, v) called edge. The pair is ordered because (u, v) is not same as (v, u) in case of directed graph(di-graph). The pair of form (u, v) indicates that there is an edge from vertex u to vertex v. The edges may contain weight/value/cost.

V -> Number of Vertices.
E -> Number of Edges.

Graph can be represented in many ways, below are the two most common representations :

Let us take below example graph two see two representations of graph.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/Tree_overview_of_data_structures_1.jpg" alt="Tree_overview_of_data_structures_1" width="300"/>

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/Tree_overview_of_data_structures_2.png" alt="Tree_overview_of_data_structures_2" width="300"/>

1. Adjacency Matrix Representation of the above graph

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/Tree_overview_of_data_structures_3.jpg" alt="Tree_overview_of_data_structures_3" width="500"/>

2. Adjacency List Representation of the above Graph

```
Time Complexities in case of Adjacency Matrix :
Traversal :(By BFS or DFS) O(V^2)
Space : O(V^2)

Time Complexities in case of Adjacency List :
Traversal :(By BFS or DFS) O(V + E)
Space : O(V+E)
```

**Examples**: The most common example of the graph is to find shortest path in any network. Used in google maps or bing. Another common use application of graph are social networking websites where the friend suggestion depends on number of intermediate suggestions and other things.

### Trie

Trie is an efficient data structure for searching words in dictionaries, search complexity with Trie is linear in terms of word (or key) length to be searched. If we store keys in binary search tree, a well balanced BST will need time proportional to M * log N, where M is maximum string length and N is number of keys in tree. Using trie, we can search the key in O(M) time. So it is much faster than BST.

Hashing also provides word search in O(n) time on average. But the advantages of Trie are there are no collisions (like hashing) so worst case time complexity is O(n). Also, the most important thing is Prefix Search. With Trie, we can find all words beginning with a prefix (This is not possible with Hashing). The only problem with Tries is they require a lot of extra space. Tries are also known as radix tree or prefix tree.

```
The Trie structure can be defined as follows :
struct trie_node
{
    int value; /* Used to mark leaf nodes */
    trie_node_t *children[ALPHABET_SIZE];
};
```

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/trie_structure.jpg" alt="trie_structure" width="500"/>

```
Insert time : O(M) where M is the length of the string.
Search time : O(M) where M is the length of the string.
Space : O(ALPHABET_SIZE * M * N) where N is number of 
        keys in trie, ALPHABET_SIZE is 26 if we are 
        only considering upper case Latin characters.
Deletion time : O(M)
```

**Example**: The most common use of Tries is to implement dictionaries due to prefix search capability. Tries are also well suited for implementing approximate matching algorithms, including those used in spell checking. It is also used for searching for a Contact from Mobile Contact list OR Phone Directory.

### Segment Tree

This data structure is usually implemented when there are a lot of queries on a set of values. These queries involve minimum, maximum, sum, .. etc on an input range of a given set. Queries also involve updation of values in a given set. Segment Trees are implemented using arrays.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/Tree_overview_of_data_structures_4.jpg" alt="Tree_overview_of_data_structures_4" width="500"/>

```
Construction of segment tree : O(N)
Query : O(log N)
Update : O(log N)
Space : O(N) [Exact space = 2*N-1]
```

**Example**: It is used when we need to find Maximum/Minumum/Sum/Product of numbers in a range.

### Suffix Tree

Suffix Tree is mainly used to search a pattern in a text. The idea is to preprocess the text so that search operation can be done in time linear in terms of pattern length. The pattern searching algorithms like KMP, Z, etc take time proportional to text length. This is really a great improvement because length of pattern is generally much smaller than text.

Imagine we have stored complete work of William Shakespeare and preprocessed it. You can search any string in the complete work in time just proportional to length of the pattern. But using Suffix Tree may not be a good idea when text changes frequently like text editor, etc.

A Suffix Tree is a compressed trie of all suffixes, so the following are very abstract steps to build a suffix tree from given text.
1. Generate all suffixes of given text.
2. Consider all suffixes as individual words and build a compressed trie.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/Tree_overview_of_data_structures_5.jpg" alt="Tree_overview_of_data_structures_5" width="500"/>

**Example**: Used to find find all occurrences of the pattern in string. It is also used to find the longest repeated substring (when text doesn’t change often), the longest common substring and the longest palindrome in a string.

## Abstract Data Types

An abstract Data type (ADT) is a type (or class) for objects whose behaviour is defined by a set of value and a set of operations.

The definition of ADT only mentions what operations are to be performed but not how these operations will be implemented. It does not specify how data will be organized in memory and what algorithms will be used for implementing the operations. It is called “abstract” because it gives an implementation-independent view. The process of providing only the essentials and hiding the details is known as abstraction.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/ADT.jpg" alt="ADT" width="600"/>

The user of a data type does not need to know how that data type is implemented. For example, we have been using Primitive values like int, float, and char only with the knowledge that these data types can operate and be performed on without any idea of how they are implemented. So a user only needs to know what a data type can do, but not how it will be implemented. Think of ADT as a black box which hides the inner structure and design of the data type. Now we’ll define three ADTs namely List ADT, Stack ADT, Queue ADT.

#### List ADT

- The data is generally stored in a key sequence in a list which has a head structure consisting of count, pointers, and address of compare function needed to compare the data in the list.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/ListADTStructure.png" alt="List_ADT_Structure" width="500"/>

- The data node contains the pointer to a data structure and a self-referential pointer which points to the next node in the list.

```
//List ADT Type Definitions
typedef struct node
{
 void *DataPtr;
 struct node *link;
} Node;
typedef struct
{
 int count;
 Node *pos;
 Node *head;
 Node *rear;
 int (*compare) (void *argument1, void *argument2)
} LIST;
```

- The List ADT Functions is given below:

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/ListADTFunctions.png" alt="List_ADT_Functions" width="500"/>

A list contains elements of the same type arranged in sequential order. The following operations can be performed on the list.

- ```get()``` – Return an element from the list at any given position.
- ```insert()``` – Insert an element at any position of the list.
- ```remove()``` – Remove the first occurrence of any element from a non-empty list.
- ```removeAt()``` – Remove the element at a specified location from a non-empty list.
- ```replace()``` – Replace an element at any position by another element.
- ```size()``` – Return the number of elements in the list.
- ```isEmpty()``` – Return true if the list is empty, otherwise return false.
- ```isFull()``` – Return true if the list is full, otherwise return false.

### Stack ADT

- In Stack ADT, the pointer to data is stored instead of data being stored in each node.
- The program allocates memory for the data and the address is passed to the stack ADT.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/StackADT.jpg" alt="stack_adt" width="600"/>

- The head node and the data nodes are encapsulated in the ADT. The calling function can only see the pointer to the stack.
- The stack head structure also contains a pointer to top and count for number of entries currently in stack.

```
//Stack ADT Type Definitions
typedef struct node
{
 void *DataPtr;
 struct node *link;
} StackNode;
typedef struct
{
 int count;
 StackNode *top;
} STACK;
```

A Stack contains elements of the same type arranged in sequential order. All operations take place at a single end that is at the top of the stack. The following operations can be performed:

- ```push()``` – Insert an element at one end of the stack called top.
- ```pop()``` – Remove and return the element at the top of the stack, if it is not empty.
- ```peek()``` – Return the element at the top of the stack without removing it, if the stack is not empty.
- ```size()``` – Return the number of elements in the stack.
- ```isEmpty()``` – Return true if the stack is empty, otherwise return false.
- ```isFull()``` – Return true if the stack is full, otherwise return false.

### Queue ADT

- The queue abstract data type (ADT) follows the basic design of the stack abstract data type.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/QueueADT.png" alt="queue_adt" width="500"/>

- Each node contains a void pointer to the data and a link pointer to the next element in the queue. The program’s responsibility is to allocate memory for storing the data.

```
//Queue ADT Type Definitions
typedef struct node
{
void *DataPtr;
struct node *next;
} QueueNode;
typedef struct
{
QueueNode *front;
QueueNode *rear;
int count;
} QUEUE;
```

A Queue contains elements of the same type arranged in sequential order. Operations take place at both ends, insertion is done at the end and deletion is done at the front. Following operations can be performed:

- ```enqueue()``` – Insert an element at the end of the queue.
- ```dequeue()``` – Remove and return the first element of the queue, if the queue is not empty.
- ```peek()``` – Return the element of the queue without removing it, if the queue is not empty.
- ```size()``` – Return the number of elements in the queue.
- ```isEmpty()``` – Return true if the queue is empty, otherwise return false.
- ```isFull()``` – Return true if the queue is full, otherwise return false.

From these definitions, we can clearly see that the definitions do not specify how these ADTs will be represented and how the operations will be carried out. There can be different ways to implement an ADT, for example, the List ADT can be implemented using arrays, or singly linked list or doubly linked list. Similarly, stack ADT and Queue ADT can be implemented using arrays or linked lists.