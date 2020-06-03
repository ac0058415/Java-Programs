package playlist;

public class Main {

	public static void main(String[] args) {
		Playlist p1 = new Playlist("P1");
		Playlist p2 = new Playlist("P2");
		
		p1.addAlbumToPlaylist("F");
		p1.addAlbumToPlaylist("G");
		p1.addAlbumToPlaylist("C");
		p1.addAlbumToPlaylist("A");
		p1.addAlbumToPlaylist("D");
		
		p1.addSongToAlbum("C", "SC1", 2.1);
		p1.addSongToAlbum("C", "SC2", 2.2);
		p1.addSongToAlbum("C", "SC3", 2.3);
		p1.addSongToAlbum("C", "SC4", 2.4);
		p1.addSongToAlbum("C", "SC5", 2.5);
	
		p1.addSongToAlbum("F", "SF6", 2.6);
		p1.addSongToAlbum("F", "SF7", 2.7);
		p1.addSongToAlbum("F", "SF8", 2.8);
		
		
		p1.addSongToAlbum("G", "SG1", 2.9);
		p1.addSongToAlbum("G", "SG1", 3);
		
		
		p1.showPlaylist();
		p1.playPlaylist();
	//	System.out.println(p1.totalSongsInPlaylist());
		
	}

}
