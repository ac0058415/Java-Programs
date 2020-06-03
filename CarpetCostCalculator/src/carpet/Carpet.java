package carpet;

public class Carpet {
	
	private double cost;

	public Carpet(double cost) {
		if(cost<0){
			System.out.println("Cost cannot be zero");
			this.cost = 0;
		} else{
			this.cost = cost;
		}
	}

	public double getCost() {
		return cost;
	}
}
