package This_keyword;

 class example {
	
	String name;
	
	//constructor
	example(String name){
		this.name = name;
		
	}
	
	void showname()
	{
		System.out.println("I am " +this.name);
	}
	 public class main{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example ref =  new example("john");
		ref.showname();
		

	}

}
