package NestedClass;

public class MemberOuterExample {
	private int exam = 30;

	private static String test = "testing ";

	// khai bao Inner Class
	class Inner {
		void printMessage() {
			System.out.println("Gia tri cua bien exam la: " + exam);
		}
	}

	static class InnerStatic {
		void printMessage() {
			System.out.println("Gia tri cua bien test la: " + test);
		}

		static void printMessage1() {
			System.out.println("Gia tri cua bien test la: " + test);
		}
	}

	// phan ket thuc cua khai bao
	public static void main(String args[]) {


		MemberOuterExample obj = new MemberOuterExample();

		MemberOuterExample.Inner in = obj.new Inner();

		in.printMessage();

		MemberOuterExample.InnerStatic inner = new InnerStatic();
		inner.printMessage();

		MemberOuterExample.InnerStatic.printMessage1();
	}

}