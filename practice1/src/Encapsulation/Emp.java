package Encapsulation;

public class Emp {
	private int empid;
	
	public void setEmpId(int id) {
		empid=id;
	}
	
	public int getEmpId() {
		return empid;
		
	}
}
class Company {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.setEmpId(13);
		System.out.println(e.getEmpId());
	}
}
