package slide4.CollectionAndGeneric.ComparationEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunSort {

	public static void main(String[] args) {
		// Create a list of strings
		List<String> strs = new ArrayList<String>();
		strs.add("Geeks For Geeks");
		strs.add("Friends");
		strs.add("Dear");
		strs.add("Is");
		strs.add("Superb");

		/*
		 * Collections.sort method is sorting the elements of ArrayList in
		 * ascending order.
		 */
		Collections.sort(strs, Collections.reverseOrder());
		strs.forEach(item -> System.out.println(item));
		System.out.println("\n_________");

		// Cách 2:
		List<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
		ar.add(new Student(131, "aaaa", "nyc"));
		ar.add(new Student(121, "cccc", "jaipur"));

		Collections.sort(ar, new SortByName());

		System.out.println("\nSorted by Name");
		ar.forEach(item -> System.out.println(item));
		System.out.println("\n_________");

		// Cách 3: Collections.sort(students);
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(111, "bbbb", "london"));
		students.add(new Student(131, "aaaa", "nyc"));
		students.add(new Student(121, "cccc", "jaipur"));

		Collections.sort(students);
		System.out.println("\nSorted by Name - Collections.sort");
		students.forEach(st -> System.out.println(st));
		System.out.println("\n_________");

		// Cách 4: external controllable ordering
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
	}

}
