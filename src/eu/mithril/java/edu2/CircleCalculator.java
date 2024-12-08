package eu.mithril.java.edu2;

import java.util.Scanner;

/*
 * Circle Calculator Exercise

 * This program calculates the area and perimeter of a circle based on user input.

 * Requirements:
 * 1. Use Scanner class to get radius from user
 * 2. Validate that the input is:
 *    - A valid number (not text or special characters)
 *    - Positive (greater than 0)
 * 3. Calculate and display:
 *    - Area (π * r²)
 *    - Perimeter (2 * π * r)
 * 4. Format results to 2 decimal places
 * 5. Include appropriate error messages for invalid input
 * Tips:
 * - Use Math.PI for the value of π
 * - Use scanner.hasNextDouble() to check if input is a number
 * - Use String.format("%.2f", value) for decimal formatting
 */

public class CircleCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare constant for π
        final double PI = Math.PI;

        // Variable to store radius
        double radius;

        // Input validation loop
        while (true) {
            // Prompt user for input
            System.out.print("Enter the radius of the circle (positive number): ");

            // Check if input is a valid number
            if (!scanner.hasNextDouble()) {
                System.out.println("Error: Please enter a valid number");
                scanner.next(); // Clear invalid input
                continue;      // Restart loop
            }

            // Get the number since we know it's valid
            radius = scanner.nextDouble();

            // Check if number is positive
            if (radius <= 0) {
                System.out.println("Error: Radius must be a positive number");
                continue;      // Restart loop
            }

            // If we get here, input is valid
            break;            // Exit loop
        }

        // Calculate area and perimeter
        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

        // Display results with 2 decimal places
        System.out.println("\nResults for circle with radius " + radius + ":");
        System.out.println("Area: " + String.format("%.2f", area));
        System.out.println("Perimeter: " + String.format("%.2f", perimeter));

        // Close scanner
        scanner.close();
    }
}