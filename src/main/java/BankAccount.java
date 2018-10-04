/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Checkings.
         */
        CHECKINGS,
        /**
         * Savings.
         */
        SAVINGS,
        /**
         * Student.
         */
        STUDENT,
        /**
         * Workplace.
         */
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    private String ownerName;
    public double interestRate;
    private double interestEarned;
    /**
     *
     */
    public BankAccount(final String name, final BankAccountType accountCategory, final int accountNumber,
                       final double accountBalance, final int interestRate) {
        Bank.totalAccounts++;
        this.accountType = accountCategory;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.ownerName = ownerName;
        this.interestRate = interestRate;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
