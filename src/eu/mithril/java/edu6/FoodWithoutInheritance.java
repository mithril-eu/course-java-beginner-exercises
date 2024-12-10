package eu.mithril.java.edu6;

import java.time.LocalDate;

public class FoodWithoutInheritance {

    private String name;
    private double price;
    private LocalDate expiryDate;

    public FoodWithoutInheritance(String name, double price, LocalDate expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public double calculatePrice() {
        if (isNearExpiry()) {
            return price * 0.7;
        }
        return price;
    }

    private boolean isNearExpiry() {
        return LocalDate.now().plusDays(2).isAfter(expiryDate);
    }

    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Expiry date: " + expiryDate);
    }
}