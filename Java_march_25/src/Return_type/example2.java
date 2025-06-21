package Return_type;

public class example2 {
	public String getName() {
        return "Alice";
    }

    public static void main(String[] args) {
    	example2 obj = new example2();

        // Store and print
        String name = obj.getName();
        System.out.println("Name is: " + name); // Output: Name is: Alice

        // Use directly
        System.out.println("Hello, " + obj.getName()); // Output: Hello, Alice
    }


}
