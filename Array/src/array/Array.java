package array;

public class Array {

	public String[] getArray(){
		String[] values = {"sfda", "werw"};
		return values;
	}
	public static void main(String[] args) {
		Array a1 = new Array();
		System.out.println(a1.getArray()[1]);

	}

}
