package Final_keyword;

public class variable_final {

	 final int speedlimit = 90; // final variable
//	System.out.println(speedlimit);

	void run() {
//	  speedlimit=400; 
	  System.out.println(speedlimit);
	}

	public static void main(String args[]) {
		
//		final int speedlimit = 90; // final variable
//		System.out.println(speedlimit);
//		int result = 10/0;
//		System.out.println(result);

		variable_final obj = new variable_final();
		obj.run();
		
	}

}
