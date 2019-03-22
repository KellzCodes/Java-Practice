package package1;

/*
* A doubly ended linked list is type of a linked list has two ends. It has a head and a
* tail. The tail refers to the last element of the linked list. So in this type of a
* linked list, we have references to two elements, the head and the tail. In a doubly
* linked list, we can add and delete elements at both the ends.
* That is the head and the tail.
* */
public class DoublyEndedList {
    private Node head;

    public void insertAtTail (int data){
        Node newNode = new Node(data);
        Node last = head;

        // New node will be the last node, so it should point to null
        newNode.nextNode = null;

        // If the head is equal to null (or empty), the newNode becomes the head.
        if (this.head == null){
            newNode.previousNode = null;
            this.head = newNode;
            return;
        }

        // Go through until the last node
        while(last.nextNode != null){
            last = last.nextNode;
        }

        // Make the node after the next node the new node
        last.nextNode = newNode;

        // Make the last node the new node's previous node
        newNode.previousNode = last;
    }

    /* Print the data for all the nodes contained in the linked list,
    starting from the head element. */
    @Override
    public String toString(){
        String result = "{";
        // Declare a variable called current, which points to the head
        Node current = this.head;

        /* Go through all the nodes of the list, until the current node
        points to a null.*/
        while (current != null){
            /* get the string created from the Node object and append it
            to the result variable and separate them by using a comma. */
            result += current.toString() + ", ";
            // go to the next node
            current = current.getNextNode();
        }

        // Return the result
        result += "}";
        return result;

    }

}
