package inheritance;

public class A {
	void showA() {
		System.out.println("A class method");
	}
}
class B extends A{
	void showB() {
		System.out.println("B class method");
	}
	public static void main(String[] args) {
		B b = new B();
		b.showA();
		b.showB();
	}
}
class C extends A{
	void showC() {
		System.out.println("C class method");
	}
	public static void main(String[] args) {
		C c = new C();
		c.showA();
		c.showC();
	}
}
