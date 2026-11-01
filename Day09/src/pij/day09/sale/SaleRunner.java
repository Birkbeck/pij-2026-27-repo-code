package pij.day09.sale;

import java.util.LinkedHashSet;
import java.util.Set;

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

        IO.println("sale1 is: " + sale1);
        IO.println("sale2 is: " + sale2);
        IO.println("sale1.equals(sale2): " + sale1.equals(sale2));
        IO.println("sales.contains(sale1): " + sales.contains(sale1));
        IO.println("sales.contains(sale2): " + sales.contains(sale2));
    }

    static void main() {
        Sale sale1 = new Sale();
        sale1.sold = true;
        sale1.change = 42;
        Sale sale2 = copySale(sale1);
        exerciseSales(sale1, sale2);
    }
}
