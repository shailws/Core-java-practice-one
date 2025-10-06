//performing single task from single thread.
package MTdemo;

public class Case1 extends Thread {
	@Override
	public void run() {
		System.out.println("task 1");
	}

	public static void main(String[] args) {
		Case1 t1 = new Case1();
		t1.start();
	}
}
