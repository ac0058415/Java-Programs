package vehical;

public class Trucks extends Vehical{

	private String size;

	public Trucks(String size) {
		super(6, 8, 2, "Big");
		this.size = size;
	}
	
	public String getSize(){
		return this.size;
	}
}
