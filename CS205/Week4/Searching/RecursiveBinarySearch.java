import java.util.ArrayList;

public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(ArrayList<Integer> arrayList, int key, int low, int high) {
        // Base case. When low is greater than high, we essentially have an empty
        // list, and key cannot be in an empty list so we return -1 (not found).
        if (low > high) { return -1; }
        int middle = (low + high) / 2;
        if (key == arrayList.get(middle)) {
            return middle;
        } else if (key < arrayList.get(middle)) {
            return recursiveBinarySearch(arrayList, key, low, middle - 1);
        } else {
            return recursiveBinarySearch(arrayList, key, middle + 1, high);
        }
    }
}
