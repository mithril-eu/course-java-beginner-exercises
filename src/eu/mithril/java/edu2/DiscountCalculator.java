package eu.mithril.java.edu2;

/*
 * Discount Calculator Exercise
 *
 * This program calculates the final price of a purchase after applying various discounts
 * and surcharges based on specific business rules. The goal is to practice creating and
 * using methods for better code organization.
 *
 * Business Rules:
 * 1. Basic discount (10%) applies if:
 *    - Purchase amount is >= 100 OR
 *    - Quantity is >= 5 items
 * 2. Extra discount (additional 5%) applies if:
 *    - BOTH purchase amount >= 100 AND quantity >= 5 items
 * 3. Weekend surcharge (10%) applies if:
 *    - Purchase is made during weekend
 *
 * Exercise Requirements:
 * 1. Create and use separate methods for:
 *    - Main discount calculation (called from main)
 *    - Calculating basic discount
 *    - Calculating extra discount
 *    - Calculating weekend surcharge
 *    - Formatting the detailed calculation output
 * 2. Use constants for all fixed values
 *     - example:
 *       static final int MINIMUM_QUANTITY = 5;
 * 3. Format all monetary values to 2 decimal places
 *
 * Example output:
 * Kupac: Ana Kovačić
 * Početni iznos: 120,00 €
 * Primijenjeni popust: -18,00 €
 * Vikend dodatak: +12,00 €
 * Konačni iznos: 114,00 €
 */

public class DiscountCalculator {
    // TODO: Define constants for business rules

    public static void main(String[] args) {
        // Test cases
        calculateDiscount("Ana Kovačić", 120.0, 6, true);
        calculateDiscount("Marko Horvat", 75.0, 3, false);
        calculateDiscount("Ivan Novak", 200.0, 8, true);
    }

    // TODO: Implement main discount calculation method that orchestrates the process
    public static void calculateDiscount(
            String customerName,
            double purchaseAmount,
            int quantity,
            boolean isWeekend
    ) {
        // This method should:
        // 1. Calculate basic discount by calling calculateBasicDiscount
        // 2. Calculate extra discount by calling calculateExtraDiscount
        // 3. Calculate weekend surcharge by calling calculateWeekendSurcharge
        // 4. Calculate final amount
        // 5. Display results by calling displayCalculation
    }

    // TODO: Create a method to calculate basic discount

    // TODO: Create a method to calculate extra discount

    // TODO: Create a method to calculate weekend surcharge

    // TODO: Create a method to display the calculation details
}