package Polymorphism;

public class methodoverriding1 extends methodoverriding {
	
	public void printzerotonine(int a)
	{
		int i=0;
		while(i<9)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("from child class");

	}
	

	public static void main(String[] args) 
	{
		methodoverriding1 obj=new methodoverriding1();
		obj.printzerotonine(6);
		
//		Object to parent class
		methodoverriding obj1=new methodoverriding();
		obj1.printzerotonine(3);
		
		}

}
