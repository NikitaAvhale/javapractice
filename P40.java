package javaprograms;


	import java.util.Scanner;

	public class P40 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter length of the prism: ");
	        double length = scanner.nextDouble();

	        System.out.print("Enter width of the prism: ");
	        double width = scanner.nextDouble();

	        System.out.print("Enter height of the prism: ");
	        double height = scanner.nextDouble();

	       
	        double volume = length * width * height;

	        
	        System.out.printf("Volume of the prism is: %.2f cubic units\n", volume);
	    }
	}
	