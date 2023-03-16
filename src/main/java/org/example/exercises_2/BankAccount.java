package exercises_2;

/**
 * Account model.
 * @author Ruben
 */
public class BankAccount {
    String accountNumber;
    private double accountBalance;

    /**
     * Constructor whit 3 params.
     * @param accountNumber .
     * @param accountHolderName .
     * @param initialBalance .
     */
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = initialBalance;
    }

    /**
     * Balance deposit.
     * @param amount .
     */
    public void deposit(double amount) {
        accountBalance += amount;
    }

    /**
     * Withdraw at balance.
     * @param amount .
     */
    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Withdrawal amount exceeds account balance!");
            return;
        }
        accountBalance -= amount;
    }

    /**
     * Balance checking.
     * @return account balance
     */
    public double checkBalance() {
        return accountBalance;
    }
}

