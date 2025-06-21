package Return_type;

public class example1 {
	    // This method returns a number
	    int addNumbers() {
	        return 5 + 3;
	    }

	    // Main method
	    public static void main(String[] args) {
	        example1 obj = new example1(); // Create object of the class

	        // 1. Store the returned value in a variable
	        int result = obj.addNumbers();
	        System.out.println("Result is: " + result); // Output: Result is: 8

	        // 2. Use directly
	        System.out.println("Double the result: " + (obj.addNumbers() * 2)); // Output: 16
	    }
	}



