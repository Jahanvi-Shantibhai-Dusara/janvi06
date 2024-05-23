package info;

import geometry.*;

public class GeometryPackageDemo {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		System.out.println("Circle");
		System.out.println("Area: "+c.getRadius());
		System.out.println("Perimeter: "+c.getPerimeter());
		
		Rectangle r = new Rectangle(5,3);
		System.out.println("Rectangle");
		System.out.println("Area: "+r.getArea());
		System.out.println("Perimeter: "+r.getPerimeter());
		
		Triangle t = new Triangle(5,10,6,5);
		System.out.println("Triangle");
		System.out.println("Area: "+t.getArea());
		System.out.println("Perimeter: "+t.getPerimeter());
	}

}
