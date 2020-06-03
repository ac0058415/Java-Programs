package house;

public class Balcony {
	private Area area;
	private String facing;
	
	public Balcony(Area area, String facing) {
		this.area = area;
		this.facing = facing;
	}
	
	public String getBalconyDetails(){
		return (this.facing + " Balcony of " + this.area.getArea() + " sq ft" );
	}

	public int getArea() {
		return area.getArea();
	}
	
}
