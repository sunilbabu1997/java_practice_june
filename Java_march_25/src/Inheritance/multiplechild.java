package Inheritance;

public class multiplechild extends MutipleParentA{
	// In that compilation error is thrown add in another parent
		public static void main(String[] args)
		{
			multiplechild obj=new multiplechild();
			single_parent ref = new single_parent();
			ref.m1();
			
			
		}

}
