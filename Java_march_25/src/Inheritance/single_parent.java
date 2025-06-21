package Inheritance;

public class single_parent {

	public void m1() {
		System.out.println("Hii this is parent class");

	}

	public void m2() {
		int a = 10;
		System.out.println("The value of a is:" + a);
	}

	public static void main(String[] args) {
		single_parent obj = new single_parent();
		obj.m1();
	}

}
