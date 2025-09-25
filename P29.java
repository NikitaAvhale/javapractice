package javaprograms;



	import java.util.Scanner;

	public class P29 {

	    // Method to calculate area of an equilateral triangle
	    public static double calculateArea(double side) {
	        return (Math.sqrt(3) / 4) * side * side;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input side length
	        System.out.print("Enter the length of the side: ");
	        double side = scanner.nextDouble();

	        // Calculate and display area
	        double area = calculateArea(side);
	        System.out.printf("Area of the equilateral triangle is: %.2f\n", area);

	        scanner.close();
	    }
	}