package ch02;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter2.BubbleSorter;

public class BubbleSorterTest {
	
	@Test
	public void testReverseOrder() {
		int[] data = {8,7,6,4,2};
		new BubbleSorter().sort(data);
		assertArrayEquals(new int[]{2, 4, 6, 7, 8}, data);
	}

	@Test
	public void testHappyDay() {
		int[] data = {8,9,6,4,10};
		new BubbleSorter().sort(data);
		assertArrayEquals(new int[]{4, 6, 8, 9, 10}, data);
	}
	
	@Test
	public void testAlreadySorted() {
		int[] data = {2,4,6,8,10};
		new BubbleSorter().sort(data);
		assertArrayEquals(new int[]{2, 4, 6, 8, 10}, data);
	}
	@Test

	public void testEmpty() {
		int[] data = {};
		new BubbleSorter().sort(data);
		assertArrayEquals(new int[]{}, data);
	}
}
