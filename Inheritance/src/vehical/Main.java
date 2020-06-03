package vehical;

public class Main {

	public static void main(String[] args) {
		
		Cars altima = new Cars(4, 5, "Sedan", 200);
		Cars impala = new Cars(5, 5, "SUV", 300);
		Trucks truck = new Trucks("Big");
		
		System.out.println(altima.getType() + "  " + altima.getCategory());
		altima.addGear(3);
		impala.addGear(1);
		System.out.println(truck.getWheels());

	}

}
