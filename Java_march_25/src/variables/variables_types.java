package variables;

public class variables_types {

	// Instance Variable
    int instanceVar = 10;

    // Static Variable
    static int staticVar = 20;

    public void showVariables() {
        // Local Variable
        int localVar = 30;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
    	variables_types obj = new variables_types(); // Create object
        obj.showVariables(); // Call method
    }

}
