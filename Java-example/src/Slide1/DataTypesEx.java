package Slide1;

public class DataTypesEx {
	public static void main(String[] args) {

		char c = 'A';
		System.out.println("'A' = " + c);

		char c1 = '\u0041';
		System.out.println("'\u0041' = " + c1);

		char c2 = 0;
		System.out.println("Default Value c2:" + c2 + ":");

		char c3 = 65;
		System.out.println("65 = " + c3);

		char c4 = '\t';
		System.out.println("Tab Start:" + c4 + ":End");

		byte b = 10;
		System.out.println("b = " + b);

		byte b1 = (byte) 200;
		System.out.println("(byte) 200 = " + b1);
		// <0...>_11001000 (int), converted to 11001000 (byte) by stripping
		// leading 24 bits
		// since left most bit is 1, we need to find the value
		// Ones complement 11001000 -1 = 11000111
		// invert digits 00111000 i.e 56, hence printing -56

		b1 = (byte) 0b11001000;
		System.out.println("(byte) 0b11001000 = " + b1);

		byte b2 = (byte) 320; // 256+64 i.e 00000000_00000000_00000001_01000000,
								// byte 01000000

		// since leading bit is 0, nothing is required to determine value
		System.out.println("(byte) 320 = " + b2);

		short s = 32;
		System.out.println("32 = " + s);

		short s1 = 'A'; // implicit char to short conversion
		System.out.println("'A' = " + s1);

		int i = 'A';
		System.out.println("int 'A' = " + i);

		long l = 3200L;
		System.out.println("3200L = " + l);

		long l1 = 3200;
		System.out.println("3200 = " + l1);

		float f = 12.34f;
		System.out.println("12.34f = " + f);

	}
}
