package billsBurger;

import java.util.Scanner;

public class BillsBurger {

	public static void main(String[] args) {
		System.out.println("***Bills Burger***");
		System.out.println("Make your Burger with anyone of following");
		System.out.println("Breads (any one): 1. Wheat, 2. White, 3. FlatBread");
		System.out.println("Pattie: 1. Meat, 2. Falafel, 3. BlackBean");
		System.out.println("Veggie: 1. Tomatoes, 2. Spinach, 3. Onions, 4. Mushrooms");
		System.out.println("*********************");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your bread: ");
		int bread = scan.nextInt();
		System.out.println("Choose your Pattie");
		int pattie = scan.nextInt();
		
		Burger burger1 = new Burger(bread, pattie, true, true, true, true);
		burger1.makeBurger();
		burger1 = new HealthyBurger(false, true, false, true);
		burger1.makeBurger();
		

	}

}
