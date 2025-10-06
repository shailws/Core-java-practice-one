//perform multiple task from multiple threads.

package MTdemo;

class Casee4 extends Thread {
	@Override
	public void start() {
		System.out.println("task 1");
	}
}

class Casee5 extends Thread {
	@Override
	public void start() {
		System.out.println("task 3");
	}
}

class Casee6 extends Thread {
	@Override
	public void start() {
		System.out.println("task 3");
	}
}

public class Case4 {
	public static void main(String[] args) {
		Casee4 t1 = new Casee4();
		t1.start();

		Casee5 t2 = new Casee5();
		t2.start();

		Casee6 t3 = new Casee6();
		t3.start();
	}
}
