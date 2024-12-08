package eu.mithril.java.edu2;

/*
 * FizzBuzz Exercise - Solution
 */
public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String result = getOutputForNumber(i);
            System.out.println(result);
        }
    }

    private static boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private static boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private static String getOutputForNumber(int number) {
        if (isMultipleOfThree(number) && isMultipleOfFive(number)) {
            return "FizzBuzz";
        }
        if (isMultipleOfThree(number)) {
            return "Fizz";
        }
        if (isMultipleOfFive(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

}