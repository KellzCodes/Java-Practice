package Arrays.pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args){
        // Initialize
        List<Integer> integerList0 = new ArrayList<>();
        List<Integer> integerList1; // integerList1 == null

        // Cast an array to a vector
        Integer[] a = {0, 1, 2, 3, 4};
        integerList1 = new ArrayList<>(Arrays.asList(a));

        /*
        * make a copy
        * */
        // Another reference to integerList1
        List<Integer> integerList2 = integerList1;

        // make an actual copy
        List<Integer> integerList3 = new ArrayList<>(integerList1);

        // Get length
        System.out.println("The size of integerList1 is: " + integerList1.size());

        // Access element
        System.out.println("The first element in integerList1 is: " + integerList1.get(0));

        // Iterate the vector
        System.out.print("[Version 1] The contents of integerList1 are:");
        for (int i = 0; i < integerList1.size(); ++i){
            System.out.print(" " + integerList1.get(i));
        }
        System.out.println();

        // Modify element
        integerList2.set(0, 5); // modifying integerList2 will actually modify integerList1
        System.out.println("The first element in integerList1 is: " + integerList1.get(0));
        integerList3.set(0, -1);
        System.out.println("The first element in integerList1 is: " + integerList1.get(0));

        // Sort
        Collections.sort(integerList1);

        // add new element add end of the vector
        integerList1.add(-1);
        integerList1.add(1, 6);

        // Delete the last element
        integerList1.remove(integerList1.size() - 1);

    }
}
