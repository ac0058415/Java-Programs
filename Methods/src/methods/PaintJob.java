package methods;

public class PaintJob {

	public static void main(String[] args) {
		
		PaintJob obj =  new PaintJob();
		System.out.println("Buckets Needed: " + obj.paintJob(3.4, 2.1, 1.5, 2) + '\n');
		System.out.println("Buckets Needed: " + obj.paintJob(3.4, 2.1, 1.5) + '\n');
		System.out.println("Buckets Needed: " + obj.paintJob(3.4, 1.5) + '\n');

	}
	
	private int paintJob(double width, double height, double areaPerBucket, int extraBucket){
		
		int bucketNeeded = paintJob(width, height, areaPerBucket);

		return (bucketNeeded - extraBucket);
	}

	private int paintJob(double width, double height, double areaPerBucket) {
		
		double areaOfWall = width * height;
		int bucketNeeded = paintJob(areaOfWall, areaPerBucket);
		
		return bucketNeeded;
	}

	private int paintJob(double areaOfWall, double areaPerBucket) {
		
		double bucketNeeded = areaOfWall/areaPerBucket;
		System.out.println("Area of wall: " +  areaOfWall);
		System.out.println("Buckets needed: " + bucketNeeded);
		int count = (int) bucketNeeded;
		System.out.println("Actual buckets needed: " + (count+1));
		return (count+1);
	}

}
