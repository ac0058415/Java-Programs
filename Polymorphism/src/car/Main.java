package car;

class Car {
	private int cylinder, wheels;
	private String name;
	private boolean engine;
	
	public Car(String name, int cylinder) {
		this.engine = true;
		this.cylinder = cylinder;
		this.wheels = 4;
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void startEngine(){
		System.out.println(this.name + ": Engine started...");
	}
	
	public void accelarate(){
		System.out.println(this.name + ": Accelarated...");
	}
	
	public void brakes(){
		System.out.println(this.name + ": Braking...");
	}
}

class Altima extends Car{
	
	public Altima(){
		super("Altima", 4);
	}

	@Override
	public void startEngine() {
		System.out.println(super.getName() + ": Engine started...");
	}

	@Override
	public void accelarate() {
		System.out.println(super.getName() + ": Accelarated...");
	}

	@Override
	public void brakes() {
		System.out.println(super.getName() + ": Braking...");
	}
}

class SUV extends Car{
	
	public SUV(){
		super("SUV", 4);
	}

	@Override
	public void startEngine() {
		System.out.println(super.getName() + ": Engine started...");
	}

	@Override
	public void accelarate() {
		System.out.println(super.getName() + ": Accelarated...");
	}

	@Override
	public void brakes() {
		System.out.println(super.getName() + ": Braking...");
	}
}
class Impala extends Car{
	
	public Impala(){
		super("Impala", 6);
	}

	@Override
	public void startEngine() {
		System.out.println(super.getName() + ": Engine started...");
	}

	@Override
	public void accelarate() {
		System.out.println(super.getName() + ": Accelarated...");
	}

	@Override
	public void brakes() {
		System.out.println(super.getName() + ": Braking...");
	}
}

public class Main {
	public static void main(String[] args){
		
		Car car = new Altima();
		car.accelarate();
		
		car = new Impala();
		car.brakes();
		
		car = new SUV();
		car.startEngine();
		
		car = new Car("Car", 5);
		car.accelarate();
		
	}
}

