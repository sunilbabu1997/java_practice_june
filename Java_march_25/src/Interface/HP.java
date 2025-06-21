package Interface;

public class HP implements Laptop{
	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println("Hp copy code ");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("HP cut code ");
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("HP paste code ");
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("HP keyboard code ");
	}
	public void printing() {
		System.out.println("Hp Printing code");
	}

}
