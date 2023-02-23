package SupperClass.Overriding;

public class Example3 extends ABC {
	public void disp() {
		System.out.println("disp() method of Child class");
	}

	public void xyz() {
		System.out.println("xyz() method of Child class");
	}

	public static void main(String args[]) {
		// Parent class reference to child class object
		ABC obj = new Example3();
		obj.disp();
		obj.abc();
	}

}
