package org.example;

/**
 * Class representing a rectangle.
 */
public class Rectangle {
    private double width;
    private double height;

    /**
     * Creates a new rectangle with the specified dimensions.
     *
     * @param width  the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    public double calculateArea() {
        return width * height;
    }

    /**
     * The main method to run the Rectangle class.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area: " + rectangle.calculateArea());
    }
}