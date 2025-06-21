package Loops;

public class print_primenumbers {

	public static void main(String[] args) {

		// Loop from 2 to 50
		for (int num = 1; num <= 50; num++) {
			boolean isPrime = true;

			// Check if num is divisible by any number from 2 to num-1
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false; // Not prime
					break;
				}
			}

			// If isPrime is still true, then print the number
			if (isPrime) {
				System.out.println(num + " is a prime number");
			}

		}

	}
}
