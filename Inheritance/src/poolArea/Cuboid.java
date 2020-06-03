package poolArea;

public class Cuboid extends Rectangle{

	private double height, width, length;

	public double getHeight() {
		return height;
	}
	
	public Cuboid(double width, double length, double height){
		super(width, length);
		this.height = height;
	}
	
	public double getVolume(){
		return (super.getArea() * this.height);
	}
}
