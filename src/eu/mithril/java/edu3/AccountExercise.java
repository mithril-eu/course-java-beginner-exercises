package eu.mithril.java.edu3;

public class AccountExercise {

    public static void main(String[] args) {
        // Create two accounts
        Account account1 = new Account(1, 100.00);
        Account account2 = new Account(2, 100.00);

        // Perform operations
        account1.deposit(50.00);
        account2.withdraw(30.00);

        // Print results
        System.out.printf("Account ID %d balance: %.2f %s%n",
                account1.getId(), account1.getBalance(), Account.getCurrency());
        System.out.printf("Account ID %d balance: %.2f %s%n",
                account2.getId(), account2.getBalance(), Account.getCurrency());

    }

}