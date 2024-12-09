package eu.mithril.java.edu3;

public class Account {

    private final int id;
    private double balance;
    private static final String CURRENCY = "EUR";

    public Account(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static String getCurrency() {
        return CURRENCY;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

}