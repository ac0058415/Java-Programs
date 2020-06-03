package itinerary;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cities itinerary = new Cities();
		
		itinerary.addPlacesToVisitInOrder("C");
		itinerary.addPlacesToVisitInOrder("C");
		itinerary.addPlacesToVisitInOrder("B");
		itinerary.addPlacesToVisitInOrder("A");
		itinerary.addPlacesToVisitInOrder("D");
		itinerary.addPlacesToVisitInOrder("C");
		
		itinerary.printList();
		
//		itinerary.removeCity(2);
//		itinerary.removeCity("B");
//		itinerary.removeCity("new york");
		
//		itinerary.printList();
		
		itinerary.trip();
		
	}

}

