package javaprograms;

 import java.util.Scanner; 
		 public class P15 {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        
		        System.out.print("Enter size of the array: ");
		        int size = sc.nextInt();
		        int[] arr = new int[size];

		        
		        System.out.println("Enter " + size + " elements:");
		        for (int i = 0; i < size; i++) {
		            arr[i] = sc.nextInt();
		        }

		       
		        System.out.println("Even numbers in the array:");
		        for (int num : arr) {
		            if (num % 2 == 0) {
		                System.out.print(num + " ");
		            }
		        }

		      
		        System.out.println("\nOdd numbers in the array:");
		        for (int num : arr) {
		            if (num % 2 != 0) {
		                System.out.print(num + " ");
		            }
		        }

		        sc.close();
		    }
		
	}


