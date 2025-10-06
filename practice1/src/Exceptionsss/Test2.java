package Exceptionsss;

public class Test2 {
	public static void main(String[] args) {
		try {
			Test2 t = new Test2();
			t.divide();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Hello");
	}

	void divide() {

		int a = 100, b = 0, c;
		c = a / b;

		System.out.println(c);
	}
}
