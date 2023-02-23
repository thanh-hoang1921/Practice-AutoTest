package Slide1;

public class OperatorExample {
	public static void main(String[] args) {

		// ++ and --
		int x = 10;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);

		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);

		// ~ and !
		int e = 10;
		int f = -10;
		boolean c = true;
		boolean d = false;
		System.out.println(~e);// (minus of total positive value which starts
								// from 0)
		System.out.println(~f);// (positive of total minus, positive starts from
								// 0)
		System.out.println(!c);// (opposite of boolean value)
		System.out.println(!d);

		// Arithmetic Operator
		int a1 = 10;
		int b1 = 5;
		System.out.println(a1 + b1);
		System.out.println(a1 - b1);
		System.out.println(a1 * b1);
		System.out.println(a1 / b1);
		System.out.println(a1 % b1);

		// Arithmetic Operator with Expression
		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);

		// Refernce sample: https://www.javatpoint.com/operators-in-java
	}
}
