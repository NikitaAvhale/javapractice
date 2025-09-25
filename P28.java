package javaprograms;



	import java.util.Scanner;

	public class P28{

	    // Method to calculate area of a rhombus
	    public static double calculateArea(double d1, double d2) {
	        return 0.5 * d1 * d2;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input diagonals
	        System.out.print("Enter the length of the first diagonal: ");
	        double d1 = scanner.nextDouble();

	        System.out.print("Enter the length of the second diagonal: ");
	        double d2 = scanner.nextDouble();

	        // Calculate and display area
	        double area = calculateArea(d1, d2);
	        System.out.printf("Area of the rhombus is: %.2f\n", area);

	        scanner.close();
	    }
	}