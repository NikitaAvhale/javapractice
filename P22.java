package javaprograms;


	// Define a class with a constructor
	public class P22{

	    // Instance variables
	    String name;
	    int age;

	    // Constructor to initialize the object
	    public P22(String studentName, int studentAge) {
	        name = studentName;
	        age = studentAge;
	    }

	    // Method to display student details
	    void displayInfo() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Student Age: " + age);
	    }

	    // Main method to run the program
	    public static void main(String[] args) {
	        // Create an object using the constructor
	       P22 s1 = new P22("Aarav", 20);

	        // Call method to display info
	        s1.displayInfo();
	    }
	}

