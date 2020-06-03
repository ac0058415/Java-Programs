package array;

public class NewsFeed {
	
	int[] views;
	String[] trendingArticals;
	double[] ratings;
	
	public NewsFeed(){
		System.out.println("Object created");
	}
	
	public NewsFeed(String[] initialArticals, int[] initialViews, double[] intitalRating){
		views = initialViews;
		trendingArticals = initialArticals;
		ratings = intitalRating;
	}
	
	public String getTopArticle(){
		return trendingArticals[0];
	}
	
	public void viewArticle(int articleNumber){
		views[articleNumber] = views[articleNumber] + 1;
		System.out.println(trendingArticals[articleNumber] + " has been viewed " + views[articleNumber] + " times");
	}
	
	public void changeRating(int articleNumber, double newRating){
		if(newRating < 6 && newRating > 0){
			ratings[articleNumber] = newRating;
			System.out.println(trendingArticals[articleNumber] + " is now has new rating of " + ratings[articleNumber]);
		}
		else{
			System.out.println("Invalid rating");
		}
	}
	public static void main(String[] args) {	
		
		String[] records = {"2342", "dsfsdf", "2342vsdv"};
		int[] views = {23, 3,5,9};
		double[] ratings = {2.5, 3, 4.9};
		
		NewsFeed cd1 = new NewsFeed(records, views, ratings);
		System.out.println(cd1.trendingArticals[2]);
		cd1.viewArticle(0);
		cd1.changeRating(0, 5);
		

	}

}
