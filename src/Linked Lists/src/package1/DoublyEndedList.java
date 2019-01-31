package package1;

/*
* A doubly ended linked list is type of a linked list has two ends. It has a head and a
* tail. The tail refers to the last element of the linked list. So in this type of a
* linked list, we have references to two elements, the head and the tail. In a doubly
* linked list, we can add and delete elements at both the ends.
* That is the head and the tail.
* */
public class DoublyEndedList {
    // declare two member variables, head and tail
    private Node head;
    private Node tail;

    public void insertAtTail (int data){
        Node newNode = new Node(data);

        // If the head is equal to null, the newNode becomes the head.
        if (this.head == null){
            this.head = newNode;
        }

        // If the tail is not equal to null. The newNode becomes the current tail's NextNode
        if (this.tail != null){
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    @Override
    public String toString(){
        String result = "{";
        Node current = this.head;

        while (current != null){
            result += current.toString() + ", ";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }

}
