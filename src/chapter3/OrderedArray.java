package chapter3;

import java.util.Arrays;

public class OrderedArray {
	/*
	 * I have used Integer, rather than int, so that we can do null checks to
	 * see if data is present at a particular index or not. This is because java
	 * automatically initializes all elements of arrays, so an int[] will get
	 * initialized to all 0 values. So it will be hard to see if a 0 was really
	 * inserted as part of data, or it is the initialized 0.
	 */
	private Integer[] data;

	/**
	 * We can create an OrderedArray which can hold data upto this size
	 * 
	 * @param size
	 */
	public OrderedArray(int size) {
		this.data = new Integer[size];
	}

	public OrderedArray() {
		this(100); // default size of the array is 100.
	}

	/**
	 * This method implements the binary search algorithm
	 * in an iterative way
	 * @param item
	 * @return the index of the item if found, -1 otherwise
	 */
	public int binarySearch(int item) {
		int maxIndex = size()-1;
		int minIndex = 0;
		int indexToLook = (int) Math.floor((minIndex + maxIndex) / 2);
		while ((data[indexToLook] != item) && (maxIndex > minIndex)) {
			if (data[indexToLook] > item) { // case to search on the left
				maxIndex = indexToLook - 1;
			} else {
				minIndex = indexToLook + 1;
			}
			indexToLook = (int) Math.floor((minIndex + maxIndex) / 2);
		}
		if (data[indexToLook] == item) return indexToLook;
		return -1;
	}

	/**
	 * This method implements the binary search algorithm
	 * in a recursive way. You may take a look at it after completing
	 * the chapter on recursion.
	 * @param item
	 * @return the index of the item if found, -1 otherwise
	 */
//	public int binarySearch(int item) {
//		return binarySearch(item, 0, size()-1);
//	}

	private int binarySearch(int item, int minIndex, int maxIndex) {
		if (minIndex == maxIndex) {
			if (data[minIndex] == item)
				return minIndex;
			return -1;
		}
		int indexToLook = (int) Math.floor((minIndex + maxIndex) / 2);
		if (data[indexToLook] == item) {
			return indexToLook;
		}
		if (data[indexToLook] > item) {
			return binarySearch(item, minIndex, indexToLook - 1);
		}
		// if we are here, then data[indexToLook] < item
		return binarySearch(item, indexToLook + 1, maxIndex);
	}

	public int insert(int item) {
		int i = 0;
		while ((i < data.length) && (data[i] != null)) {
			if (data[i] > item)
				break;
			i++;
		}
		/*
		 * right now i must be pointing to the element which is just greater
		 * than item so we need to first move all elements from index i onwards
		 * to right by one
		 */
		shiftElementsToRight(i);
		data[i] = item;
		return i;
	}

	public int delete(int item) {
		int i = binarySearch(item);
		if (i >= 0) {
			shiftElementsToLeft(i + 1);
		}
		return i;
	}

	/*
	 * This method gives the size upto which elements are present. Because
	 * array length is fixed, all elements will be null initially, then as and
	 * when we add elements, the elements will become not null. So this tells
	 * how many elements are really present in this ordered array
	 */
	private int size() {
		int i = 0;
		while ((i < data.length) && (data[i] != null)) {
			i++;
		}
		return i;
	}

	private void shiftElementsToRight(int startIndex) {
		for (int i = size()-1; i >= startIndex; i--) {
			data[i + 1] = data[i];
		}
	}

	private void shiftElementsToLeft(int startIndex) {
		int maxIndex = size()-1;
		for (int i = startIndex; i <= maxIndex; i++) {
			data[i - 1] = data[i];
		}
		data[maxIndex] = null;
	}

	@Override
	public String toString() {
		return Arrays.deepToString(this.data);
	}
}
