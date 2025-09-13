package Strings;

public class string_trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "   my name is      ";
		String text1 = "                         :john";
		 System.out.println(text + text1);
		 System.out.println(text.trim()+text1);
		System.out.println(text.trim() + text1.trim());
	}

}
