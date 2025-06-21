package Conditions;

public class if_else_esleif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if our block is true java execute and remaining all are leave
		String browser = "edgefsdfsd";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("firefox");
		} else if (browser.equals("edge")) {
			System.out.println("edge");
		} else {
			System.out.println("browser not matched");
		}

	}

}
