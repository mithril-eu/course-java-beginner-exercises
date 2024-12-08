package eu.mithril.java.edu2;

/**
 * Discount Calculator Exercise - Solution
 */
public class DiscountCalculator {
    // Constants for business rules
    private static final double BASIC_DISCOUNT = 0.10;     // 10% basic discount
    private static final double EXTRA_DISCOUNT = 0.05;     // 5% extra discount
    private static final double WEEKEND_SURCHARGE = 0.10;  // 10% weekend surcharge
    private static final double MINIMUM_PURCHASE = 100.0;  // 100€ minimum for discount
    private static final int BULK_QUANTITY = 5;            // minimum items for discount

    public static void main(String[] args) {
        // Test cases with Croatian names
        calculateDiscount("Ana Kovačić", 120.0, 6, true);
        System.out.println("------------------------");
        calculateDiscount("Marko Horvat", 75.0, 3, false);
        System.out.println("------------------------");
        calculateDiscount("Ivan Novak", 200.0, 8, true);
    }

    public static void calculateDiscount(String customerName, double purchaseAmount,
                                         int quantity, boolean isWeekend) {
        // Calculate discounts and surcharge
        double basicDiscount = calculateBasicDiscount(purchaseAmount, quantity);
        double extraDiscount = calculateExtraDiscount(purchaseAmount, quantity);
        double totalDiscount = basicDiscount + extraDiscount;
        double surcharge = calculateWeekendSurcharge(purchaseAmount, isWeekend);

        // Calculate final amount
        double finalAmount = purchaseAmount - totalDiscount + surcharge;

        // Display results
        displayCalculation(customerName, purchaseAmount, totalDiscount, surcharge, finalAmount);
    }

    private static double calculateBasicDiscount(double amount, int quantity) {
        if (amount >= MINIMUM_PURCHASE || quantity >= BULK_QUANTITY) {
            return amount * BASIC_DISCOUNT;
        }
        return 0.0;
    }

    private static double calculateExtraDiscount(double amount, int quantity) {
        if (amount >= MINIMUM_PURCHASE && quantity >= BULK_QUANTITY) {
            return amount * EXTRA_DISCOUNT;
        }
        return 0.0;
    }

    private static double calculateWeekendSurcharge(double amount, boolean isWeekend) {
        if (isWeekend) {
            return amount * WEEKEND_SURCHARGE;
        }
        return 0.0;
    }

    private static void displayCalculation(
            String customerName,
            double originalAmount,
            double discount,
            double surcharge,
            double finalAmount
    ) {
        System.out.println("Kupac: " + customerName);
        System.out.println("Početni iznos: " + String.format("%.2f €", originalAmount));

        if (discount > 0) {
            System.out.println("Primijenjeni popust: -" + String.format("%.2f €", discount));
        } else {
            System.out.println("Popust nije primijenjen");
        }

        if (surcharge > 0) {
            System.out.println("Vikend dodatak: +" + String.format("%.2f €", surcharge));
        }

        System.out.println("Konačni iznos: " + String.format("%.2f €", finalAmount));
    }

}