# Queue: First-in-first-out Data Structure

In this repo, we will first introduce ```First-in-first-out``` (FIFO) and how it works in a ```queue```.

The goal of this repo is to help you:

1. Understand the ```definition``` of FIFO and queue;
2. Be able to ```implement``` a queue by yourself;
3. Be familiar with the ```built-in queue structure```;
4. Use queue to solve simple problems.

## Practice problems
Try these problems if you want to just dive into practice. 
- [Design your implementation of the circular queue. ](https://github.com/keldavis/Java-Practice/tree/master/Google%20Interview%20Prep/Data%20Structures/Queue%20and%20Stack/1.%20Queue%20First-in-first-out%20Data%20Structure/Design%20Circular%20Queue)
- [Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.](https://github.com/keldavis/Java-Practice/tree/master/Google%20Interview%20Prep/Data%20Structures/Queue%20and%20Stack/1.%20Queue%20First-in-first-out%20Data%20Structure/Moving%20Average%20from%20Data%20Stream)


## First-in-first-out Data Structure

<img src="https://user-images.githubusercontent.com/19383145/123570867-135fa180-d797-11eb-8537-abc16cfdb168.png" alt="FIFO" width="500"/>

In a FIFO data structure, ```the first element added to the queue will be processed first```.

As shown in the picture above, the queue is a typical FIFO data stucture. The insert operation is also called **enqueue** and the new element is always ```added at the end of the queue```. The delete operation is called **dequeue**. You are only allowed to ```remove the first element```.

### Example - Queue

1. ```Enqueue```: below is an example of how a new element 6 is added to the queue.

<img src="https://user-images.githubusercontent.com/19383145/123571091-7f420a00-d797-11eb-9d2f-5456141a3a0f.png" alt="enqueue1" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123571101-8701ae80-d797-11eb-983d-5d106f643c01.png" alt="enqueue2" width="500"/>

2. ```Dequeue```: below is an example of how an element will be removed.

<img src="https://user-images.githubusercontent.com/19383145/123571182-b57f8980-d797-11eb-8b98-a6259bb0f4fd.png" alt="dequeue1" width="500"/>

<img src="https://user-images.githubusercontent.com/19383145/123571199-bc0e0100-d797-11eb-8a82-3474c0e3a63b.png" alt="dequeue2" width="500"/>

## Queue - Implementation

To implement a queue, we may use a dynamic array and an index pointing to the head of the queue.

As mentioned, a queue should support two operations: ```enqueue``` and ```dequeue```. ```Enqueue``` appends a new element to the queue while ```dequeue``` removes the first element. So we need an index to indicate the starting point.

Here is an implementation for your reference:

```
// "static void main" must be defined in a public class.

class MyQueue {
    // store elements
    private List<Integer> data;         
    // a pointer to indicate the start position
    private int p_start;            
    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }
    /** Insert an element into the queue. Return true if the operation is successful. */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    };    
    /** Delete an element from the queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }
    /** Get the front item from the queue. */
    public int Front() {
        return data.get(p_start);
    }
    /** Checks whether the queue is empty or not. */
    public boolean isEmpty() {
        return p_start >= data.size();
    }     
};

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    }
}
```

### Drawback

The implementation above is straightforward but is inefficient in some cases. With the movement of the start pointer, more and more space is wasted. And it will be unacceptable when we only have a space limitation.

![image](https://user-images.githubusercontent.com/19383145/123571451-35a5ef00-d798-11eb-8229-12931628b50f.png)

Let's consider a situation when we are only able to allocate an array whose maximum length is 5. Our solution works well when we have only added less than 5 elements. For example, if we only called the enqueue function four times and we want to enqueue an element 10, we will succeed.

And it is reasonable that we can not accept more enqueue request because the queue is full now. But what if we dequeue an element?

![image](https://user-images.githubusercontent.com/19383145/123571493-53735400-d798-11eb-9735-2a8004e205a2.png)

Actually, we should be able to accept one more element in this case.

## Circular Queue

Previously, we have provided a straightforward but inefficient implementation of queue.

A more efficient way is to use a circular queue. Specifically, we may use a ```fixed-size array``` and ```two pointers``` to indicate the starting position and the ending position. And the goal is to ```reuse the wasted storage``` we mentioned previously.

Let's take a look at an example to see how a circular queue works. You should pay attention to the strategy we use to ```enqueue``` or ```dequeue``` an element.

![image](https://user-images.githubusercontent.com/19383145/123571634-a51bde80-d798-11eb-8004-19861ae53964.png)

![image](https://user-images.githubusercontent.com/19383145/123571656-b06f0a00-d798-11eb-9d8d-c6e9e9d6612e.png)

![image](https://user-images.githubusercontent.com/19383145/123571672-ba910880-d798-11eb-9f74-adb25f38a98c.png)

![image](https://user-images.githubusercontent.com/19383145/123571695-c54b9d80-d798-11eb-9fff-941d28b9a9bf.png)

![image](https://user-images.githubusercontent.com/19383145/123571710-ced50580-d798-11eb-97a5-fc416402dbe2.png)

![image](https://user-images.githubusercontent.com/19383145/123571741-e0b6a880-d798-11eb-9571-783126c235e4.png)

![image](https://user-images.githubusercontent.com/19383145/123571761-e9a77a00-d798-11eb-91d1-6d5888cdb907.png)

![image](https://user-images.githubusercontent.com/19383145/123571783-f75cff80-d798-11eb-84a0-c9aff50c2eeb.png)

![image](https://user-images.githubusercontent.com/19383145/123571801-ffb53a80-d798-11eb-8b33-1af6848a609e.png)

![image](https://user-images.githubusercontent.com/19383145/123571809-08a60c00-d799-11eb-92ad-a8af886c3bc8.png)

![image](https://user-images.githubusercontent.com/19383145/123571827-1196dd80-d799-11eb-852f-9e9deba7c6d1.png)

![image](https://user-images.githubusercontent.com/19383145/123571876-270c0780-d799-11eb-947a-11917576cab1.png)

![image](https://user-images.githubusercontent.com/19383145/123572177-b9141000-d799-11eb-9f2f-2042aba36926.png)

![image](https://user-images.githubusercontent.com/19383145/123572191-c0d3b480-d799-11eb-9207-853e17244207.png)

![image](https://user-images.githubusercontent.com/19383145/123572208-c92bef80-d799-11eb-8326-97534f0961d0.png)

![image](https://user-images.githubusercontent.com/19383145/123572225-d34dee00-d799-11eb-9d06-2f830df30148.png)

![image](https://user-images.githubusercontent.com/19383145/123572242-dcd75600-d799-11eb-8503-9e418b1472f2.png)

Review the animation carefully to figure out the strategy we use to check if a queue is empty or full.

## Circular Queue - Implementation

In a circular queue, we use an ```array``` and two pointers, ```head``` and ```tail```. ```head``` indicates the start position of the queue while ```tail``` indicates the ending position of the queue.

Here we provide the code for your reference:

```
class MyCircularQueue {
    
    private int[] data;
    private int head;
    private int tail;
    private int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        }
        if (isEmpty() == true) {
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[head];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[tail];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return head == -1;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
```

## Queue - Usage

Most popular languages provide built-in Queue library so you don't have to reinvent the wheel.

As mentioned before, the queue has two important operations, ```enqueue``` and ```dequeue```. Besides, we should be able to ```get the first element``` in a queue since the first element should be processed first.

Below are some examples of using the built-in Queue library and its common operations:

```
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        // 1. Initialize a queue.
        Queue<Integer> q = new LinkedList();
        // 2. Get the first element - return null if queue is empty.
        System.out.println("The first element is: " + q.peek());
        // 3. Push new element.
        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);
        // 4. Pop an element.
        q.poll();
        // 5. Get the first element.
        System.out.println("The first element is: " + q.peek());
        // 7. Get the size of the queue.
        System.out.println("The size is: " + q.size());
    }
}
```
