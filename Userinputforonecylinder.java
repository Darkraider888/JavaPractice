/* Question 2: User input for one cylinder

Modify the Cylinder class so the user can enter values for one cylinder.

Cylinder 1 still uses the default constructor.

Cylinder 2 should take radius and height from the user using Scanner.

Print the volume of both cylinders, formatting output to 2 decimal places. */

import java.util.Scanner;

public class Cylinder {
    private double radius;
    private double height;

    // Default constructor
    public Cylinder() {
        this.radius = 1.0;
        this.height = 1.0;
    }

    // Parameterized constructor with validation
    public Cylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }

    // Setter with validation
    public void setRadius(double radius) {
        this.radius = radius > 0 ? radius : 1.0;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 1.0;
    }

    // Getter methods
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    // Volume calculation
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cylinder using default constructor
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder 1 volume: " + cylinder1.getVolume());

        // Taking input for second cylinder
        System.out.print("Enter radius for Cylinder 2: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter height for Cylinder 2: ");
        double height = scanner.nextDouble();

        Cylinder cylinder2 = new Cylinder(radius, height);
        System.out.println("Cylinder 2 volume: " + cylinder2.getVolume());

        scanner.close();
    }
}
