package MTdemo;

public class ThreadPriorities extends Thread {
	@Override
	public void run() {
		System.out.println("child thread");
		System.out.println("child thread priority : "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		System.out.println("main thread old priority : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("main thread new priority : "+Thread.currentThread().getPriority());
		
		ThreadPriorities t = new ThreadPriorities();
		t.setPriority(NORM_PRIORITY);
		t.start();
	}
}
