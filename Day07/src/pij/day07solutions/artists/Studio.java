package pij.day07solutions.artists;

/**
 * Exercise 11.3 (aka Part C).
 * A Studio may have a resident SingerSongwriter.
 * Here delegation is crucial: it would not make sense for Studio
 * to be subclass of SingerSongwriter.
 */
public class Studio implements Songwriter {
    private final String studioName;
    private SingerSongwriter resident;

    /**
     * Creates a Studio with a given name
     *
     * @param name the name of the Studio
     */
    public Studio(String name) {
        this.studioName = name;
    }

    /**
     * Returns the name of the Studio.
     *
     * @return the name of the Studio
     */
    public String getName() {
        return studioName;
    }

    /**
     * Returns the resident or null if there is none.
     *
     * @return the resident or null if there is none.
     */
    public SingerSongwriter getResident() {
        return resident;
    }

    /**
     * Sets the resident.
     *
     * @param resident the resident to set, may be null for none
     */
    public void setResident(SingerSongwriter resident) {
        this.resident = resident;
    }

    /**
     * Records a song with a given {@code title} sung by the given
     * {@code singer}.
     *
     * @param title the title of the song to sing
     * @param singer the singer who will sing the song
     */
    public void recordSong(String title, Singer singer) {
        IO.print(studioName + " recording: ");
        singer.sing(title);
    }

    /**
     * Records a song with a given {@code title} sung by the
     * resident {@code SingerSongwriter}. Prints an error message
     * if there is currently no resident.
     *
     * @param title the title of the song to sing
     */
    public void recordSong(String title) {
        if (resident == null) {
            IO.println(studioName + " currently does not have a resident to record a song!");
            return; // escape clause
        }
        recordSong(title, resident);
    }

    /**
     * Makes the resident {@code SingerSongwriter} write a song with
     * the given {@code title}. Prints an error message if there is
     * currently no resident.
     *
     * @param title the song title
     */
    public void writeSong(String title) {
        if (resident == null) {
            IO.println(studioName + " currently does not have a resident to write a song!");
            return; // escape clause
        }
        IO.print(studioName + " presents: ");
        resident.writeSong(title);
    }
}
