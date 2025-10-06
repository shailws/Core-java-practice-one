package Overriding;

public class Test {
	void show(int a) {
		System.out.println("1");
	}
}
class Xyz extends Test {
	void show(int a) {
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.show(10);
		
		Xyz x = new Xyz();
		x.show(10);
				
	}
}
