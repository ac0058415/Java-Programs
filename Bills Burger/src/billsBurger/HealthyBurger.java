package billsBurger;

public class HealthyBurger extends Burger {
	private String name;
	
	public HealthyBurger(boolean tomatoes, boolean spinach, boolean onions, boolean mushrooms){
		super(1,3, tomatoes, spinach, onions, mushrooms);
		this.name = "Healthy Burger";
	}

	@Override
	public void makeBurger() {
		System.out.println(this.name);
		super.makeBurger();
	}
	
	
	
}
