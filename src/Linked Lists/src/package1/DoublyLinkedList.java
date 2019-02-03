package package1;

public class DoublyLinkedList {
    // Declare member variable head
    private Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        // set the new node's next node as the current head
        newNode.setNextNode(this.head);
        /* if the current head is not equal to null, set the current head's previous
        node as the new node

        Note: we have to do this null check because if the list is empty,
        the head will be null, and if we try to access the previous node
        of a null element, we would get a null pointer exception
        */
        if(this.head != null){
            this.head.setPreviousNode(newNode);
        }

        // make the new node as the head of the linked list
        this.head = newNode;
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int length = 0;
        Node current = this.head;

        while(current != null){
            length += 1;
            current = current.getNextNode();
        }
        return length;
    }

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
