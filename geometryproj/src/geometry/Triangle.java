package geometry;

public class Triangle {

	private double base,height,side1,side2;

	public Triangle(double base, double height, double side1, double side2) {
		super();
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	 public double getArea() {
	       
		 return 0.5 * base * height;
	       
	    }

	    public double getPerimeter() {
	        return side1 + side2 + base;
	    }
	
}
