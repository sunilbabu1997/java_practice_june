package Inheritance;

public class multilevel_grandparent {

	public void m1()
	{
		System.out.println("Hi");
	}
	
	public static void main(String[]args)
	{
		multilevel_parent obj=new multilevel_parent();
		obj.m1();
	}
}
