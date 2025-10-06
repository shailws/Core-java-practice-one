package Statics;

public class Employee {
	static int count = 0;
	public Employee() {
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
	}
}
