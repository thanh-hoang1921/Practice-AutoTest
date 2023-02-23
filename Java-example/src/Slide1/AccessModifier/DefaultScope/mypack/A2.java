package Slide1.AccessModifier.DefaultScope.mypack;

import Slide1.AccessModifier.otherpack.B;

public class A2 {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.data);
		B.method_1();
	}
}
