package Slide1.AccessModifier.PublicScope;

import Slide1.AccessModifier.DefaultScope.mypack.A;

public class MainClass {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.str);

	}
}
