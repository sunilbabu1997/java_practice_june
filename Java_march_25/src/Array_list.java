import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> value = new ArrayList<String>();
		value.add("praveen");
		value.add("harsha");
		value.add("learning java");
		System.out.println(value.size());
		System.out.println(value.get(2));
		
//		value.set(2, "learning core-java");
		
//		System.out.println(value.get(2));
		
		System.out.println(value.remove("learning java"));
		
		System.out.println(value.size());

	}

}
