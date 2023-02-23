package slide4.Threads.Synchronized.WithMethod;

public class Sender {

	// use synchronized with method
	public synchronized void send(String msg) {
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("\n" + msg + "Sent");
	}

	// used with only a part of method
	/*public void send(String msg) {
		synchronized (this) {
			System.out.println("Sending\t" + msg);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Thread interrupted.");
			}
			System.out.println("\n" + msg + "Sent");
		}
	}*/
}
