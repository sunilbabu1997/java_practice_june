package This_keyword;

public class exp2 {

	String model;
	int year;

	public exp2() {
		this("Unknown", 0); // calls the second constructor
		System.out.println("dummy constructor");
	}

	public exp2(String model, int year) {
		this.model = model;
		this.year = year;
	}

	public void showInfo() {
		System.out.println("Model: " + model + ", Year: " + year);
	}

	public static void main(String[] args) {
		exp2 ref = new exp2();
		exp2 ref1 = new exp2("iconic", 2025);
		ref1.showInfo();
	}

//    One constructor calls another using this(...).

//    It avoids repeating code.

}
