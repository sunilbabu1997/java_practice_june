package Constructors;

public class car_example {
	// Class named Car
	    String color;
	    int year;

	    // Constructor
	    public car_example(String c, int y) {
	        color = c;
	        year = y;
	    }

	    // Method to display car info
	    void display() {
	        System.out.println("Car color: " + color + ", Year: " + year);
	    }

	    // Main method to run the program
	    public static void main(String[] args) {
	    	car_example myCar = new car_example("Red", 2020); // Constructor is called here
	        myCar.display();
	    }
	}


