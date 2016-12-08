
public class Song {
	private String	artist;
	private String	genre;
	private int		length;
	private String	title;

	public Song(String title, String artist, int length, String genre) {
		super();
		this.title = title;
		this.artist = artist;
		this.length = length;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public String getGenre() {
		return genre;
	}

	public int getLength() {
		return length;
	}
	
	public String getTitle() {
		return title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
