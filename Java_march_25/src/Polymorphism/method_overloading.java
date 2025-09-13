package Polymorphism;

public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method_overloading obj = new method_overloading();
		obj.m1();
		obj.m1(1);
		obj.m1(11, 30);
		obj.m1("null");
		obj.m1(2, 3, 4);
	}
	public void m1() // We are passed in differnt data types not variables
	{
		System.out.println("Hello");
	}
	public void m1(int a, int b, int c) {
		System.out.println("It is a Three parametres");
	}

	public void m1(int a) // same method name showing error we passed in arguments
	{
		System.out.println("Java one argument");
	}
	public void m1(int a, int  b) // same method name showing error we passed in arguments
	{
		System.out.println("Java two numeric arguments");
	}
	public void m1(int a, String name) // same method name showing error we passed in arguments
	{
		System.out.println("Java one numeric and one string");
	}
	public void m1(String name, int a) // same method name showing error we passed in arguments
	{
		System.out.println("Java one string and one numeric");
	}

	public void m1(String name) {
		System.out.println("Welcome string argument");
	}

}
