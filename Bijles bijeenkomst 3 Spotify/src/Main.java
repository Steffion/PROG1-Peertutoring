
public class Main {
	
	public static void main(String[] args) {
		PlayList top40List = new PlayList("Top 40 week 49 2016");
		
		Song testSong = new Song("Rockabye", "Clean bandit", 8, "Pop");
		
		top40List.addSong(new Song("Starboy", "The weeknd", 6, "Pop"));
		top40List.addSong(new Song("Say you won't let me down", "James Arthur", 3, "Pop"));
		top40List.addSong(testSong);
		top40List.addSong(new Song("Mercy", "Shawn mendes", 7, "Pop"));
		
		top40List.playPlaylist();
		
		top40List.removeSong(testSong);
		System.out.println("Remove twice:");
		top40List.removeSong(testSong);
	}
	
}
