package slide4.Threads.multiple;

public class MyThread implements Runnable {
	String name;
	Thread t;

	MyThread(String thread) {
		name = thread;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 2; i > 0; i--) {
				System.out.println("\t" + name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
