import java.util.ArrayList;

/**
 * If we have an ArrayList object and the elements of the ArrayList are sorted
 * in either ascending (smallest to largest) or descending (largest to smallest)
 * order, then we can more quickly locate the key by taking advantage of the fact
 * that the list is sorted.
 * */

public class BinarySearch {
    public static void main (String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(32);

        int search = binarySearch(arrayList, 5);
        System.out.println(search);
    }
    public static int binarySearch(ArrayList<Integer> arrayList, int key) {
        int low = 0, high = arrayList.size() - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            // Found key. Return the index which is the value of middle.
            if (key == arrayList.get(middle)) {
                return middle;
                // key is in the bottom half of the list. Move high down.
                } else if (key < arrayList.get(middle)) {
                high = middle - 1;
                // key is in the top half of the list. Move low up.
                } else {
                low = middle + 1;
            }
        }
        return -1; // Not found
    }
}
