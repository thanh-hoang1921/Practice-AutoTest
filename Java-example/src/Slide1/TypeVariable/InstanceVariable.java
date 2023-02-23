package slide1.TypeVariable;

public class InstanceVariable {
	// None static
	/*
	 * declared in a class, but outside a method, constructor or any block.
	 * Instance variables are created when an object is created with the use of
	 * the keyword 'new' and destroyed when the object is destroyed.
	 */

	// this instance variable is visible for any child class.
	public String name;

	// age variable is visible in InstanceVariable class only.
	private int age;

	// The name variable is assigned in the constructor.
	public InstanceVariable(String inputName) {
		name = inputName;
	}

	// The salary variable is assigned a value.
	public void setAge(int inputAge) {
		age = inputAge;
	}

	// This method prints the InstanceVariable details.
	public void printInstanceVariable() {
		System.out.println("name: " + name);
		System.out.println("age : " + age);
	}

	public static void main(String args[]) {
		System.out.println("----- Studen 1 -----");
		InstanceVariable obj = new InstanceVariable("Studen 1");
		obj.setAge(20);
		obj.printInstanceVariable();

		System.out.println("----- Studen 2 -----");
		InstanceVariable obj2 = new InstanceVariable("Studen 2");
		obj2.setAge(18);
		obj2.printInstanceVariable();

	}
}
