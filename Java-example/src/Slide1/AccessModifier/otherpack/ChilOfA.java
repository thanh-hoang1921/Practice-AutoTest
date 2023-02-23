package Slide1.AccessModifier.otherpack;

import Slide1.AccessModifier.DefaultScope.mypack.A;

public class ChilOfA extends A {

	public static void main(String[] args) {
		ChilOfA chil = new ChilOfA();
		System.out.println(chil.myData);
		

//		System.out.println(chil.data);
		B.method_1();

	}

}
