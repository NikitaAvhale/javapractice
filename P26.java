package javaprograms;



	import java.util.Scanner;

public class P26 {

    // Method to calculate area of an isosceles triangle
    public static double calculateArea(double equalSide, double base) {
        return (base / 4.0) * Math.sqrt(4 * equalSide * equalSide - base * base);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input equal side and base
        System.out.print("Enter the length of the equal sides: ");
        double equalSide = scanner.nextDouble();

        System.out.print("Enter the length of the base: ");
        double base = scanner.nextDouble();

        // Check if the triangle is valid
        if (base >= 2 * equalSide) {
            System.out.println("Invalid dimensions: base must be less than twice the equal side.");
        } else {
            // Calculate and display area
            double area = calculateArea(equalSide, base);
            System.out.printf("Area of the isosceles triangle is: %.2f\n", area);
        }

        scanner.close();
    }

}
