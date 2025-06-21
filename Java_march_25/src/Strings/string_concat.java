package Strings;

public class string_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hello";
		String name1 = " World";
		String name2 = "!";

		// Concatenation using + operator
		String finalString = name + name1 + name2;
		System.out.println("Using + operator: " + finalString);

		// Concatenation using concat() method
		String secString = name.concat(name1).concat(name2);
		System.out.println("Using concat() method: " + secString);

	}

}
