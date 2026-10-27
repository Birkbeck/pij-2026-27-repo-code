package pij.day07solutions.artists;

/** Driver class for Exercise 11. */
public class MusicDriver {
    static void main() {
        testPartAInterfaces();
        testPartBOperaSinger();
        testPartCStudioClass();
        testPartDInterfaceArray();
    }

    /**
     * Tests Exercise 11.1 (aka Part A).
     */
    private static void testPartAInterfaces() {
        IO.println("=== Test Interfaces Refactoring ===");
        SimpleSinger simpleSinger = new SimpleSinger("John");
        simpleSinger.sing("My Way");

        SingerSongwriter singerSongwriter = new SingerSongwriter("Paul");
        singerSongwriter.writeSong("Hey Jude");
        singerSongwriter.sing("Hey Jude");

        Singer singer = new SimpleSinger("Nena");
        singer.sing("99 Red Balloons");

        Songwriter songwriter = new SingerSongwriter("Taylor Swift");
        songwriter.writeSong("Anti-hero");

        /* EXPECTED OUTPUT
        === Test Interfaces Refactoring ===
        John is singing the song My Way
        Paul is writing a song with title Hey Jude
        Paul is singing the song Hey Jude
        Nena is singing the song 99 Red Balloons
        Taylor Swift is writing a song with title Anti-hero
         */
    }

    /**
     * Tests Exercise 11.2 (aka Part B).
     */
    private static void testPartBOperaSinger() {
        IO.println("=== Test OperaSinger Class ===");
        Singer operaSinger = new OperaSinger("Luciano Pavarotti");
        operaSinger.sing("La Bohème");
        // Uncomment the code below. Examine why it will not compile.
        // How can we make it work?
        // -> We can use a downcast of operaSinger to OperaSinger.
        //    This is safe here because we have written the code such that the
        //    actual object in memory at this point is of type OperaSinger.
        ((OperaSinger)operaSinger).ariaInProgress(true);

        /* EXPECTED OUTPUT
        === Test OperaSinger Class ===
        The opera singer Luciano Pavarotti is singing La Bohème
        Luciano Pavarotti is singing an aria!
         */
    }

    /**
     * Tests Exercise 11.3 (aka Part C).
     */
    private static void testPartCStudioClass() {
        IO.println("=== Test Studio Class ===");
        Studio studio = new Studio("Abbey Road");
        studio.recordSong("Nowhere man");
        studio.recordSong("Hey Jude", new SimpleSinger("Paul"));
        studio.writeSong("Yellow submarine");
        studio.setResident(new SingerSongwriter("Elton John"));
        studio.recordSong("Goodbye Yellow Brick Road");
        studio.writeSong("Birdie song");

        /* EXPECTED OUTPUT
        === Test Studio Class ===
        Abbey Road currently does not have a resident to record a song!
        Abbey Road recording: Paul is singing the song Hey Jude
        Abbey Road currently does not have a resident to write a song!
        Abbey Road recording: Elton John is singing the song Goodbye Yellow Brick Road
        Abbey Road presents: Elton John is writing a song with title Birdie song
         */
    }

    /**
     * Tests Exercise 11.4 (aka Part D).
     */
    private static void testPartDInterfaceArray() {
        IO.println("=== Test Interface Array ===");
        Singer shakira = new SimpleSinger("Shakira");
        SingerSongwriter eltonJohn = new SingerSongwriter("Elton John");
        Studio abbeyRoad = new Studio("Abbey Road");
        abbeyRoad.setResident(new SingerSongwriter("Paul McCartney"));

        Songwriter[] writerAssociationArray = new Songwriter[]{
                eltonJohn,
                abbeyRoad,
                new SingerSongwriter("Suzanne Vega")};

        Singer[] singers = new Singer[]{
                shakira,
                eltonJohn,
                new SimpleSinger("Freddie Mercury")
        };

        for (Singer singer : singers){
            // Ex 11.4 (aka Part D): we can /only/ use methods
            // available in interface Singer here, even if some
            // objects may have further methods.
            singer.sing("My Way");
        }

        for (Songwriter songwriter : writerAssociationArray){
            // Ex 11.4 (aka Part D): we can /only/ use methods
            // available in interface Songwriter here, even if some
            // objects may have further methods.
            songwriter.writeSong("New Song");
        }

        /* EXPECTED OUTPUT
        === Test Interface Array ===
        Shakira is singing the song My Way
        Elton John is singing the song My Way
        Freddie Mercury is singing the song My Way
        Elton John is writing a song with title New Song
        Abbey Road presents: Paul McCartney is writing a song with title New Song
        Suzanne Vega is writing a song with title New Song
         */
    }
}
