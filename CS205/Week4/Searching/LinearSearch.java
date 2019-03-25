import java.util.ArrayList;

/**
 * If we have an ArrayList object and the elements of the ArrayList are in no
 * particular order—that is they are not sorted—then we can locate a specific
 * element K by starting at the first element of the ArrayList and checking to
 * see if that is K. If it is, we are done. If it is not, we move to the second
 * ArrayList element and check to see if it is K. If it is, we are done, but if
 * not then we continue this process to the third, fourth, fifth, ..., last element.
 * If K is in the list, we are guaranteed to eventually stumble across it, and if it
 * is not, we will figure that out when we reach the end of the list.
 * */

public class LinearSearch {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("my");
        arrayList.add("name");
        arrayList.add("is");
        arrayList.add("slim shady");
        int search = linearSearch(arrayList,"is");
        System.out.println(search);
    }
    public static int linearSearch(ArrayList<String> pList, String pKey) {
        for (int i = 0; i < pList.size(); ++i) {
            if (pList.get(i) == pKey) {
                return i;
            }
        } return -1; // Not found
    }
}
