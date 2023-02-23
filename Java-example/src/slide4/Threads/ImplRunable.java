package slide4.Threads;

public class ImplRunable implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		ImplRunable m1 = new ImplRunable();
		Thread t1 = new Thread(m1);
		t1.start();
		System.out.println("the end");
	}

}
