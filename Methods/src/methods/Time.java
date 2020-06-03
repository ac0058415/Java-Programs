package methods;

public class Time {

	public static void main(String[] args) {
		
		Time t = new Time();
	//	t.getDurationString(123, 25);
		t.getDurationString(32261);
		t.MinutesToYearsDaysCalculator(1052641);
	

	}
	
	private void getDurationString(long min, long sec){
		
		if(min < 0){
			System.out.println(min + " invalid minutes");
		}
		
		else if(sec < 0 || sec > 59){
			System.out.println(sec + " should be between 0 and 59");
		}
		
		else {
			long m = min % 60;
			long h = min / 60;
			
			if(m < 10 || h < 10 || sec < 10){
				System.out.println("Time is: 0" + h + "H 0" + m + "M 0" + sec + "S");
			}
			else {
				System.out.println("Time is: " + h + "H " + m + "M " + sec + "S");
			}
			
		}
		
	}
	
	private void getDurationString(long num){
		
		if(num < 0){
			System.out.println("Time is always >= 0");
		}
		else {
			long min = num / 60;
			long sec = num % 60;
			getDurationString(min, sec);
		}
	}

	private void MinutesToYearsDaysCalculator(long min){
		if(min < 0){
			System.out.println("Invalid value");
		}
		else{
			long mins = min;
			long days = min/(24*60);
			min = min%(24*60);
			long years = days/365;
			days = days%365;
			System.out.println(mins + " minutes = " + years + "Y " + days + "D " + min +" M " );
		}
	}
}
