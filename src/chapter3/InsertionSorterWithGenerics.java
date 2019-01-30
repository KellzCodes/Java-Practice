package chapter3;

public class InsertionSorterWithGenerics<T> {
	
	public void sort(Comparable<T>[] objects) {
		for (int i=0; i < objects.length; i++) {
			Comparable<T> current = objects[i];
			int j = i-1;
			while (j >= 0 && objects[j].compareTo((T)current) > 0) {
				objects[j+1] = objects[j];
				j--;
			}
			objects[j+1] = current;
		}
	}
	
	public static void main(String[] args) {
		Circle[] circles = new Circle[]{new Circle(12), new Circle(4), 
				new Circle(2), new Circle(19), new Circle(6)};
		InsertionSorterWithGenerics<Circle> sorter = new InsertionSorterWithGenerics<Circle>();
		sorter.sort(circles);
		for (int i=0; i < circles.length; i++) {
			System.out.println(circles[i]);
		}
	}
}
