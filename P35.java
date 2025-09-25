package javaprograms;



	import java.util.Scanner;

	public class P35 {
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter the side length of the rhombus: ");
		        double side = scanner.nextDouble();

		        
		        double perimeter = 4 * side;

		        
		        System.out.println("Perimeter of the rhombus is: " + perimeter);

		        scanner.close();
		    }
		}