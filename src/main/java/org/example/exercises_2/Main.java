package exercises_2;

/**
 * For test.
 * @author Ruben
 */
public class Main {
    /**
     * Working method.
     * @param args .
     */
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank");

        bank.openAccount("123456", "John Doe", 1000);
        bank.openAccount("789012", "Jane Smith", 500);

        bank.deposit("123456", 500);

        bank.withdraw("789012", 200);

        System.out.println("Total balance: " + bank.getTotalBalance());

        bank.closeAccount("123456");

    }
}
