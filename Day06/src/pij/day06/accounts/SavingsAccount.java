package pij.day06.accounts;

/**
 * A {@code SavingsAccount} is a {@code BankAccount} that additionally pays
 * interest. Interest is calculated based on the minimum balance since the
 * last interest payment.
 */
public class SavingsAccount extends BankAccount {

    private double interestPercentage;
    private long minBalanceInPence;

    /**
     * Constructs a new {@code SavingsAccount} with given owner,
     * account number, and interest percentage.
     *
     * @param owner the account owner's name
     * @param accountNumber the account number
     * @param interestPercentage the interest percentage
     */
    public SavingsAccount(String owner, String accountNumber,
                          double interestPercentage) {
        super(owner, accountNumber);
        this.interestPercentage = interestPercentage;
    }

    public double getInterestPercentage() {
        return interestPercentage;
    }

    @Override
    public void withdraw(long penceToWithdraw) {
        super.withdraw(penceToWithdraw);
        minBalanceInPence = Math.min(getBalanceInPence(), minBalanceInPence);
    }

    /**
     * Pays interest based on the minimum balance since the last attempt to
     * pay interest. If this interest would be negative, no interest is paid.
     */
    public void payInterest() {
        long interestInPence = (long) (minBalanceInPence * interestPercentage / 100.0);
        if (interestInPence > 0) { // do not pay negative interest
            deposit(interestInPence);
        }
        minBalanceInPence = getBalanceInPence(); // reset the minimum balance
    }
}
