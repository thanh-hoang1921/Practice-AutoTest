package accountClassWithDiagram;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public static void main(String[] args) {
		Account object1 = new Account("1", "Object 1", 20);
		object1.debit(5);
		object1.display_info_blance();
		object1.credit(10);
		object1.display_info_blance();

		Account object2 = new Account("2", "Object 2", 5);
		object1.transferTo(5, object2);
		object1.display_info_blance();
	}

	public void credit(int amount) {
		if (amount < 0) {
			System.out.println("Số tiền nhập invalid");
			return;
		}

		this.balance += amount;

		// thử code dùng method check number positive thì code line 27 - 32 sẽ dc thay
		// thế thành 35 - 38
//		if (is_positive_number(amount)) {
//
//			this.balance += amount;
//		}
	}

	public void debit(int amount) {
		if (amount < 0) {
			System.out.println("Số tiền nhập invalid");
			return;
		}

		if (this.balance < amount) {
			System.out.println("số tiền thanh toán lớn hơn số tiền trong tài khoản. \n Thanh toán không thành công");
			return;
		}

		this.balance -= amount;
	}

	public void transferTo(int amount, Account accountTo) {
		// ở đây tài khoản người gửi chính là đối tượng gọi method này
		if (amount < 0) {
			System.out.println("Số tiền nhập invalid");
			return;
		}

		if (this.balance < amount) {
			System.out.println("số tiền muốn chuyển lớn hơn số tiền trong tài khoản. \n Chuyển tiền không thành công");
			return;
		}

		this.balance -= amount;
		accountTo.balance += amount;
	}

	// Suggest thêm: code check số tiền > 0 đều xuất hiện trong cả 3 method thì bạn
	// có thể tách công việc check đó thành 1 method và gọi tái sử dụng trong 3
	// method credit, debit, tranferTo
	public boolean is_positive_number(int number) {
		if (number < 0) {
			System.err.println("Error: Số tiền nhập phải là số dương");
			return false;
		}
		return true;
	}

	public void display_info_blance() {
		System.out.println("Số tiền trong tài khoản hiện có là " + this.balance);
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

}
