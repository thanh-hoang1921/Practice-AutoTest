package Slide1.ThisEx;

public class Example3 {

	void m() {
		System.out.println("Gọi phương thức bằng từ khóa this");
	}

	void n() {
		this.m();
	}

	void p() {
		n();// trình biên dịch sẽ thêm this để gọi phương thức n() như this.n()
	}

	public static void main(String args[]) {
		Example3 o1 = new Example3();
		o1.p();
	}

}
