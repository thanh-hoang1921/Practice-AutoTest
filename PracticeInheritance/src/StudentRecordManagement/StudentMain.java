package StudentRecordManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		List<ClassRoom> listStudent = new ArrayList<ClassRoom>();
		int n;
		ClassRoom studentRecord;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input the number of students: ");
		n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("**Input student information " + (i+1) + ": ");
			studentRecord = new ClassRoom();
			studentRecord.inputInfoRecord();
			listStudent.add(studentRecord);
		}
		
		for (int i = 0; i < listStudent.size(); i++) {
			System.out.println("\n **Student Information " + (i+1) + ": ");
			listStudent.get(i).displayInfoRecord();
		}
		
		System.out.println("\n----------------------------------------------");
		System.out.println("\nDisplaying the 20-year-old students: ");
		for (int i = 0; i < listStudent.size(); i++) {
			if (listStudent.get(i).getStudentInfo().getAge() == 20) {
				listStudent.get(i).displayInfoRecord();
			}
		}
		
		System.out.println("\n----------------------------------------------");
		System.out.println("\nThe number of students is 23 years old and comes from DaNang: ");
		for (int i = 0; i < listStudent.size(); i++) {
			if (listStudent.get(i).getStudentInfo().getAge() == 23 && listStudent.get(i).getStudentInfo().getHomeTown().equalsIgnoreCase("DaNang")) {
				listStudent.get(i).displayInfoRecord();
			}
		}
	}

}
