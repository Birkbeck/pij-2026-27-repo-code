package pij.day07.name;

/**
 * A city has a name and a population size.
 */
public class City implements HasName {

    private String name;
    private int population;

    /**
     * Constructs a City object with the provided name and population.
     *
     * @param name the name of this City
     * @param population the population of this City
     */
    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * Returns the population of this City.
     *
     * @return the population of this City
     */
    public int getPopulation() {
        return population;
    }

    // ... more methods ...
}
