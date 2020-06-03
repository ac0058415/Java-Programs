package house;

public class Area {
	private int width, length;

	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	public int getArea(){
		return (this.length * this.width);
	}
	
}
