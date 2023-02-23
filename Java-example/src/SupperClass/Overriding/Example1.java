package SupperClass.Overriding;

public class Example1 extends ABC {
	public void mymethod() {
		super.mymethod();
		System.out.println("Class Test: mymethod()");
	}

	public static void main(String args[]) {
		Example1 obj = new Example1();
		obj.mymethod();
	}

}
