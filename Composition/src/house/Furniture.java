package house;

public class Furniture {
	private String name, brand;
	private int cost;
	
	public Furniture(String name, String brand, int cost) {
		this.name = name;
		this.brand = brand;
		this.cost = cost;
	}
	
	public String getFurnitureDetails(){
		return ("Furniture: " + this.name + " of " + this.brand + " Costs: " + this.cost);
	}
	
	public int getCost(){
		return this.cost;
	}
}
