package eu.mithril.java.edu5;

/*
 * Problemi BadAccount klase:
 *
 * 1. Direktna manipulacija stanjem:
 *    BadAccount account = new BadAccount("Ana", 1000);
 *    account.balance = -50000;  // Ništa ne sprječava negativno stanje
 *
 * 2. Nevažeće ime vlasnika:
 *    account.accountHolder = "";  // Moguće je prazno ime
 *
 * 3. Nekonzistentnost stanja:
 *    account.isActive = false;  // Može se deaktivirati ali i dalje mijenjati stanje
 *    account.balance += 500;    // Nema kontrole nad neaktivnim računima
 *
 * 4. Nema validacije:
 *    account.balance = Double.POSITIVE_INFINITY;  // Nerealno stanje računa
 */
public class BadAccount {
    public double balance;
    public String accountHolder;
    public boolean isActive;

    public BadAccount(String holder, double amount) {
        accountHolder = holder;
        balance = amount;
        isActive = true;
    }

}
