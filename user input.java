import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter any data: ");

        // Read the entire line including spaces
        String input = scanner.nextLine();  

        // Print the input back to user
        System.out.println("You entered: " + input);

        // Close the scanner to avoid memory leak
        scanner.close();
    }
}
