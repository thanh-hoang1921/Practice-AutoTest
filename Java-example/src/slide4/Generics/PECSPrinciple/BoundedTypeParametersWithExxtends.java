package slide4.Generics.PECSPrinciple;

import java.util.List;

public class BoundedTypeParametersWithExxtends {
	/*
	 * Java Generics supports multiple bounds also, i.e <T extends A & B & C>.
	 * In this case, A can be an interface or class. If A is class then B and C
	 * should be an interface. We can’t have more than one class in multiple
	 * bounds
	 */
	public static <T extends Comparable<T>> int compare(T t1, T t2) {
		return t1.compareTo(t2);
	}

	public static void addIntegers(List<? super Integer> list) {
		list.add(new Integer(50));
	}
}
