package slide4.Threads.multiple;

import slide4.Threads.ExtendsThreadClass;

public class MultiThread {
	public static void main(String args[]) {
		new MyThread("One");
		new MyThread("Two");
		new ExtendsThreadClass();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("\n\nMain thread exiting.");
	}
}
