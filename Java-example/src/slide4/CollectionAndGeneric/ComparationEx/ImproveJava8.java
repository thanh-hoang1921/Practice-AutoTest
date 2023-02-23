package slide4.CollectionAndGeneric.ComparationEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ImproveJava8 {

	public static void main(String[] args) {
		List<Student> students_4 = new ArrayList<Student>();
		students_4.add(new Student(111, "bbbb", "london"));
		students_4.add(new Student(131, "aaaa", "nyc"));
		students_4.add(new Student(121, "cccc", "jaipur"));

		// Now sort by address instead of name (default).
		Collections.sort(students_4, new Comparator<Student>() {
			public int compare(Student one, Student other) {
				return one.getAddress().compareTo(other.getAddress());
			}
		});
		System.out.println("\nSorted by Name - external controllable ordering");
		students_4.forEach(st -> System.out.println(st));
		System.out.println("\n_________");

		// Java 8-cách 4
		Collections.sort(students_4, (Student one, Student other) -> {
			return one.getAddress().compareTo(other.getAddress());
		});

		students_4.forEach(st -> System.out.println(st));
		System.out.println("\n_________");

		// more example with lambda
		Collections.sort(students_4, (one, other) -> one.getAddress().compareTo(other.getAddress()));

		students_4.forEach(st -> System.out.println(st));
		System.out.println("\n_________");

		Collections.sort(students_4, Comparator.comparing(Student::getAddress));

	}

}
