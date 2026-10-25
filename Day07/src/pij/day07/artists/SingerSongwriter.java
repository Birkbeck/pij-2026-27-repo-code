package pij.day07.artists;

/**
 * A SingerSongwriter can both sing and write songs.
 */
public class SingerSongwriter extends SimpleSinger {

    /**
     * Creates a new SingerSongwriter with a given name.
     *
     * @param name the name of this SingerSongwriter
     */
    public SingerSongwriter(String name) {
        super(name);
    }

    /**
     * Writes a song with a given title.
     *
     * @param title the song title
     */
    public void writeSong(String title) {
        IO.println(getName() + " is writing a song with title: " + title);
    }
}
