package ch02;

import org.junit.Test;

import chapter2.Circle;
import static org.junit.Assert.*; 

public class CircleTest {
	
	@Test
	public void testArea() {
		Circle c = new Circle(1);
		assertEquals(Math.PI, c.area(), 0.001);
	}
	
	@Test
	public void testCreationWithNegativeRadius() {
		try {
			Circle c = new Circle(1);
			double area = c.area();
		} catch (Exception rte) {
		}
	}

}
