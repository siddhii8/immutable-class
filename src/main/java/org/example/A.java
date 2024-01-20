package org.example;

// Declare the class as final to prevent subclassing
public final class A {

    // Declare private final fields
    private final String x;
    private final int y;

    // Constructor to initialize the fields
    public A(String x, int y) {
        // Initialize the private final field 'x' with the provided value
        this.x = x;

        // Initialize the private final field 'y' with the provided value
        this.y = y;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of class A with values "10" and 20
        A a1 = new A("10", 20);

        // Print the value of 'x' using the getter method
        System.out.println(a1.getX()); // Output: 10

        // Print the value of 'y' using the getter method
        System.out.println(a1.getY()); // Output: 20
    }

    // Getter method for field 'x'
    public String getX() {
        // Return the value of 'x'
        return x;
    }

    // Getter method for field 'y'
    public int getY() {
        // Return the value of 'y'
        return y;
    }
}
