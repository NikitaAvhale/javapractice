package javaprograms;


	import java.util.Scanner;

	public class P41 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input side length
	        System.out.print("Enter the side length of the cube: ");
	        double side = scanner.nextDouble();

	        // Calculate lateral surface area (4 × side²)
	        double lateralSurfaceArea = 4 * side * side;

	        // Display result
	        System.out.printf("Lateral surface area of the cube is: %.2f square units\n", lateralSurfaceArea);
	    }
	}