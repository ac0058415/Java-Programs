package house;

public class House {
	private int plotArea;
	private String name, facing;
	
	private Area balconyArea = new Area(10, 5);
	private Area roomArea = new Area(50, 60); 
	
	private Balcony balcony1 = new Balcony(balconyArea, "North");
	private Balcony balcony2 = new Balcony(balconyArea, "South");
	private Balcony balcony3 = new Balcony(balconyArea, "East");
	
	private Furniture sofa = new Furniture("Sofa", "Ikea", 100);
	private Furniture diningTable = new Furniture("Dining Table", "Ikea", 200);
	private Furniture bed = new Furniture("Bed", "Walmart", 400);
	private Furniture couch = new Furniture("Couch", "Ikea", 200);
	
	private Applainces airConditioner = new Applainces("AC", "Voltas" , 400);
	private Applainces fridge = new Applainces("Fridge", "Voltas" , 400);
	private Applainces tv = new Applainces("TV", "Voltas" , 400);
	private Applainces chimney = new Applainces("Chimney", "Voltas" , 400);
	
	private Room bedroom1 = new Room("Master Bedroom", roomArea, bed, balcony3, airConditioner);
	private Room bedroom2 = new Room("BedRoom", roomArea, bed, balcony1, airConditioner);
	private Room kitchen = new Room("Kitchen", roomArea, diningTable, null, fridge);
	private Room dining = new Room("Dining cum Hall", roomArea, sofa, balcony2, tv);
	
	public House(int plotArea, String name, String facing) {
		this.plotArea = plotArea;
		this.name = name;
		this.facing = facing;
	}
	
	public void getHouseDetails(){
		System.out.println(this.name);
		System.out.println("++++++++++++++++++++++++");
		bedroom1.getRoomDetails();
		bedroom2.getRoomDetails();
		kitchen.getRoomDetails();
		dining.getRoomDetails();
		
	}
	
	public void getRemainingArea(){
		int coveredArea = (bedroom1.getArea() + bedroom2.getArea() + kitchen.getArea() + dining.getArea() + balcony1.getArea() + balcony2.getArea() + balcony3.getArea());
		System.out.println("Covered Area: " +  coveredArea + " out of " + this.plotArea);
	}
}
