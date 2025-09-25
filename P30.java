package javaprograms;



	import java.util.Scanner;

	public class P30{
	    // Method to calculate perimeter of a circle
	    public static double calculatePerimeter(double radius) {
	        return 2 * Math.PI * radius;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input radius
	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();

	        // Calculate and display perimeter
	        double perimeter = calculatePerimeter(radius);
	        System.out.printf("Perimeter (Circumference) of the circle is: %.2f\n", perimeter);

	        scanner.close();
	    }
	}