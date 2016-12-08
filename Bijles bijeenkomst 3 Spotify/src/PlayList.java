
public class PlayList {
	private String	name;
	private Song[]	songs;

	public PlayList(String name) {
		super();
		songs = new Song[12];
		this.name = name;
	}

	public void addSong(Song song) {
		if (songs[songs.length - 1] != null) {
			System.out.println("This playlist is full!");
			return;
		}
		
		int counter = 0;

		while (counter < songs.length) {
			if (songs[counter] == null) {
				songs[counter] = song;
				return;
			}

			counter++;
		}
	}
	
	public void removeSong(Song song) {
		int counter = 0;

		while (counter < songs.length) {
			if (songs[counter] != null && songs[counter].equals(song)) {
				songs[counter] = null;
				return;
			}

			counter++;
		}
		
		System.out.println("Song not found in this playlist!");
	}

	public String getName() {
		return name;
	}

	public Song[] getSongs() {
		return songs;
	}

	public void playPlaylist() {
		int counter = 0;

		while (counter < songs.length) {
			Song song = songs[counter];
			counter++;
			
			if (song == null) continue;
			
			System.out.println("Now playing: " + song.getTitle() + " - " + song.getArtist() + " - " + song.getLength()
					+ " - " + song.getGenre());

			// Extra
			try {
				Thread.sleep(song.getLength() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSongs(Song[] songs) {
		this.songs = songs;
	}
}
