package ClassAccount;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void credit(int amount) {
		if (amount < 0) {
			System.out.println("The amount is invalid.");
			return;
		}
		this.balance += amount;
	}

	public void debid(int amount) {
		if (amount < 0) {
			System.out.println("The amount is invalid.");
			return;
		}
		if (amount > balance) {
			System.out.println("Payment failed");
			return;
		}
		this.balance -= amount;

	}

	public void transferTo(Account account, int amount) {
		if (amount < 0) {
			System.out.println("The amount is invalid.");
			return;
		}
		if (balance < amount) {
			System.out.println("Payment failed");
			return;
		}
		this.balance -= amount;
		account.balance += amount;

	}

	public void displayBalance() {
		System.out.println("- Id: " + id);
		System.out.println("- Account name: " + name);
		System.out.println("- Balance: " + balance);
	}
}
