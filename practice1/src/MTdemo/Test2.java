package MTdemo;

public class Test2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread task 2");
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		Thread th = new Thread(t2);
		th.start();
	}

}
