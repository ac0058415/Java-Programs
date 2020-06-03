package printer;

public class Main {

	public static void main(String[] args) {
		
		Printer laser = new Printer(true, 200, 80, 20, "HP", "Printer1", true);
		Printer inkJet = new Printer(false, 100, 80, 20, "HP", "Printer2", false);

		laser.showLevelOfInk();
		laser.addInk(50);
	//	laser.showLevelOfInk();
		laser.printPages(110);
	//	laser.showLevelOfInk();
		laser.printPages(10);
		laser.addInk(50);
//		laser.showLevelOfInk();
		laser.printPages(50);
//		laser.showLevelOfInk();
		laser.printPages(50);
//		laser.showLevelOfInk();
		laser.getPagePrinted();
		System.out.println("-------------");
		inkJet.showLevelOfInk();
		inkJet.addInk(50);
//		inkJet.showLevelOfInk();
		inkJet.printPages(110);
//		inkJet.showLevelOfInk();
		inkJet.printPages(10);
//		inkJet.showLevelOfInk();
		inkJet.printPages(50);
		inkJet.addInk(50);
//		inkJet.showLevelOfInk();
		inkJet.printPages(50);
//		inkJet.showLevelOfInk();
		inkJet.addInk(50);
		inkJet.addInk(50);
		inkJet.addInk(50);
		inkJet.getPagePrinted();
	}

}
