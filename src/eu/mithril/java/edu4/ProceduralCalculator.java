package eu.mithril.java.edu4;

/*
 * Procedural Calculator
 *
 * Ovaj kalkulator izvodi osnovne aritmetičke operacije i čuva povijest
 * svih izračuna.
 * Program demonstrira proceduralni pristup programiranju koji treba pretvoriti u objektno-orijentirano rješenje.
 *
 * Primijetiti:
 * - globalne varijable za pohranu stanja
 * - proceduralne funkcije koje rade s tim stanjem
 * - izravna manipulacija array-om povijesti izračuna
 */
public class ProceduralCalculator {
    static double lastResult = 0;
    static String[] history = new String[10];  // Stores last 10 operations
    static int historyIndex = 0;

    public static void main(String[] args) {
        add(5, 3);
        subtract(10, 4);
        multiply(4, 3);
        divide(15, 3);
        divide(5, 0);  // should show error

        printHistory();
    }

    static void add(double a, double b) {
        lastResult = a + b;
        addToHistory(String.format("%.2f + %.2f = %.2f", a, b, lastResult));
    }

    static void subtract(double a, double b) {
        lastResult = a - b;
        addToHistory(String.format("%.2f - %.2f = %.2f", a, b, lastResult));
    }

    static void multiply(double a, double b) {
        lastResult = a * b;
        addToHistory(String.format("%.2f * %.2f = %.2f", a, b, lastResult));
    }

    static void divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            addToHistory("Division by zero error");
            return;
        }
        lastResult = a / b;
        addToHistory(String.format("%.2f / %.2f = %.2f", a, b, lastResult));
    }

    static void addToHistory(String operation) {
        history[historyIndex] = operation;
        historyIndex = (historyIndex + 1) % 10;  // circular buffer
    }

    static void printHistory() {
        System.out.println("\nCalculation History:");
        for (String operation : history) {
            if (operation != null) {
                System.out.println(operation);
            }
        }
    }
}