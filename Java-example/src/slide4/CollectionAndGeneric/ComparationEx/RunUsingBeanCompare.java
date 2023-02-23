package slide4.CollectionAndGeneric.ComparationEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunUsingBeanCompare {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(111, "bbbb", "london"));
		students.add(new Student(131, "aaaa", "nyc"));
		students.add(new Student(121, "cccc", "jaipur"));
		
		Collections.sort(students, new BeanComparator("name"));

		students.forEach(st -> System.out.println(st));
		System.out.println("\n_________");
	}

}
