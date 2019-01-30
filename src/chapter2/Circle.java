package chapter2;

public class Circle {
	private double radius;
	
	public Circle(double r) {
		if (r < 0)
			throw new RuntimeException("Radius cannot be negative");
		this.radius = r;
	}
	
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double perimeter() {
		return Math.PI * 2 * this.radius;
	}

}
