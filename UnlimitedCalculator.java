/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unlimitedcalculator;
import java.util.Scanner;
public class UnlimitedCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition (unlimited numbers)");
            System.out.println("2. Subtraction (unlimited numbers)");
            System.out.println("3. Multiplication (unlimited numbers)");
            System.out.println("4. Division (unlimited numbers)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator...");
                break;
            }

            System.out.print("How many numbers do you want to enter?  =  ");
            int n = scanner.nextInt();

            double[] numbers = new double[n];

            // Input all numbers
            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextDouble();
            }

            // Perform operation
            switch (choice) {
                case 1: // Addition
                    double sum = 0;
                    for (double num : numbers)
                        sum += num;
                    System.out.printf("Result: %.2f%n", sum);
                    break;

                case 2: // Subtraction
                    double resultSub = numbers[0];
                    for (int i = 1; i < n; i++)
                        resultSub -= numbers[i];
                    System.out.printf("Result: %.2f%n", resultSub);
                    break;

                case 3: // Multiplication
                    double product = 1;
                    for (double num : numbers)
                        product *= num;
                    System.out.printf("Result: %.2f%n", product);
                    break;

                case 4: // Division
                    double resultDiv = numbers[0];
                    boolean zeroFound = false;
                    for (int i = 1; i < n; i++) {
                        if (numbers[i] == 0) {
                            zeroFound = true;
                            break;
                        }
                        resultDiv /= numbers[i];
                    }
                    if (zeroFound) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        System.out.printf("Result: %.2f%n", resultDiv);
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
    
    

