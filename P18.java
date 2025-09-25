package javaprograms;



	import java.util.Scanner;
	public class P18 {
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read array size
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        // Declare and initialize array
	        int[] arr = new int[n];

	        // Read array elements
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Print array in reverse order
	        System.out.println("Array in reverse order:");
	        for (int i = n - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }

	        scanner.close();
	    }
	}

