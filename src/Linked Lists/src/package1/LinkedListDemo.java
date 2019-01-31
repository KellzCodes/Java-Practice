package package1;

public class LinkedListDemo {
    public static void main (String[] args){
        // Create new linked list
        LinkedList list = new LinkedList();

        /* Call the insertAtHead method on this List object, and add some values */
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);

        System.out.println(list);
    }
}