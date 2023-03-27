package ClassAccount;

public class CheckBalance {

	public static void main(String[] args) {
		Account acc1 = new Account("1323423424", "Nguyen Van A", 25);
		Account acc2 = new Account("0920281849743", "Tran Dinh Toan", 50);
		System.out.println("----------Account 1------------");
		acc1.credit(60); acc1.displayBalance();
		acc1.debid(90); // payment failed
		acc1.debid(42); acc1.displayBalance();
		
		System.out.println("----------Account 2------------");
		acc2.credit(90); acc2.displayBalance();
		acc2.debid(200); //payment failed
		acc2.debid(120); acc2.displayBalance();
		
		System.out.println("----------Account 2 tranfer to Account 1");
		acc2.transferTo(acc1, 30); //payment failed
		acc2.transferTo(acc1, 20);  acc1.displayBalance(); acc2.displayBalance();
	}

}
