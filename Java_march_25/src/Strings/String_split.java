package Strings;

import java.util.Arrays;

public class String_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String sample="His name is john and he is a good man";
//		String[] sampletext=sample.split("and");
//		for(String sample1 :sampletext){
//			System.out.println(sample1);
//		}
//		
//		for(int i=0;i<sampletext.length;i++)
//		{
//			System.out.println(sampletext[i]);
//		}
//		String text = "United states";

//		char[] charArray = text.toCharArray();
//		// System.out.println(text);
//		for (int i = 0; i < charArray.length; i++) {
//			System.out.println(charArray[i]);
//		}
		
		String fruits = "His name is john and he is a good man";
		String[] fruit = fruits.split("and");
//		System.out.println(fruit);
		System.out.println(Arrays.toString(fruit));
		for(String fru_names: fruit) {
			System.out.println(fru_names);
		}
		

	}

}
