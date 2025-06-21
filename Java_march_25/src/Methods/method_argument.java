package Methods;

public class method_argument {
	int v = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplication();
		method_argument ref = new method_argument(); //object creation for the calling non static methods
		ref.addition();
//		ref.substraction();

	}
	
	
	// this is non-static method
	public void addition() {
		int a= 10;
		int b= 20;
		System.out.println(a+b);
		
	}
	public void substraction()
	{
		int a= 10;
		int b= 20;
		System.out.println(a-b);
	}
	
	// static method
	public static void multiplication() {
		int a= 10;
		int b= 20;
		System.out.println(a*b);
	}

}
