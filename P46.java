package javaprograms;



	import java.util.Scanner;

	public class P46{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter the original price of the product: ₹");
	        double originalPrice = scanner.nextDouble();

	        
	        System.out.print("Enter discount percentage: ");
	        double discountPercent = scanner.nextDouble();

	        
	        double discountAmount = (discountPercent / 100) * originalPrice;

	        
	        double finalPrice = originalPrice - discountAmount;

	       
	        System.out.printf("Discount Amount: ₹%.2f\n", discountAmount);
	        System.out.printf("Price After Discount: ₹%.2f\n", finalPrice);
	    }
	}