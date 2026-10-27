package pij.day07solutions.vending;

// Ex 12
public class DrinkRefrigerator {

    private final VendingMachine vendingMachine;

    public DrinkRefrigerator(int price) {
        this.vendingMachine = new VendingMachine(price);
    }

    public int buyCan(int money) {
        Sale sale = this.vendingMachine.buy(money);
        if (sale.sold) {
            releaseCan();
        }
        return sale.change;
    }

    private void releaseCan() {
        IO.println("Releasing can...");
    }
}
