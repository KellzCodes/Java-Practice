package chapter3;

public class OrderedArrayDemo {

	public static void main(String[] args) {
		OrderedArray oa = new OrderedArray(10);
		oa.insert(5);
		oa.insert(4);
		oa.insert(10);
		oa.insert(7);
		oa.insert(3);
		oa.insert(6);
		oa.insert(8);
		System.out.println(oa);
		System.out.println(oa.binarySearch(8));
		oa.delete(5);
		System.out.println(oa);
	}
	
}
