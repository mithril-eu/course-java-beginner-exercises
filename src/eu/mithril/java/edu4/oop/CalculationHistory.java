package eu.mithril.java.edu4.oop;

public class CalculationHistory {

    private final String[] operations;
    private int currentIndex;
    private static final int MAX_HISTORY = 10;

    public CalculationHistory() {
        operations = new String[MAX_HISTORY];
        currentIndex = 0;
    }

    public void addOperation(String operation) {
        operations[currentIndex] = operation;
        currentIndex = (currentIndex + 1) % MAX_HISTORY;
    }

    public void display() {
        System.out.println("\nCalculation History:");
        for (String operation : operations) {
            if (operation != null) {
                System.out.println(operation);
            }
        }
    }

}