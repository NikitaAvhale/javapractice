package javaprograms;

//Main class
public class P20 {

 // Inner class named NumberSeries
 static class NumberSeries {
     // Method to print numbers from 1 to 10
     void printSeries() {
         System.out.println("Series from 1 to 10:");
         for (int i = 1; i <= 10; i++) {
             System.out.print(i + " ");
         }
     }
 }

 // Main method to run the program
 public static void main(String[] args) {
     // Create an object of NumberSeries
     NumberSeries series = new NumberSeries();

     // Call the method to print the series
     series.printSeries();
 }
} 