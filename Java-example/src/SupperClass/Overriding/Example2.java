package SupperClass.Overriding;

public class Example2 extends ABC {
	public void mymethod() {
		System.out.println("Class Example2: mymethod()");
	}

	public static void main(String args[]) {
		Example2 obj = new Example2();
		obj.mymethod();
	}

}
