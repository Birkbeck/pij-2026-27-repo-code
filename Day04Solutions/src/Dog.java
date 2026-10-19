public class Dog {
    private String name;
    private String breed;
    private int ageInYears;
    private String owner;
    private String note;

    public Dog(String name, String breed, int ageInYears, String owner, String note) {
        this.name = name;
        this.breed = breed;
        this.ageInYears = ageInYears;
        this.owner = owner;
        this.note = note;
    }

    public void print() {
        String noteToPrint = (note == null || note.isEmpty()) ? "none" : note;
        IO.println(name + " is a " + breed + ", " + ageInYears
                + " old, and owned by " + owner + ". Notes: " + noteToPrint);
    }

    public void incrementAge() {
        ageInYears++;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
