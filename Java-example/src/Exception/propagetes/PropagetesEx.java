package Exception.propagetes;

import java.io.IOException;

/**
 * 
 * @author SUN-ASTERISK\vu.thi.tran.van
 * 
 * Checked exception
 * must throws or catch
 *
 */
public class PropagetesEx {
	public void method3() throws IOException {
		throw new IOException();
	}

	public void method1() throws IOException {
		method3();
	}

	public void method2() {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		PropagetesEx pr = new PropagetesEx();
		pr.method2();

	}

	// public static void main(String[] args) throws IOException {
	// PropagetesEx pr = new PropagetesEx();
	// pr.method1();
	//
	// }

}
