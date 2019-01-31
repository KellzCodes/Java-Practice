package package1;
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

    /* The length of the link list is defined by the number of nodes that are
    present in the link list */
    public int length(){
        // declare a variable called length and initialize it to zero
        int length = 0;

        // Make the current node point to the head
        Node current = this.head;

        // Traverse through all the nodes on the list.
        while (current != null){
            //  Increment the value of the length and move the current node to the next one
            length ++;
            current = current.getNextNode();
        }
        // Return the length
        return length;
    }

    /*
    * To delete the node at the head, all we need to do is to make the head reference
    * of a link list object point to the next node of the head object. If nothing points
    * to a node, it is not connected to the link list in any way and is ready for
    * garbage collection. So it gets deleted.
    * */
    public void deleteFromHead(){
        // Make the head reference point to the next node of the current head
        this.head = this.head.getNextNode();
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
            result += current.toString() + ",";
            // go to the next node
            current = current.getNextNode();
        }

        // Return the result
        result += "}";
        return result;

    }
}