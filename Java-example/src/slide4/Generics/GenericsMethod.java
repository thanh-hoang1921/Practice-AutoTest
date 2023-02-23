package slide4.Generics;

public class GenericsMethod {
	// Java Generic Method
	public static <T> boolean isEqual(GenericsTypeEx<T> g1, GenericsTypeEx<T> g2) {
		return g1.get().equals(g2.get());
	}

	public static void main(String args[]) {
		GenericsTypeEx<String> g1 = new GenericsTypeEx<>();
		g1.set("Pankaj");

		GenericsTypeEx<String> g2 = new GenericsTypeEx<>();
		g2.set("Pankaj");

		boolean isEqual = GenericsMethod.<String>isEqual(g1, g2);
		// above statement can be written simply as
		isEqual = GenericsMethod.isEqual(g1, g2);
		// This feature, known as type inference, allows you to invoke a generic
		// method as an ordinary method, without specifying a type between angle
		// brackets.
		// Compiler will infer the type that is needed
	}
}
