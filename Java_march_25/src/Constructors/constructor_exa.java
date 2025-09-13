package Constructors;

public class constructor_exa {
	
	public constructor_exa() {
		System.out.println("Hello java");
	}
	public constructor_exa(int a) {
		System.out.println(a);
	}
	public constructor_exa(String name) {
		System.out.println(name);
	}
	public constructor_exa(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor_exa  ref = new constructor_exa();
		constructor_exa  ref1 = new constructor_exa(10);
		ref.m1();
		m2();

	}
	public void m1() {
		System.out.println("this is a non static method");
	}
	public static void m2() {
		System.out.println("this is a static method");
	}

}
