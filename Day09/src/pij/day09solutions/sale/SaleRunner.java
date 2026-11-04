package pij.day09solutions.sale;

import java.util.LinkedHashSet;
import java.util.Set;

/** Exercise 3.1 */
public class SaleRunner {

    public static Sale copySale(Sale sale) {
        Sale newSale = new Sale();
        newSale.sold = sale.sold;
        newSale.change = sale.change;
        return newSale;
    }

    public static void exerciseSales(Sale sale1, Sale sale2) {
        Set<Sale> sales = new LinkedHashSet<>();
        sales.add(sale1);

        // Exercise 3.1
        IO.println("sale1 is: " + sale1); // sale1 is: pij.day09solutions.sale.Sale@5caf905d
        // uses the toString() method inherited from class Object, which prints
        // class name and hash code

        IO.println("sale2 is: " + sale2); // sale2 is: pij.day09solutions.sale.Sale@8efb846

        IO.println("sale1.equals(sale2): " + sale1.equals(sale2)); // sale1.equals(sale2): false
        // uses the equals(Object) method inherited from class Object,
        // which looks at memory locations and does not consider sale1
        // and sale2 equal

        IO.println("sales.contains(sale1): " + sales.contains(sale1)); // sales.contains(sale1): true
        // internally uses the hashCode() and equals(Object) methods inherited
        // from class Object; since sale1 and sale1 (sic!) are references to
        // the same memory location, the object is found via sale1

        IO.println("sales.contains(sale2): " + sales.contains(sale2)); // sales.contains(sale2): false
        // internally uses the hashCode() and equals(Object) methods inherited
        // from class Object; since sale1 and sale2 are references to
        // different memory locations, they are not considered equal even
        // though they have the same content, and the object is found via sale2
    }

    static void main() {
        Sale sale1 = new Sale();
        sale1.sold = true;
        sale1.change = 42;
        Sale sale2 = copySale(sale1);
        exerciseSales(sale1, sale2);
    }
}
