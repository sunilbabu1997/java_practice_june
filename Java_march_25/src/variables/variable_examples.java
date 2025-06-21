package variables;

public class variable_examples {
	// Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    // Method 1 - accessing all three
    public void methodOne() {
        // Local variable
        int localVar = 30;

        System.out.println("Inside methodOne()");
        System.out.println("Instance Variable: " + instanceVar);    // can access
        System.out.println("Static Variable: " + staticVar);        // can access
        System.out.println("Local Variable: " + localVar);          // can access
    }

    // Method 2 - different method, new local variable
    public void methodTwo() {
        int localVar = 50;

        System.out.println("Inside methodTwo()");
        System.out.println("Instance Variable: " + instanceVar);    // can access
        System.out.println("Static Variable: " + staticVar);        // can access
        System.out.println("Local Variable: " + localVar);          // new local variable
    }

    // Static method - only can access static and local directly
    public static void staticMethod() {
        int localVar = 100;

        System.out.println("Inside staticMethod()");
//         System.out.println(instanceVar);  // ❌ Cannot access instance variable directly
        System.out.println("Static Variable: " + staticVar);        // can access
        System.out.println("Local Variable: " + localVar);          // can access
    }

    // Main method to run everything
    public static void main(String[] args) {
    	variable_examples obj = new variable_examples();

        obj.methodOne();
        obj.methodTwo();
        staticMethod();
    }

}
