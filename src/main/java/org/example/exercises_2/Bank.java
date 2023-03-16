package exercises_2;

import java.util.ArrayList;

/**
 * Bank.
 * @author Ruben
 */
public class Bank {
    private final ArrayList<BankAccount> accounts;

    /**
     * Constructor with param.
     * @param bankName .
     */
    public Bank(String bankName) {
        accounts = new ArrayList<>();
    }

    /**
     * Account opening.
     * @param accountNumber .
     * @param accountHolderName .
     * @param initialBalance .
     */
    public void openAccount(String accountNumber, String accountHolderName, double initialBalance) {
        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);
        accounts.add(account);
    }

    /**
     * Account closing.
     * @param accountNumber .
     */
    public void closeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).accountNumber.equals(accountNumber)) {
                accounts.remove(i);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    /**
     * Deposit for given account.
     * @param accountNumber .
     * @param amount .
     */
    public void deposit(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.accountNumber.equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    /**
     * Withdraw.
     * @param accountNumber .
     * @param amount .
     */
    public void withdraw(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.accountNumber.equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found!");
    }

    /**
     * Take bank total balance.
     * @return bank balance
     */
    public double getTotalBalance() {
        double totalBalance = 0;
        for (BankAccount account : accounts) {
            totalBalance += account.checkBalance();
        }
        return totalBalance;
    }
}

