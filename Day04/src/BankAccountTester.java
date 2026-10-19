public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("George Birkbeck", "123");
        System.out.println("Owner: " + myAccount.getOwner());
        System.out.println("Account number: " + myAccount.getAccountNumber());
        System.out.println("Balance in pence: " + myAccount.getBalanceInPence());
        myAccount.deposit(8000);
        System.out.println("Balance in pence: " + myAccount.getBalanceInPence());
        myAccount.withdraw(5000);
        System.out.println("Balance in pence: " + myAccount.getBalanceInPence());
    }
}
