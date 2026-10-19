public class BankAccount {
    private String owner;
    private String accountNumber;
    private long balanceInPence;

    public BankAccount(String theOwner, String theAccountNumber) {
        owner = theOwner;
        accountNumber = theAccountNumber;
        balanceInPence = 0; // start with an empty account
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalanceInPence() {
        return balanceInPence;
    }

    public void withdraw(long pence) {
        balanceInPence = balanceInPence - pence;
    }

    public void deposit(long pence) {
        balanceInPence = balanceInPence + pence;
    }
}
