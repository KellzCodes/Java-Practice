package insertNode;
/*
* A linked list in simple terms is an ordered set of data elements.
* Each element contains a link to its successor.
* So a linked list contains data elements and each element points to the next
* element. And the last element of the sequence points to a null element. These
* data elements are called nodes. The linked list itself contains a reference to
* the first element of the list, which is called the head element.
* */

public class LinkedList {
    // In its simplest form, a linked list is just a head
    private Node head;

    // Inserting a new node at the head is a constant time operation O(1)
    public void insertAtHead(int data){
        // Create new node object
        Node newNode = new Node(data);

        // Make the next node of this new Node object point to the current head
        newNode.setNextNode(this.head);

        /* Make the head of the linked list point to the new Node object,
        * making it the new head element. */
        this.head = newNode;
    }

}
