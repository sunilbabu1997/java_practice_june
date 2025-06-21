package Try_Catch;

public class Aithematic_exception {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
            int result = 10 / 0; // This will throw an exception
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Oops! Can't divide by zero.");
        }
		Thread.sleep(2000);

        System.out.println("Program continues after the try-catch.");

	}

}
