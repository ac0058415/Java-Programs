package billsBurger;

public class Burger {

	private int bread, pattie;
	private String breadName, pattieName, veggies;
	private boolean tomatoes, spinach, onions, mushrooms;
	private double veggieCost;
	
	
	public Burger(int bread, int pattie, boolean tomatoes, boolean spinach, boolean onions, boolean mushrooms) {
		this.bread = bread;
		this.pattie = pattie;
		this.tomatoes = tomatoes;
		this.spinach = spinach;
		this.onions = onions;
		this.mushrooms = mushrooms;
	}
	/*
	public Burger(){
		System.out.println("Make your Burger with anyone of following");
		System.out.println("Breads (any one): 1. Wheat, 2. White, 3. FlatBread");
		System.out.println("Pattie: 1. Meat, 2. Falafel, 3. BlackBean");
		System.out.println("Veggie: 1. Tomatoes, 2. Spinach, 3. Onions, 4. Mushrooms");
	}
	*/
	private double breadCost(){
		if(this.bread == 1){
			this.breadName = "Wheat";
			return 2;
		} else if (this.bread == 2) {
			this.breadName = "White";
			return 3;
		} else if (this.bread == 3) {
			this.breadName = "Flatbread";
			return 4;
		}else {
			System.out.println("Invalid choice");
			return 0;
		}
	}
	
	private double pattieCost(){
		if(this.pattie == 1){
			this.pattieName = "Meat";
			return 2;
		} else if (this.pattie == 2) {
			this.pattieName = "Falafel";
			return 3;
		} else if (this.pattie == 3) {
			this.pattieName = "Black Bean";
			return 4;
		}else {
			System.out.println("Invalid choice");
			return 0;
		}
	}
	
	private double veggieCost(){
		if(this.mushrooms){
			this.veggieCost += 2;
			this.veggies = "Mushrooms ";
		}
		if(this.tomatoes){
			this.veggieCost += 1;
			this.veggies += "Tomatoes ";
		}
		if(this.spinach){
			this.veggieCost += .5;
			this.veggies += "Spinach ";
		}
		if(this.onions){
			this.veggieCost += 3;
			this.veggies += "Onions ";
		}
		return this.veggieCost;
	}
	
	private double burgerCost(){
		
		return (this.breadCost() + this.pattieCost() + this.veggieCost());
	}
	
	public void makeBurger(){
		if(this.breadCost() > 0){
			System.out.println("Preparing your Burger...");
			System.out.println("Total Cost: " + this.burgerCost());
			System.out.println("Bread:  " + this.breadName );
			System.out.println("Pattie: " + this.pattieName);
			System.out.println("Veggies: " + this.veggies);
		}else{
			System.out.println("Please select a bread first");
		}
	}
}
