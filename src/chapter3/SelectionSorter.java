package chapter3;



public class SelectionSorter<T> {
	
	public void sort(Comparable<T>[] objects) {
		for (int i=0; i < objects.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < objects.length; j++) {
				if (objects[j].compareTo((T) objects[minIndex]) < 0) {
					minIndex = j;
				}
			}
			Comparable<T> tmp = objects[minIndex];
			objects[minIndex] = objects[i];
			objects[i] = tmp;
		}
		
	}
	
	public static void main(String[] args) {
		Circle[] circles = new Circle[]{new Circle(12), new Circle(4), 
				new Circle(2), new Circle(19), new Circle(6)};
		SelectionSorter<Circle> sorter = new SelectionSorter<Circle>();
		sorter.sort(circles);
		for (int i=0; i < circles.length; i++) {
			System.out.println(circles[i]);
		}
	}

}
