package Slide1.AccessModifier.otherpack;

import Slide1.AccessModifier.DefaultScope.mypack.A;

public class B {
	public static void method_1() {
		System.out.println("is method 1");
	}
	public static void main(String[] args) {
		A obj = new A();
//		obj.data; //Compile Time Error  
	}

}
