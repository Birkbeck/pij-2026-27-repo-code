package pij.day07.name;

/**
 * A Person has a given name and a family name (in this simplified model).
 */
public class Person implements HasName {
    private String givenName;
    private String familyName;

    /**
     * Constructs a Person object with a given name and a family name.
     *
     * @param givenName the Person's given name
     * @param familyName the Person's family name
     */
    public Person(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    @Override
    public String getName() {
        return givenName + " " + familyName;
    }

    // ... more methods ...
}
