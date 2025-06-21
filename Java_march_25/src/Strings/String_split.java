package Strings;

public class String_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String sample="His name is john and he is a good man";
//		String[] sampletext=sample.split("and");
//		
//		for(int i=0;i<sampletext.length;i++)
//		{
//			System.out.println(sampletext[i]);
//		}
		String text = "United states";

		char[] charArray = text.toCharArray();
		// System.out.println(text);
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}

	}

}
