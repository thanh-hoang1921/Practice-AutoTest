package slide4.Threads.Synchronized.WithStaticMethod;

import slide4.Threads.Synchronized.Why.Account;

public class SynchronizedAccountTesting implements Runnable {
	private static Account acct = new Account();

	public static void main(String[] args) {
		SynchronizedAccountTesting r = new SynchronizedAccountTesting();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Person 1");
		two.setName("Person 2");
		one.start();
		two.start();
	}

	@Override
	public void run() {
		for (int x = 0; x < 3; x++) {
			makeWithdrawal(10);
			if (acct.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}

	private static synchronized void makeWithdrawal(int amt) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
			}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw "
					+ acct.getBalance());
		}
	}
}
