//Create a Java class named Cylinder that stores the radius and height as double fields and offers two constructors-one that sets both to 1.0 and one parameterized that accepts any positive values.
// a public method getVolume returning volume of the cylinder; in the main method create one Cylinder using the default constructor, 
// a second using the parameterized constructor with any values of your choice, invoke getVolume on both, print each in the format "Cylinder 1 volume:"


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
        this.radius = radius > 0 ? radius :    1.0;
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
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(3.0, 5.0);

        System.out.println("Cylinder 1 volume: " + cylinder1.getVolume());
        System.out.println("Cylinder 2 volume: " + cylinder2.getVolume());
    }
}
