package Continue_statement;

public class continue_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for loop
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// using continue statement
				continue;// it will skip the rest statement
			}
			System.out.println(i);
		}

	}

}
