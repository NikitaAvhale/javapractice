package javaprograms;



	import java.util.Scanner;
	public class Test1 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: "); 
	        int x = sc.nextInt(); 
	        if (x % 2 == 0) {
	            System.out.println("Number is even");
	          } else {
	            System.out.println("Number is odd");
	        }
	    }
	}


