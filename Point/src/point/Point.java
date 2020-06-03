package point;

public class Point {
	
	private int x,y;

	public Point(){
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance(){
		return Math.sqrt(((this.x)*(this.x) + (this.y)*(this.y)));
	}
	
	public double distance(int x, int y){
		
		double distance;
		distance = Math.sqrt(((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y)));
		return distance;	
	}
	
	public double distance(Point obj){
		/*
		double distance;
		distance = Math.sqrt((obj.getX()-this.x)*(obj.getX()-this.x) + (obj.getY()-this.y)*(obj.getY()-this.y));
		return distance;
	*/
		return obj.distance(x, y);
	}
}
