package poolArea;

public class Rectangle {
	
	private double width, length;

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getArea(){
		return (this.length * this.width);
	}
	
	
}
