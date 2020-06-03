package methods;

public class CalculateFlourPack {

	public static void main(String[] args) {

		CalculateFlourPack obj = new CalculateFlourPack();

		if (obj.canPack(3, 5, 11)) {
			System.out.println("Valid combination");
		} else {
			System.out.println("Invalid combination");
		}

	}

	private boolean canPack(int bigBag, int smallBag, int goal) {

		int bigWeight = 4;
		int smallWeight = 1;
		
		int bigBagCount = calculateBigBagNeeded(bigBag, bigWeight, goal);
		int goalLeft = goal - (bigBagCount * bigWeight);
		System.out.println("Goal: " + goal + '\t' + "Goal Left: " + goalLeft);
		int smallBagCount = calculateSmallBagNeeded(smallBag, smallWeight, goalLeft);
	
		if((bigBagCount<=bigBag) && (smallBagCount <=smallBag) && (bigBagCount >= 0) && (smallBagCount >= 0)){
			return true;
		}
		else
		{
			return false;
		}
	}

	private int calculateSmallBagNeeded(int smallBag, int smallWeight, int goalLeft) {
		int count = goalLeft / smallWeight;
		int smallBagsWeight = smallBag * smallWeight;
		int extraWeight = smallBagsWeight - goalLeft;

		// if small bags can cover the weight
		if ((smallBagsWeight >= goalLeft) && goalLeft > 0) {

			// check if count is enough
			if ((extraWeight == 0) || (extraWeight / smallWeight >= 1)) {

				// if 0 Big bag is needed
				if (count >= 1) {
					System.out.println("Small Bags are enough! Bags needed - " + count);
					return count;
				} else {
					System.out.println("Small Bags are enough but none of them can be used - " + count);
					return count;
				}
			} else {
				System.out.println("Small Bags are enough but not the count - " + count);
				return -1;
			}
		} else if (goalLeft == 0) {
			System.out.println("No Samll Bags needed - " + count);
			return 0;
		}else if (smallBagsWeight == 0) {
			System.out.println("No Samll Bags!  " + extraWeight);
			return extraWeight;
		}
		else {
			System.out.println("Samll Bags are NOT enough, bags needed - " + count);
			return -1;
		}
	}

	private int calculateBigBagNeeded(int bigBag, int bigWeight, int goal) {

		int bigBagsWeight = bigBag * bigWeight;
		int extraWeight = bigBagsWeight - goal;
		int count = goal / bigWeight;
		// if Big Bags can cover the goal
		if (bigBagsWeight >= goal) {

			// check for count of Big bags
			if ((extraWeight == 0) || (extraWeight / bigWeight >= 1)) {

				// if 0 Big bag is needed
				if (count >= 1) {
					System.out.println("Big Bags are enough! Bags needed - " + count);
					return count;
				} else {
					System.out.println("Big Bags are enough but all of them cannot be used - " + count);
					return count;
				}
			} else {
				System.out.println("Big Bags are enough but not enough in count- " + count);
				return count;
			}
		} else if (bigBagsWeight != 0) {
			System.out.println("Big Bags are NOT enough! Big bags used - " + bigBag);
			return bigBag;
		} else {
			System.out.println("No Big Bags!");
			return 0;
		}

	}

}
