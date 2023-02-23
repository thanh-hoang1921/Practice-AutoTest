package slide4.Threads.Synchronized.Why;

public class AccountTesting implements Runnable {
	private Account acct = new Account();

	@Override
	public void run() {
		for (int x = 0; x < 3; x++) {
			makeWithdrawal(10);
			
			if (acct.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}

	private void makeWithdrawal(int amt) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
			}
			
			acct.withdraw(amt);
			System.out.println("\t" + Thread.currentThread().getName() + " completes the withdrawal\n");
			
		} else {			
			System.out.println("\nNot enough in account for " + Thread.currentThread().getName() + " to withdraw "
					+ acct.getBalance());
		}
	}
}
