package methods;

public class Game {

	public static void main(String[] args) {
		Game p1 = new Game();
		int position = p1.calculateHighScorePosition(999);
		p1.displayHighScorePosition("Anupam", position);
		

	}
	
	public static void displayHighScorePosition(String name, int position){
		System.out.println(name + " managed to get into position " + position + " on the hight score table");
	}

	public static int calculateHighScorePosition(int score){
		if(score >= 1000)
			return 1;
		else if(score >= 500 && score <1000)
			return 2;
		else if(score >= 100 && score <500)
			return 3;
		else
			return 4;
	}
	
}
