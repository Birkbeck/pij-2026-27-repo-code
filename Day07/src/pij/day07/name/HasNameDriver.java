package pij.day07.name;

public class HasNameDriver {
    public static void main(String[] args) {
        HasName hasName1 = new City("London", 8900000);
        HasName hasName2 = new Person("George", "Birkbeck");

        IO.println(hasName1.getName());
        IO.println(hasName2.getName());

        //IO.println(hasName1.getPopulation()); // does not work!
    }
}
