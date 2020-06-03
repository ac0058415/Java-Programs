package methods;

public class FlourPack {

	public static void main(String[] args) {

		FlourPack obj = new FlourPack();
		if(obj.canPack(4, 3, 11)){
			System.out.println("Valid combination");
		}
		else{
			System.out.println("Invalid combination");
		}
		
	}

	private boolean canPack(int big, int small, int goal){

		int bigWeight = 3;
		int smallWeight = 2;
		int weight = ((big*bigWeight) + (small*smallWeight));
		int bigBagsWeight = big*bigWeight;
		int smallBagsWeight = small*smallWeight;
		
		if(goal <= weight){
			
			//if Bag Bags can cover
			if(bigBagsWeight >= goal){
				int extraWeight = bigBagsWeight - goal;
				
				if((extraWeight/bigWeight >=1) || (extraWeight == 0) ){
					System.out.println("Big bag covers everything! Big bags needed - " + goal/bigWeight);
					return true;
				}
				else{
					System.out.println("Big bag covers everything but not enough count - " + extraWeight);
					return false;
				}
			}
			
			//Big bags are not enough
			else {
				int extraWeightNeededFromSmallBags = goal - bigBagsWeight;
				
				if(extraWeightNeededFromSmallBags <= smallBagsWeight){
					
					if((smallBagsWeight%extraWeightNeededFromSmallBags >= smallWeight) || (extraWeightNeededFromSmallBags == 0) || (extraWeightNeededFromSmallBags == smallBagsWeight)){
						System.out.println("Big bags are not enough! Small bags needed - " + extraWeightNeededFromSmallBags);
						return true;
					}
					else{
						System.out.println("Big bags are not enough and extra small bags have only : " + extraWeightNeededFromSmallBags);
						return false;
					}
				}
				else{
					System.out.println("Big bags are not enough, so the small bags : " + extraWeightNeededFromSmallBags);
					return false;
				}
			}
		}
		else{
			System.out.println("Bags weight is less than goal ");
			return false;
		}
	}
}

