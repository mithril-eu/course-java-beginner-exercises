package eu.mithril.java.edu6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Without Inheritance:");
        System.out.println("-------------------");

        FoodWithoutInheritance milk = new FoodWithoutInheritance("Milk", 2.99, LocalDate.now().plusDays(1));
        ElectronicsWithoutInheritance phone = new ElectronicsWithoutInheritance("Phone", 599.99, 24);

        milk.displayInfo();
        System.out.println("Final price: €" + milk.calculatePrice());
        System.out.println();

        phone.displayInfo();
        System.out.println("Final price: €" + phone.calculatePrice());

        System.out.println("\nWith Inheritance:");
        System.out.println("----------------");

        Product foodProduct = new FoodProduct("Milk", 2.99, LocalDate.now().plusDays(1));
        Product electronicProduct = new ElectronicProduct("Phone", 599.99, 24);

        foodProduct.displayInfo();
        System.out.println("Final price: €" + foodProduct.calculatePrice());
        System.out.println();

        electronicProduct.displayInfo();
        System.out.println("Final price: €" + electronicProduct.calculatePrice());
    }
}