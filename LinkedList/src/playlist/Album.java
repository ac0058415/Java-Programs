package playlist;

import java.util.ArrayList;

public class Album {

	private String albumName;
	private ArrayList<Song> songsList;
	
	public Album(String albumName) {
	
		this.albumName = albumName;
		songsList = new ArrayList<Song>();
	}
	
	public String getAlbumName() {
		return albumName;
	}

	public ArrayList<Song> getSongsList() {
		return songsList;
	}

	public void addSongToAlbum(String songName, double songTime){
		if(returnSongPosition(songName) < 0){
			songsList.add(new Song(songName, songTime));
			System.out.println(songName + " added at " +  songsList.size());
		}else{
			System.err.println(songName + " already there at " + returnSongPosition(songName));
		}
	}
	
	public void removeSongFromAlbum(String songName){
		int position = returnSongPosition(songName);
		if(position > 0){
			System.out.println("Removing " + songName);
			songsList.remove(position);
		}else{
			System.err.println(songName + " not found!");
		}
	}
	
	public void showFullAlbum(){
		System.out.println("**************" + this.albumName + "**************");
		double totalTime = 0;
		for(int i=0;i<songsList.size();i++){
			System.out.println((i+1) + ". " + this.songsList.get(i).getSongName() + " : " + this.songsList.get(i).getSongTime());
			totalTime += this.songsList.get(i).getSongTime();
		}
		System.out.println("Total Songs: " + this.songsList.size() + " : " + " Total Time: " + totalTime);
		
	}
	
	private int returnSongPosition(String songName){
		for(int i=0;i<songsList.size();i++){
			if(songsList.get(i).getSongName().equalsIgnoreCase(songName)){
				return i;
			}
		}
		return -1;
	}
	
	
}
