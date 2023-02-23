package Slide1.anonymous;

class Demo {

	public Demo() {
		System.out.print("Object is created by the ");
		System.out.println("default constructor");
	}

	public Demo(int i) {
		System.out.print("Object is created by the ");
		System.out.println("parameterized constructor");
	}

	{
		System.out.print("Object is created by the ");
	}

	public static void main(String arr[]) {
		Demo b1 = new Demo();
		Demo b2 = new Demo(1);
	}

//	public Demo() {
//		System.out.print("Object is created by the ");
//		System.out.println("default constructor");
//	}
//
//	public Demo(final int n) {
//		System.out.print("Object is created by the ");
//		System.out.println("parameterized constructor");
//	}
//
//	public static void main(final String[] array) {
//		final Demo demo = new Demo();
//		final Demo demo2 = new Demo(1);
//	}
}