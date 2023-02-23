package Slide1;

public class TestConvertDataType {
	public void addTwoNumber() {
		int num1 = 10;
		int num2 = 10;
		
		int num3 = num1 + num2;
		
		System.out.println("sum two number: " + num1 + " + " + num2 + " = " + num3);
	}

	public void widening() {
		int a = 10;
		float f = a;
		
		System.out.println("--- Windening ----");
		System.out.println("type int: " + a);
		System.out.println("int -> float: " + f);
	}

	public void narrowing() {
		System.out.println("--- narrowing ----");
		
		double d = 10.05d;
		int a = (int) d;
		
		System.out.println("type double: " + d);
		System.out.println("double -> int: " + a);
	}

	public void overflow() {
		int a = 130;
		byte b = (byte) a;
		
		System.out.println("--- overflow ----");
		System.out.println("type int: " + a);
		System.out.println("int -> byte: " + b);
	}

	public void addingLowerType() {
		byte a = 10;
		byte b = 10;

		// byte c=a+b;//Compile Time Error: because a+b=20 will be int
		byte c = (byte) (a + b);
		System.out.println("--- adding Lower Type ----");
		System.out.println("result: " + c);
	}

	public static void main(String[] args) {
		TestConvertDataType test = new TestConvertDataType();
		test.addTwoNumber();
		test.widening();
		test.narrowing();
		test.overflow();
		test.addingLowerType();
	}
}
