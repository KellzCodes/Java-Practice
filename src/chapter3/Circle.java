package chapter3;

public class Circle implements Comparable<Circle> {
	
	public double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public Circle() {
		this(1);
	}

	@Override
	public int compareTo(Circle o) {
		if (this.radius > o.radius) return 1;
		if (this.radius == o.radius) return 0;
		return -1;
	}
	
	@Override
	public String toString() {
		return "This Circle is of radius: " + this.radius;
	}
	
}
