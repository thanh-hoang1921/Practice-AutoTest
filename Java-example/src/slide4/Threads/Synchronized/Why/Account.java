package slide4.Threads.Synchronized.Why;

public class Account {
	private int balance = 30;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
}
