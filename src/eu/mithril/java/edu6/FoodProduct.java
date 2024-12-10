package eu.mithril.java.edu6;

import java.time.LocalDate;

public class FoodProduct extends Product {
    private LocalDate expiryDate;

    public FoodProduct(String name, double price, LocalDate expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculatePrice() {
        if (isNearExpiry()) {
            return price * 0.7;  // 30% discount
        }
        return price;
    }

    private boolean isNearExpiry() {
        return LocalDate.now().plusDays(2).isAfter(expiryDate);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Expiry date: " + expiryDate);
    }
}