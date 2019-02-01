package package1;

public class DoublyEndedListDemo {
    public static void main(String[] args){
        DoublyEndedList dList = new DoublyEndedList();
        // Call the insertAtTail method on this object that we created, and now print the result.
        dList.insertAtTail(19);
        dList.insertAtTail(18);
        dList.insertAtTail(17);

        System.out.println(dList);
    }
}
