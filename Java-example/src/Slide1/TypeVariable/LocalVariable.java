package slide1.TypeVariable;

public class LocalVariable {
	/*
	 * Introduce: is a variable that’s declared within the body of a method.
	 * Then you can use the variable only within that method. Other methods in
	 * the class aren’t even aware that the variable exists. No default value
	 * for local variables
	 */

	public void increment() {
		int number = 1;
		number++;
		System.out.println("value number: " + number);
	}

	public static void main(String[] args) {
		LocalVariable localVariable = new LocalVariable();
		localVariable.increment();
	}

}
