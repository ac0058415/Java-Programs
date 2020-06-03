package playlist;

public class Song {
	
	private String songName;
	private double songTime;
	
	public Song(String songName, double songTime) {
		this.songName = songName;
		this.songTime = songTime;
	}

	public String getSongName() {
		return songName;
	}

	public double getSongTime() {
		return songTime;
	}
	
	public String getSongDetail(){
		return (this.songName + " :: " + this.songTime);
	}
}
