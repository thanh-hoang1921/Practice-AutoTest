package slide4.Generics;

public class GenericsTypeEx<T> {
	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}

	public static void main(String args[]) {
		GenericsTypeEx<String> type = new GenericsTypeEx<>();
		type.set("Pankaj"); // valid
		
		GenericsTypeEx type1 = new GenericsTypeEx(); // raw type
		type1.set("Pankaj"); // valid
		type1.set(10); // valid and autoboxing support
	}

}
