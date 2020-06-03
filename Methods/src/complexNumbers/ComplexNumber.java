package complexNumbers;

public class ComplexNumber {
	
	private double real, imaginary;

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}
	
	public String add(double real, double imaginary){
		double a = (this.real + real);
		double b = (this.imaginary + imaginary);
		return (a + " + " + b + "i");
	}
	
	public String subtract(double real, double imaginary){
		double a = (real - this.real);
		double b = (imaginary - this.imaginary);
		return (a + " + " + b + "i");
	}
	
	public String add(ComplexNumber complex){
		return (complex.add(real, imaginary));
		
	}
	
	public String subtract(ComplexNumber complex){
		return (complex.subtract(real, imaginary));	
	}
}
