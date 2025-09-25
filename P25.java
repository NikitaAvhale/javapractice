package javaprograms;



	import java.util.Scanner;

public class P25 {

    // Method to calculate area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length and width
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate and display area
        double area = calculateArea(length, width);
        System.out.printf("Area of the rectangle is: %.2f\n", area);

        scanner.close();
    }
}

