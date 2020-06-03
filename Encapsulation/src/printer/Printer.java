package printer;

public class Printer {
	
	private int cost, levelOfInk, pagePrinted;
	private String brand, name;
	private boolean isDuplex, isNew;
	
	public Printer(boolean isNew, int cost, int levelOfInk, int pagePrinted, String brand, String name, boolean isDuplex) {
		this.cost = cost;
		this.brand = brand;
		this.name = name;
		this.isDuplex = isDuplex;
		
		if(isNew){
			this.levelOfInk = 100;
			this.pagePrinted = 0;
		} else{
			this.levelOfInk = levelOfInk;
			this.pagePrinted = pagePrinted;
		}
	}
	
	public void addInk(int additionalInk){
		
		if(this.levelOfInk < 100){
			int inkNeeded =  (100-this.levelOfInk);
			if(additionalInk <= inkNeeded){
				this.levelOfInk = this.levelOfInk + additionalInk;
				System.out.println(additionalInk + " added");
			}else{
				this.levelOfInk = this.levelOfInk + inkNeeded;
				System.out.println(inkNeeded + " added");
			}
			
			System.out.println("Current level: " + this.levelOfInk);
		}else{
			System.out.println("Ink not required, current level: " + this.levelOfInk);
		}
	}
	
	public void showLevelOfInk(){
		System.out.println("Current level: " + this.levelOfInk);
	}
	
	public void printPages(int count){
		if(this.levelOfInk >= count/2 && isDuplex){ //if Duplex reduce ink = count/2
			showLowInkWarning();
			this.pagePrinted += count;
			this.levelOfInk -= (count/2);
			System.out.println(count + " pages printed, current ink level: " + this.levelOfInk);
		}else if (this.levelOfInk >= count && !isDuplex) { // else reduce ink = count
			showLowInkWarning();	
			this.pagePrinted += count;
			this.levelOfInk -= count;
			System.out.println(count + " pages printed, current ink level: " + this.levelOfInk);
		}else{
			System.out.println("Insufficient ink, cannot print " + count +" pages");
			System.out.println("Current ink level: " + this.levelOfInk);
		}
	}
	
	public void getPagePrinted(){
		System.out.println("Total page printed so far: " + this.pagePrinted);
	}
	
	private String showLowInkWarning(){
		
		if(this.levelOfInk > 0 && this.levelOfInk <= 10){
			return ("Ink level: Very low - " + this.levelOfInk);
		}else if(this.levelOfInk > 10 && this.levelOfInk <=20){
			return ("Ink level: low - " + this.levelOfInk);
		}else if(this.levelOfInk == 0){
			return ("Ink level: No ink, please refill...");
		}else{
			return ("Ink level: " + this.levelOfInk);
		}
	}
}
