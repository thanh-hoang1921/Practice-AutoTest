package slide4.CollectionAndGeneric.ComparationEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Khai báo sort static cho las
public class OtherStudent {
	private String name;
	private String phone;

	public OtherStudent(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String toString() {
		return this.name + " " + this.phone;
	}

	public static Comparator<OtherStudent> COMPARE_BY_PHONE = new Comparator<OtherStudent>() {
		public int compare(OtherStudent one, OtherStudent other) {
			return one.phone.compareTo(other.phone);
		}
	};

	public static Comparator<OtherStudent> COMPARE_BY_NAME = new Comparator<OtherStudent>() {
		public int compare(OtherStudent one, OtherStudent other) {
			return one.name.compareTo(other.name);
		}
	};

	public static void main(String[] args) {
		List<OtherStudent> students = new ArrayList<OtherStudent>();
		students.add(new OtherStudent("bbbb", "1"));
		students.add(new OtherStudent("aaaa", "100"));
		students.add(new OtherStudent("cccc", "10"));

		// Sort by address.
		Collections.sort(students, OtherStudent.COMPARE_BY_NAME);
		students.forEach(st -> System.out.println(st));
		System.out.println("\n_________");

		// Sort later by phone.
		Collections.sort(students, OtherStudent.COMPARE_BY_PHONE);
		students.forEach(st -> System.out.println(st));
		System.out.println("\n_________");
	}
}
