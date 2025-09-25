package javaprograms;



	import java.util.Scanner;

	public class P19 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read matrix dimensions
	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = scanner.nextInt();

	        // Declare and initialize matrix
	        int[][] matrix = new int[rows][cols];

	        // Read matrix elements
	        System.out.println("Enter matrix elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        // Display original matrix
	        System.out.println("Original Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Compute and display transpose
	        System.out.println("Transpose of Matrix:");
	        for (int i = 0; i < cols; i++) {
	            for (int j = 0; j < rows; j++) {
	                System.out.print(matrix[j][i] + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}

