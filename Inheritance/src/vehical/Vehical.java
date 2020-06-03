package vehical;

public class Vehical {
	
	private int gear, wheels, capacity;
	private String category;
	
	public Vehical(int gear, int wheels, int capacity, String category) {
		this.gear = gear;
		this.wheels = wheels;
		this.capacity = capacity;
		this.category = category;
	}

	public int getGear() {
		return gear;
	}

	public int getWheels() {
		return wheels;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getCategory() {
		return category;
	}
	
	public void addGear(int gear){
		this.gear += gear;
		System.out.println("Gear added: " + this.gear);
	}
}
