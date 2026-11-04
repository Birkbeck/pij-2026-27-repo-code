package pij.day09solutions.saleAsRecord;

import java.util.LinkedHashSet;
import java.util.Set;

/** Exercise 3.3 */
public class SaleRunner {

    /*
    Benefits of using a record instead of a class with public fields and no
    methods:
    - more convenient access to set the values via the constructor rather
      than one assignment at a time
    - after construction, the fields cannot be modified
    - we automatically have toString(), equals(Object) and hashCode() objects
      that provide 'reasonable' results based on the fields
     */

    public static Sale copySale(Sale sale) {
        // we pass the content of the new record to its constructor
        // instead of accessing the instance variables directly from
        // outside; we read from the old record by using its accessor
        // methods
        Sale newSale = new Sale(sale.sold(), sale.change());
        return newSale;
    }

    public static void exerciseSales(Sale sale1, Sale sale2) {
        Set<Sale> sales = new LinkedHashSet<>();
        sales.add(sale1);

        IO.println("sale1 is: " + sale1); // sale1 is: Sale[sold=true, change=42]
        // the implicitly generated toString() method of our record type
        // tells us something about the /content/ of the object

        IO.println("sale2 is: " + sale2); // sale2 is: Sale[sold=true, change=42]

        IO.println("sale1.equals(sale2): " + sale1.equals(sale2)); // sale1.equals(sale2): true
        // as the /content/ of the different objects sale1 and sale2 is equal,
        // the objects themselves are considered equal by the equals(Object)
        // method of our record type

        IO.println("sales.contains(sale1): " + sales.contains(sale1)); // sales.contains(sale1): true
        // now the content is used for the check; the result is 'true'
        // as before since sale1's content is equal to sale1's content

        IO.println("sales.contains(sale2): " + sales.contains(sale2)); // sales.contains(sale2): true
        // now the content is used for the check; the result is now 'true'
        // as before since sale1's content is equal also to sale2's content
    }

    static void main() {
        Sale sale1 = new Sale(true, 42);

        Sale sale2 = copySale(sale1);

        exerciseSales(sale1, sale2);
    }
}
