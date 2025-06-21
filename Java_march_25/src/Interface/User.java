package Interface;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lenovo l=new Lenovo();
		l.copy();
		l.cut();
		l.paste();
		l.keyboard();
//		l.audio();
		
		HP hp=new HP();
		hp.printing();
		hp.paste();
		
		Dell d=new Dell();
		d.cut();
		d.copy();
	
		
	}

}
