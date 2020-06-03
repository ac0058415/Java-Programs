package itinerary;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Cities {
	
	private LinkedList<String> placesToVisit = new LinkedList<String>();
	
	public void addPlacesToVisit(String cityName){
		placesToVisit.add(cityName);
	}
	
	public void printList(){
		Iterator<String> i = placesToVisit.iterator();
		System.out.println("=======================");
		while(i.hasNext()){
			System.out.println("Visiting: " + i.next());
		}
		System.out.println("=======================");
	}
	
	public void removeCity(int index){
		if(index < placesToVisit.size()){
			System.out.println(placesToVisit.get(index) + " removed");
			placesToVisit.remove(index);
		} else{
			System.err.println("Maximum index is " + (placesToVisit.size()-1));
		}
	}
	
	public void removeCity(String cityName){
		int i = returnIndexOfCity(cityName);
		if(i < 0){
			System.err.println(cityName + " not found");
		}else{
			removeCity(i);
		}
	}
	
	private int returnIndexOfCity(String cityName){
		for(int i=0;i<placesToVisit.size();i++){
			if(placesToVisit.get(i).equalsIgnoreCase(cityName)){
				return i;
			}
		}
		return -1;
	}
	
	public void addPlacesToVisitInOrder(String cityName){
		ListIterator<String> i = placesToVisit.listIterator();
		
		if(i.hasNext()){
			while(i.hasNext()){
				int compare = i.next().compareTo(cityName);
				System.err.println("Compare: " + compare + " New City: " + cityName);
				if(compare == 0){
					System.err.println(cityName + " already exists");
					break;
				}else if(compare > 0){
					i.previous();
			//		System.out.println("previous**");
					i.add(cityName);
					break;
				}else if(compare < 0){
			//		System.out.println("next**");
					if(!i.hasNext()){
						i.add(cityName);
					}
				}	
			}
		}else{
			System.out.println("First");	
			i.add(cityName);
		}
	}
	
	private void visitPlace(int option){
		ListIterator<String> list =  placesToVisit.listIterator();
		
		if(list.hasNext()){
			if(option == 1){ //forward
				System.out.println("Moving ahead: " + list.next());
			}else if(option == 2){ //backwards
				if(list.hasPrevious()){
					System.out.println("Moving backwards: " + list.previous());
				}else{
					System.err.println("Starting point");
				}
			}
		}else{
			System.out.println("List is empty");
		}
	}
	
	public void trip(){
		boolean trip = true;
		boolean forward = true;
		Scanner scan = new Scanner(System.in);
		ListIterator<String> list =  placesToVisit.listIterator();
		
		while(trip){
			System.out.println("Enter your choice - \n 1. Next \n 2. Back \n 3. Quit");
					
			if(scan.hasNextInt()){
				int choice = scan.nextInt();
				if(choice == 3){
					System.out.println("Thanks!");
					trip = false;
				}else if(choice == 1){
					if(list.hasNext()){
						if(forward){
							System.out.println("Moving forward: " + list.next());
						}else{
							list.next();
							System.out.println("Moving forward from backwards: " + list.next());
							forward = true;
						}
						
					}else{
						System.out.println("At the end ");
					}
				}else if(choice == 2){
					if(list.hasPrevious()){
						if(forward){
							list.previous();
							System.out.println("Moving backwards from forward: " + list.previous());	
						}else{
							System.out.println("Moving backwards: " + list.previous());
						}
						forward = false;
					}else{
						System.err.println("Starting point");
					}
				}
				else{
					System.err.println("Invalid choice of option");
				}
			}else{
				System.err.println("Invalid choice");
				trip = false;
			}
		}
	}
}

