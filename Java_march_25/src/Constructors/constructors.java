package Constructors;

public class constructors {

	public constructors() {
		System.out.println("my name is sunil");
	}

	public constructors(int a) {
		System.out.println(a);
	}

	public constructors(int a, int b) {
		System.out.println(a + b);
	}

	public constructors(int a, String b) {
		System.out.println(a + b);
	}

//		public constructors(String a, int b) {
//			System.out.println("sunil",2);
//		}
	public constructors(String x, String y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructors m1 = new constructors();
		constructors m2 = new constructors(10);
		constructors m3 = new constructors(20, 30);
		constructors m4 = new constructors(50, "sunil");
		constructors m5 = new constructors("venki", "Sunil");
		constructors ref = new constructors();
		ref.m1();

	}

	public void m1() {
		System.out.println("hello java");
	}
	
	public static void m2() {
		
	}
}
