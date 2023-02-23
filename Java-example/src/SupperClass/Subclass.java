package SupperClass;

public class Subclass extends Parentclass {

	private String keyTrain = "Train subclass";

	// invoke constructor of parent class

	public Subclass() {
		super();
		System.out.println("Constructor of Subclass");
	}

	public void print() {
		super.print();
		System.out.println(keyTrain);
	}

	// invoke Parent class variable
	public void printMessage() {
		System.out.println(super.keyTrain);
		// System.out.println(keyTrain);
	}

	public static void main(String[] args) {

		Subclass sub = new Subclass();
		sub.printMessage();

		sub.print();

	}

}
