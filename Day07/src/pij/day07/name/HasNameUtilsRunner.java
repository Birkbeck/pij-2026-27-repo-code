package pij.day07.name;

public class HasNameUtilsRunner {
    public static void main(String[] args) {
        HasName london = new City("London", 8900000);
        HasNameUtils.printName(london);

        HasName birkbeck = new Person("George", "Birkbeck");
        HasNameUtils.printName(birkbeck);
    }
}

