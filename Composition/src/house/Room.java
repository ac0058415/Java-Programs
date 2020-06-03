package house;

public class Room {
	private Area area;
	private Furniture furniture;
	private Balcony balcony;
	private Applainces applainces;
	private String name;
	
	public Room(String name, Area area, Furniture furniture, Balcony balcony, Applainces applainces) {
		this.area = area;
		this.furniture = furniture;
		this.balcony = balcony;
		this.applainces = applainces;
		this.name = name;
	}
	
	public void getRoomDetails(){
		System.out.println("Room Details: " + this.name);
		System.out.println("Area: " + area.getArea());
		System.out.println(furniture.getFurnitureDetails() + '\n' + applainces.getApplianceDetails());
		if(this.balcony == null){
			System.out.println("No balcony");
		} else {
			System.out.println(balcony.getBalconyDetails());
		}
		
		System.out.println("Total cost of " + this.name + ": " + getCostOfRoom());
		System.out.println("========================");
	}
	
	private int getCostOfRoom(){
		return (applainces.getCost() + furniture.getCost());
	}
	
	public int getArea(){
		return area.getArea();
	}
}
