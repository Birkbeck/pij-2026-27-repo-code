package pij.day06.accounts;

public class SavingsAccountMain {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("J Doe", "12345", 2.0);
        account.deposit(5000); // inherited method
        account.payInterest(); // new method
        System.out.println("Balance in pence after first interest payment: "
                + account.getBalanceInPence()); // inherited method
        account.deposit(3000); // inherited method
        account.withdraw(1000); // overridden method
        account.payInterest(); // new method
        System.out.println("Balance in pence after second interest payment: "
                + account.getBalanceInPence()); // inherited method
    }
}
