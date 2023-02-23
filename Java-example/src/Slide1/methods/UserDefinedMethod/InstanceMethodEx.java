package Slide1.methods.UserDefinedMethod;

public class InstanceMethodEx {

	public void display_info(String name) {
		System.out.println("hello " + name);
	}
	

	public void display_full_info(String name, String address) {
		System.out.println("hello " + name + " - Address: " + address);
	}
	public static void main(String[] args) {
//		InstanceMethodEx.display_info("nguyen van b"); // Syntax error
		InstanceMethodEx obj1 = new InstanceMethodEx();
		obj1.display_info("Object 1");
		

		InstanceMethodEx obj2 = new InstanceMethodEx();
		obj2.display_info("Object 2");

		obj1.display_full_info("parram 1", "parram 2");
	}

}
