import java.util.Scanner;

public class FloatingPointComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two floating-point numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (areSameUpToTwoDecimalPlaces(num1, num2)) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }

        scanner.close();
    }

    public static boolean areSameUpToTwoDecimalPlaces(double num1, double num2) {
        double roundedNum1 = Math.round(num1 * 100) / 100.0;
        double roundedNum2 = Math.round(num2 * 100) / 100.0;

        return roundedNum1 == roundedNum2;
    }
}
