package eu.mithril.java.edu5;

public class Main {

    public static void main(String[] args) {
        testAccountCreation();
        testWithdrawals();
    }

    private static void testAccountCreation() {
        try {
            // Valid account
            GoodAccount account = new GoodAccount("Ana Horvat", 1000.0);
            System.out.println("Account created successfully: " + account.getAccountHolder());

            // Invalid name
            new GoodAccount("", 1000.0);
            System.out.println("TEST FAILED: Should reject empty name");
        } catch (IllegalArgumentException e) {
            System.out.println("Successfully rejected empty name: " + e.getMessage());
        }

        try {
            // Negative initial amount
            new GoodAccount("Pero Peric", -100.0);
            System.out.println("TEST FAILED: Should reject negative amount");
        } catch (IllegalArgumentException e) {
            System.out.println("Successfully rejected negative amount: " + e.getMessage());
        }
    }

    private static void testWithdrawals() {
        GoodAccount account = new GoodAccount("Ana Horvat", 1000.0);

        try {
            account.withdraw(500.0);
            System.out.println("Successful withdrawal, new balance: " + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("TEST FAILED: Should allow valid withdrawal");
        }

        try {
            account.withdraw(2000.0);
            System.out.println("TEST FAILED: Should reject withdrawal exceeding balance");
        } catch (IllegalArgumentException e) {
            System.out.println("Successfully rejected excessive withdrawal: " + e.getMessage());
        }
    }

}
