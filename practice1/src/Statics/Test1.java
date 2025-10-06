package Statics;

public class Test1 {
	static void display() {
		System.out.println("1");
	}
	public static void main(String[] args) {
		display();
		Xyz.show();
	}
}
class Xyz{
	static void show() {
		System.out.println("2");
	}
}
