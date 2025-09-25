package javaprograms;



	import java.util.Scanner;

	public class P23 {

	    // Method to calculate area of a circle
	    public static double calculateArea(double radius) {
	        return Math.PI * radius * radius;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input radius
	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();

	        // Calculate and display area
	        double area = calculateArea(radius);
	        System.out.printf("Area of the circle is: %.2f\n", area);

	        scanner.close();
	    }
	}

