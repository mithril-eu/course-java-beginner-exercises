package eu.mithril.java.edu4.oop;

public class Calculator {
    private final CalculationHistory history;
    private double lastResult;

    public Calculator() {
        history = new CalculationHistory();
        lastResult = 0;
    }

    public void add(double a, double b) {
        lastResult = a + b;
        String operation = String.format("%.2f + %.2f = %.2f", a, b, lastResult);
        history.addOperation(operation);
    }

    public void subtract(double a, double b) {
        lastResult = a - b;
        String operation = String.format("%.2f - %.2f = %.2f", a, b, lastResult);
        history.addOperation(operation);
    }

    public void multiply(double a, double b) {
        lastResult = a * b;
        String operation = String.format("%.2f * %.2f = %.2f", a, b, lastResult);
        history.addOperation(operation);
    }

    public void divide(double a, double b) {
        if (b == 0) {
            history.addOperation("Error: Division by zero!");
            return;
        }
        lastResult = a / b;
        String operation = String.format("%.2f / %.2f = %.2f", a, b, lastResult);
        history.addOperation(operation);
    }

    public void printHistory() {
        history.display();
    }
}