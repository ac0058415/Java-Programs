package house;

public class Applainces {

	private String name, brand;
	private int cost;

	public Applainces(String name, String brand, int cost) {
		this.name = name;
		this.brand = brand;
		this.cost = cost;
	}
	
	public int getCost(){
		return this.cost;
	}
	
	public String getApplianceDetails(){
		return ("Applaince: " + this.name + " of " + this.brand + " Costs: " + this.cost);
	}
	
}
