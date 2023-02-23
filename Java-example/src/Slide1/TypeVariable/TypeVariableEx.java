package slide1.TypeVariable;

public class TypeVariableEx {
	int data = 50; // instance variable
	static int m = 100; // static variable
	final int final_var = 10;

	void method() {
		int n = 90; // local variable
	}

	public static void main(String[] args) {
		TypeVariableEx ex = new TypeVariableEx();
		// Dùng debug để xem thứ tự tạo biến
		
		System.out.println(ex.final_var);
//		ex.final_var = 1; // compile error

	}

}
