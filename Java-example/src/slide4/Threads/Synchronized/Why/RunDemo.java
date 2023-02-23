package slide4.Threads.Synchronized.Why;

public class RunDemo {

	public static void main(String[] args) {
		AccountTesting r = new AccountTesting();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		
		// who both have access to the account and want to make withdrawals
		one.setName("Person 1");
		one.start();
		

		two.setName("Person 2");
		two.start();
	}

}
