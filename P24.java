package javaprograms;

	import java.util.Scanner;

	public class P24 {

	    // Method to calculate area of a triangle
	    public static double calculateArea(double base, double height) {
	        return 0.5 * base * height;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input base and height
	        System.out.print("Enter the base of the triangle: ");
	        double base = scanner.nextDouble();

	        System.out.print("Enter the height of the triangle: ");
	        double height = scanner.nextDouble();

	        // Calculate and display area
	        double area = calculateArea(base, height);
	        System.out.printf("Area of the triangle is: %.2f\n", area);

	        scanner.close();
	    }
	}
