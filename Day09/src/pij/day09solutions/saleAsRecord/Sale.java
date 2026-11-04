package pij.day09solutions.saleAsRecord;

/** Exercise 3.2 */
public record Sale(boolean sold, int change) {
    // The private final instance variables are automatically created from the
    // parameter variables of our record type. No extra declaration needed!
}
