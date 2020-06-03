package carpet;

public class Floor {
	
	private double width, length;

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public Floor(double width, double length) {
		if(width < 0 || length < 0){
			System.out.println("Size cannot be negative");
			this.length = this.width = 0;
		} else {
			this.width = width;
			this.length = length;
		}
	}
	
	public double getArea(){
		return (this.length * this.width);
	}
	
	
}
