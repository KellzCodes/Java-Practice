package chapter8;

import java.util.Arrays;

public class QuickSorter {
	
	public void sort(Integer[] data) {
		quicksort(data, 0, data.length-1);
	}
	
	public void quicksort(Integer[] data, int start, int end) {
		if (start < end) {
			int pivotIndex = partition(data, start, end);
			quicksort(data, start, pivotIndex-1);
			quicksort(data, pivotIndex+1, end);
		}
	}
	
	private int partition(Integer[] data, int start, int end) {
		int pivot = data[end];
		int i = start;
		for (int j = start; j <= end - 1; j++) {
			if (data[j] < pivot) {
				int tmp = data[i];
				data[i] = data[j];
				data[j] = tmp;
				i++;
			}
		}
		data[end] = data[i];
		data[i] = pivot;
		return i;
	}
	
	public static void main(String[] args) {
		Integer[] data = {25,5,7,2,18,23,12,18};
		new QuickSorter().sort(data);
		System.out.println(Arrays.toString(data));
	}
	
}
