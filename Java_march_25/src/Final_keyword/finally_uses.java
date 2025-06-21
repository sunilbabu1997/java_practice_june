package Final_keyword;

public class finally_uses {
	
	//The finally block is used with try-catch statements. 
//	It always executes, whether an exception occurs or not. 
//	Great for cleanup code like closing files or connections.
	
	public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e);
        } finally {   //finally	try-catch block	Always runs code (used for cleanup)
            System.out.println("This will always execute (cleanup code).");
        }
    }

}
