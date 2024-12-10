package eu.mithril.java.edu6;

public class ElectronicsWithoutInheritance {

    private String name;
    private double price;
    private int warrantyMonths;

    public ElectronicsWithoutInheritance(String name, double price, int warrantyMonths) {
        this.name = name;
        this.price = price;
        this.warrantyMonths = warrantyMonths;
    }

    public double calculatePrice() {
        return price + (warrantyMonths * 5);
    }

    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warrantyMonths + " months");
    }
}