package Suppper;
class _A{
	 void m1() {
		System.out.println("i am in class fist");
	}
}
public class A extends _A {
	void m1() {
		System.out.println("i am in class second");
	}
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		_A b = new _A();
		b.m1();
	}
}

