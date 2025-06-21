package Inheritance;

public class multilevel_parent extends multilevel_grandparent{

	public void m3()
	{
		System.out.println("Welcome");
	}
	
	public static void main(String[]args)
	{
		multilevel_parent obj=new multilevel_parent();
		obj.m3();
		obj.m1();
	}
}
