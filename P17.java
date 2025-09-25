package javaprograms;

	
	import java.util.Scanner;
	import java.util.Arrays;
	
	public class P17 {
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

	        // Sort the array
	        Arrays.sort(arr);

	        // Display sorted array
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        scanner.close();
	    }
	}


