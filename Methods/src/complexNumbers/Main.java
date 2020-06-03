package complexNumbers;

public class Main {

	public static void main(String[] args) {
		
		ComplexNumber first = new ComplexNumber(2, 3.1);
		ComplexNumber second = new ComplexNumber(1.5, 2.9);
		
		System.out.println("Addition: " + first.add(1, 1));
		System.out.println("Substraction: " + second.subtract(2, .9));

		System.out.println("Addition: " + first.add(second));
		System.out.println("Substraction: " + second.subtract(second));

	}

}
