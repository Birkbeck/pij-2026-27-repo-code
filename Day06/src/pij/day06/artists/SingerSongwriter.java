package pij.day06.artists;

/**
 * A SingerSongwriter can both sing and write songs.
 */
public class SingerSongwriter /*extends SimpleSinger*/ {
    // Remove the "/*" and the "*/" in the previous line.
    // Will the code still compile? Why (not)?

    /**
     * Writes a song with a given title.
     *
     * @param title the song title
     */
    public void writeSong(String title) {
        IO.println("Writing song with title: " + title);
    }
}
