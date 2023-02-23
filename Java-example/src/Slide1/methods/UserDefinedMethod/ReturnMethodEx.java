package Slide1.methods.UserDefinedMethod;

public class ReturnMethodEx {
	static int myMethod(int x) {
		return 5 + x;
	}

	static void myMethod_no_data_return(int x) {
	      System.out.println("không có return");
	  }

	public static void main(String[] args) {
		System.out.println(myMethod(3));
		myMethod_no_data_return(0);
	}

}
