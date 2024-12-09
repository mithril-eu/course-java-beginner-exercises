package eu.mithril.java.edu5;

public class GoodAccount {
    private double balance;
    private  String accountHolder;
    private boolean isActive;
    private static final double MAX_DEPOSIT = 10000.0;
    private static final double MAX_WITHDRAWAL = 1000.0;
    private static final double MIN_BALANCE = 0.0;

    public GoodAccount(String holder, double initialBalance) {
        validateHolder(holder);
        validateInitialDeposit(initialBalance);

        this.accountHolder = holder;
        this.balance = initialBalance;
        this.isActive = true;
    }

    private void validateHolder(String holder) {
        if (holder == null || holder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty");
        }
    }

    private void validateInitialDeposit(double amount) {
        if (amount < MIN_BALANCE) {
            throw new IllegalArgumentException("Initial amount cannot be negative");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public boolean isActive() {
        return isActive;
    }

    public void deposit(double amount) {
        validateAccountActive();

        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        if (amount > MAX_DEPOSIT) {
            throw new IllegalArgumentException("Deposit exceeds maximum allowed amount of " + MAX_DEPOSIT);
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        validateAccountActive();

        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > MAX_WITHDRAWAL) {
            throw new IllegalArgumentException("Amount exceeds daily limit of " + MAX_WITHDRAWAL);
        }
        if (balance - amount < MIN_BALANCE) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        balance -= amount;
    }

    private void validateAccountActive() {
        if (!isActive) {
            throw new IllegalStateException("Account is not active");
        }
    }

    public void deactivateAccount() {
        isActive = false;
    }
}
