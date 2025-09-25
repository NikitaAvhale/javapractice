package javaprograms;



	import java.util.Scanner;

	public class P21 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Number of subjects
	        int numSubjects = 5;
	        int[] marks = new int[numSubjects];
	        double totalGradePoints = 0;

	        System.out.println("Enter marks for " + numSubjects + " subjects (out of 100):");

	        // Input marks and calculate grade points
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();

	            // Convert marks to grade point (scale of 10)
	            double gradePoint = convertToGradePoint(marks[i]);
	            totalGradePoints += gradePoint;
	        }

	        // Calculate CGPA
	        double cgpa = totalGradePoints / numSubjects;
	        System.out.printf("Your CGPA is: %.2f\n", cgpa);

	        scanner.close();
	    }

	    // Method to convert marks to grade point
	    public static double convertToGradePoint(int marks) {
	        if (marks >= 90) return 10.0;
	        else if (marks >= 80) return 9.0;
	        else if (marks >= 70) return 8.0;
	        else if (marks >= 60) return 7.0;
	        else if (marks >= 50) return 6.0;
	        else if (marks >= 40) return 5.0;
	        else return 0.0; // Fail
	    }
	}


