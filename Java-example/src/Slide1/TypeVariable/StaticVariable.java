package slide1.TypeVariable;

public class StaticVariable {
	/**
	 * Introduce belongs to the class and not to object(instance) initialized
	 * only once , at the start of the execution a single copy to be shared by
	 * all instances of the class static variable can be accessed directly by
	 * the class name and doesn’t need any object
	 *
	 * Syntax : <class-name>.<variable-name>
	 */

	int a; // initialized to zero
	static int b; // initialized to zero only when class is loaded not for each
					// object created.

	public void increment() {
		a++;
		b++;
	}

	public void showData() {
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}

	public static void main(String[] args) {

		System.out.println("1. print value b by call name class: " + StaticVariable.b);

		System.out.println("-----staticVariable-----");
		StaticVariable staticVariable = new StaticVariable();
		staticVariable.increment();
		staticVariable.showData();

		System.out.println("2. print value b by call name class: " + StaticVariable.b);

		System.out.println("-----staticVariable1-----");
		StaticVariable staticVariable1 = new StaticVariable();
		staticVariable1.increment();
		staticVariable1.showData();

		System.out.println("3. print value b by call name class: " + StaticVariable.b);

		System.out.println("constant: " + StaticVariable.NAME_CO);
	}

	/*
	 * static block
	 * 
	 * is a block of statement inside a Java class that will be executed when a
	 * class is first loaded in to the JVM
	 */
	static {
		System.out.println("** static block **");
		System.out.println("Hello work. This is sample static variable.");
		System.out.println("*****");
	}

	/*
	 * is a constant final variable always needs initialization If you don’t
	 * initialize it would throw a compilation error
	 * "might not have been initialized" No change value
	 */
	public static final String NAME_CO = "Framgia";
}
