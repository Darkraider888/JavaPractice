import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Ask user to enter second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculations
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : 0; // Avoid divide by zero

        // Display results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + product);

        if (num2 != 0)
            System.out.println("Division: " + division);
        else
            System.out.println("Division: Cannot divide by zero!");

        // Close scanner
        scanner.close();
    }
}
