package Inheritance;

public class single_child extends single_parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		single_child obj = new single_child();
		
		obj.m1();
		obj.m2();

	}

	public void m1() {
		super.m1();
		System.out.println("this is the child method");
	}

}
