package Exception.propagetes;

/**
 * 
 * @author SUN-ASTERISK\vu.thi.tran.van
 * 
 *         Unchecked exception must throws or catch
 *
 */
public class PropagetesEx2 {
	public void division(int num1, int num2) {
		// java.lang.ArithmeticException here
		// and not caught hence propagate to method1.
		System.out.println(num1 / num2);
	}

	public void method1(int num1, int num2) {
		// not caught here and hence propagate to method2.
		division(num1, num2);
	}

	public void method2(int num1, int num2) {
		try {
			method1(num1, num2);
		} catch (Exception e) {// caught exception here.
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		PropagetesEx2 pr = new PropagetesEx2();
		// pr.method1(10, 0);
		pr.method2(10, 0);

	}

}
