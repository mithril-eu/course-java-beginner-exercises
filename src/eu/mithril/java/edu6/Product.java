package eu.mithril.java.edu6;

public abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculatePrice();

    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
    }
}