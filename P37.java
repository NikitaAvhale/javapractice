package javaprograms;

import java.util.Scanner;

public class P37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the base: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the base: ");
        double width = scanner.nextDouble();

        
        System.out.print("Enter the height of the prism: ");
        double height = scanner.nextDouble();

        
        double baseArea = length * width;
        double volume = baseArea * height;

      
        System.out.println("Volume of the prism is: " + volume);

        scanner.close();
    }
}