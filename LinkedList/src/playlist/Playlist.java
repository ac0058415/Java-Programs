package playlist;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
	
	private String playlistName;
	private LinkedList<Album> albumList;
	
	public Playlist(String playlistName) {
	
		this.playlistName = playlistName;
		this.albumList = new LinkedList<Album>();
	}
	
	public void showPlaylist(){
		System.out.println("**************" + this.playlistName + "**************");
		Iterator<Album> list = this.albumList.iterator();
		while(list.hasNext()){
			list.next().showFullAlbum();
		//	System.out.println(list.next().getAlbumName());
		}
	}
	
	public void addAlbumToPlaylist(String albumName){
		ListIterator<Album> list = this.albumList.listIterator();
		if(returnIndexOfAlbum(albumName) < 0){
			if(list.hasNext()){//something already in the list
				while(list.hasNext()){
					System.out.println("Current :" + list.next().getAlbumName());
					list.previous();
					int compare = list.next().getAlbumName().compareTo(albumName);
					if(compare > 0){
						list.previous();
						list.add(new Album(albumName));
						System.out.println("Previous");
						break;
					}else if(compare < 0){
						System.out.println("After");
						if(!list.hasNext()){//if last item
							list.add(new Album(albumName));
						}
					}
				}
			}else{//first item in the list
				System.out.println("First album");
				list.add(new Album(albumName));
			}
		}else{
			System.err.println(albumName + " already exists");
		}	
	}
	
	private int returnIndexOfAlbum(String albumName){
		for(int i=0;i<this.albumList.size();i++){
			if(this.albumList.get(i).getAlbumName().equalsIgnoreCase(albumName)){
				return i;
			}
		}		
		return -1;
	}
	
	public void addSongToAlbum(String albumName, String songName, double songTime){
		int index = returnIndexOfAlbum(albumName);
		if(index >= 0){
			this.albumList.get(index).addSongToAlbum(songName, songTime);
		}else{
			System.err.println(albumName + " not found!");
		}
	}
	
	public void playPlaylist(){
		boolean moveAhead = true;
		boolean quit = false;
		boolean assign = true;
		Scanner scan = new Scanner(System.in);
		ListIterator<Album> listOfAlbum =  this.albumList.listIterator();
		ArrayList<Song> tempList =  listOfAlbum.next().getSongsList();
		ListIterator<Song> listOfSongsInAlbum = null;
		
		while(assign){
			if(returnListOfSongsInAlbum(tempList)!=null){
				listOfSongsInAlbum = returnListOfSongsInAlbum(tempList);
				System.out.println("----------Playlist " + this.playlistName + "----------");
				System.out.println("Playing " + listOfSongsInAlbum.next().getSongDetail());
				assign = false;
			} else{
				tempList =  listOfAlbum.next().getSongsList();
			}
		}
			
		while(!quit){
			System.out.println("Please enter \n1. Next \n2. Previous \n3. Repeat \n4. Quit");
			if(scan.hasNextInt()){//choice should be integer
				int choice = scan.nextInt();
				
				
				if(choice == 1){//next song			
					if(listOfSongsInAlbum.hasNext()){//album has more songs
						if(moveAhead){
							System.out.println("Playing " + listOfSongsInAlbum.next().getSongDetail());
							System.out.println("Coming");
						}else{//coming from back
							System.out.println("Coming from back");
							if(listOfSongsInAlbum.hasNext()){
								listOfSongsInAlbum.next();
								System.out.println("Playing " + listOfSongsInAlbum.next().getSongDetail());
							}else{
								System.out.println("Moving to next album");
								if(listOfAlbum.hasNext()){//if there is any other album
									tempList =  listOfAlbum.next().getSongsList();
									if(tempList.size() > 0){
										listOfSongsInAlbum = tempList.listIterator();
										System.out.println("tempList: " + tempList.size());
										System.out.println("Playing " + listOfSongsInAlbum.next().getSongDetail());
									}else{
										System.err.println("No song in this album");
									}
								}
							}
							moveAhead = true;
						}
													
					}else{
						System.out.println("Moving to next album");
						if(listOfAlbum.hasNext()){//if there is any other album
							tempList =  listOfAlbum.next().getSongsList();
							if(tempList.size() > 0){
								listOfSongsInAlbum = tempList.listIterator();
								if(moveAhead){
									System.out.println("tempList: " + tempList.size());
									System.out.println("Playing " + listOfSongsInAlbum.next().getSongDetail());
								}else{
									listOfSongsInAlbum.next();
									System.out.println("tempList: " + tempList.size());
									System.out.println("Playing " + listOfSongsInAlbum.next().getSongDetail());
									
								}
								moveAhead = false;
							
							}else{
								System.err.println("No song in this album");
							}
						}else{
							System.err.println("End of playlist");
						}
					}
					
					
					
					
					
				} else if(choice == 2){//reverse
					if(listOfSongsInAlbum.hasPrevious()){
						System.out.println("Playing " + listOfSongsInAlbum.previous().getSongDetail());
						moveAhead = false;
					}else{
						System.err.println("Moving to previous album");
						
					}
					
					
				}
			}else{
				System.err.println("Error! Invalid input");
				quit = true;
			}
			
		}
	}
	
	private ListIterator<Song> returnListOfSongsInAlbum(ArrayList<Song> tempList){
		ListIterator<Song> listOfSongsInAlbum = null;
		if(tempList.size() > 0){
			listOfSongsInAlbum = tempList.listIterator();
		}
		return listOfSongsInAlbum;
	}
	private int totalSongsInPlaylist(){
		int count = 0;
		for(int i=0;i<albumList.size();i++){
			count += albumList.get(i).getSongsList().size();
		}
		return count;
	}
	
	
}
