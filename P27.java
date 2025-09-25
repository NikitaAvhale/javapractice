package javaprograms;


	import java.util.Scanner;

	public class P27 {

	    // Method to calculate area of a parallelogram
	    public static double calculateArea(double base, double height) {
	        return base * height;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input base and height
	        System.out.print("Enter the base of the parallelogram: ");
	        double base = scanner.nextDouble();

	        System.out.print("Enter the height of the parallelogram: ");
	        double height = scanner.nextDouble();

	        // Calculate and display area
	        double area = calculateArea(base, height);
	        System.out.printf("Area of the parallelogram is: %.2f\n", area);

	        scanner.close();
	    }
	}