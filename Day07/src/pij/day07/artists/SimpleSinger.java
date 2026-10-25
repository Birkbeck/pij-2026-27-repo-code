package pij.day07.artists;

/**
 * A SimpleSinger has a name and can sing songs.
 */
public class SimpleSinger {

    /** The name of this SimpleSinger. */
    private String name;

    /**
     * Creates a new SimpleSinger with a given name.
     *
     * @param name the name of this SimpleSinger
     */
    public SimpleSinger(String name) {
        this.name = name;
    }

    /**
     * Returns the name of this SimpleSinger.
     *
     * @return the name of this SimpleSinger
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sings a specific song.
     *
     * @param song the song to sing
     */
    public void sing(String song) {
        IO.println(name + " is singing a song: " + song);
    }
}
