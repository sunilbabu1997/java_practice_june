package Final_keyword;

public class finalized_exam {

	public void finalize() {
		int a = 10;
		System.out.println(a);
		System.out.println("Object is being destroyed");
	}

	public static void main(String[] args) {
		finalized_exam obj = new finalized_exam();
//		obj.finalize();
//		Makes the object eligible for GC, but not guaranteed.
		obj = null;

		System.gc(); 
//		obj.finalize();
		// Suggests garbage collection
	}
}
