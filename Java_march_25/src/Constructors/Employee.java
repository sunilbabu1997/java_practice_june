package Constructors;

public class Employee {

	private String id, Name, CompName;
	private double sal;

	public Employee(String id, String Name, String CompName, double sal) {
		this.id = id;
		this.Name = Name;
		this.CompName = CompName;
		this.sal = sal;
	}

	public void task1() {
		System.out.println("Employee id is :" + id);
		System.out.println("Employee Name is :" + Name);
		System.out.println("Employee Company name is :" + CompName);
		System.out.println("Employee sal is :" + sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("1101", "sunil", "Envoy", 50000);
		e1.task1();
	}
}
