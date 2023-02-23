package Slide1.methods.UserDefinedMethod;

public class StaticMethodEx {
	static void show() {
		System.out.println("It is an example of static method.");
	}

	public static void main(String[] args) {
		StaticMethodEx.show();
		
		StaticMethodEx obj = new StaticMethodEx();
//		obj.show(); // warning
	}

}
