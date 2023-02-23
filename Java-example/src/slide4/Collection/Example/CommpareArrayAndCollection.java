package slide4.Collection.Example;

import java.util.ArrayList;

public class CommpareArrayAndCollection {

	public void usingArray() {
		String[] arrs = new String[3];
		arrs[0] = "java";
		arrs[1] = "Spring";
		arrs[2] = "Hibernate";

		for (String item : arrs) {
			System.out.println(item);
		}
	}

	public void usingClection() {
		ArrayList<String> arrs = new ArrayList<>();
		arrs.add("java");
		arrs.add("Spring");
		arrs.add("Hibernate");

		for (String item : arrs) {
			System.out.println(item);
		}
	}
}
