package vehical;

public class Cars extends Vehical{

	private String type;
	private int topSpeed;
	
	public Cars(int gear, int capacity, String type, int topSpeed) {
		super(gear, 4, capacity, "Small");
		this.type = type;
		this.topSpeed = topSpeed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public void increaseSpeed(int speed){
		this.topSpeed += speed;
	}

	@Override
	public void addGear(int gear) {
		if((this.getGear() + gear) > 6){
			System.out.println("Cannot add gear, max is 6");
		}else{
			super.addGear(gear);
		}
	}
}
