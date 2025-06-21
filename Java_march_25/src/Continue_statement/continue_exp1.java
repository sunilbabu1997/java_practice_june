package Continue_statement;

public class continue_exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] countries = {"country","india","japan","china"};
		//print all country names
		for(String country: countries) {
			if(country.equals("country")) {
				continue;
			}
			System.out.println("country name is:"+country);
		}

	}

}
