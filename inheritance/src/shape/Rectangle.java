package shape;

public class Rectangle {

	private float length,breadth;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	 public float getArea() {
	        return length * breadth;
	    }

	 public float getPerimeter() {
	        return 2 * (length + breadth);
	    }

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	 
	 
}
