package Slide1.casting;

public class ImplicitTypeConversion {
	public static void main(String[] args) {

		int intVariable = 25;

		long longVariable = intVariable;

		float floatVariable = longVariable;

		double doubleVariable = floatVariable;

		System.out.println("Integer value is: " + intVariable);

		System.out.println("Long value is: " + longVariable);

		System.out.println("Float value is: " + floatVariable);

		System.out.println("Double value is: " + doubleVariable);

	}
}
