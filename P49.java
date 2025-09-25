package javaprograms;


	import java.util.Scanner;

	public class P49{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the starting number: ");
	        int start = scanner.nextInt();

	        System.out.print("Enter the ending number: ");
	        int end = scanner.nextInt();

	        
	        System.out.println("\nSeries in Ascending Order:");
	        for (int i = start; i <= end; i++) {
	            System.out.print(i + " ");
	        }

	       
	        System.out.println("\n\nSeries in Descending Order:");
	        for (int i = end; i >= start; i--) {
	            System.out.print(i + " ");
	        }
	    }
	}