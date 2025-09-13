package Strings;

public class string_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "praveen";
		String name1 = "praveenfwr";
		String name2 = new String("praveen");
		
//		System.out.println(name == name1); // same memory allocation
//		
//		System.out.println(name == name2); // diff memory allocation false
		
		
		// equals methods
		System.out.println(name.equals(name1));
		
		System.out.println(name.equals(name2));
	}

}
