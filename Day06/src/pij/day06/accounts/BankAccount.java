package pij.day06.accounts;

/**
 * Class BankAccount models a simple bank account with an owner, an account
 * number, and a balance in pence. BankAccount objects allow for depositing
 * and withdrawing money and for querying the current balance. For simplicity,
 * we assume that a BankAccount object may have a negative balance.
 */
public class BankAccount {
    private String owner;
    private String accountNumber;
    private long balanceInPence;

    /**
     * Sets the account owner and number according to the parameters.
     *
     * @param owner the account owner's name
     * @param accountNumber the account number
     */
    public BankAccount(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
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

    /**
     * Withdraws a given amount in pence from this {@code BankAccount}.
     * Has no effect if {@code pence} is zero or negative.
     *
     * @param pence the amount in pence to withdraw
     */
    public void withdraw(long pence) {
        if (pence <= 0) {
            return;
        }
        balanceInPence -= pence;
    }

    /**
     * Deposits a given amount in pence on this {@code BankAccount}.
     * Has no effect if {@code pence} is zero or negative.
     *
     * @param pence the amount in pence to deposit
     */
    public void deposit(long pence) {
        if (pence <= 0) {
            return;
        }
        balanceInPence += pence;
    }
}
