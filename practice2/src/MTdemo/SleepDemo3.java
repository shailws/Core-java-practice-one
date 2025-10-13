package MTdemo;

public class SleepDemo3 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			try {
				System.out.println(i + " : " + Thread.currentThread().getName());
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}

	public static void main(String[] args) {
		SleepDemo3 t1 = new SleepDemo3();
		t1.start();

		SleepDemo3 t2 = new SleepDemo3();
		t2.start();
	}
}
