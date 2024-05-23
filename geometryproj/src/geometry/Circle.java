package geometry;

public class Circle {

	private double radius;

	
	public Circle(double radius) {
		
		this.radius = radius;
	}

	public double getRadius() {
		return 3.14 * radius * radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
	
}
