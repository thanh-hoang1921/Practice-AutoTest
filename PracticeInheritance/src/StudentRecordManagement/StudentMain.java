package StudentRecordManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	static List<ClassRoom> listStudent = new ArrayList<ClassRoom>();
	static int i, c = 0, res;

	static int count(List<ClassRoom> listStudent) {
		for (i = 0; i < listStudent.size(); i++) {
			if (listStudent.get(i).getStudentInfo().getAge() == 23
					&& listStudent.get(i).getStudentInfo().getHomeTown().equalsIgnoreCase("DN")) {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// List<ClassRoom> listStudent = new ArrayList<ClassRoom>();
		int n;
		ClassRoom studentRecord;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input the number of students: ");
		n = scanner.nextInt();

		for (i = 0; i < n; i++) {
			System.out.println("**Input student information " + (i + 1) + ": ");
			studentRecord = new ClassRoom();
			studentRecord.inputInfoRecord();
			listStudent.add(studentRecord);
		}

		for (i = 0; i < listStudent.size(); i++) {
			System.out.println("\n **Student Information " + (i + 1) + ": ");
			listStudent.get(i).displayInfoRecord();
		}

		System.out.println("\n----------------------------------------------");
		System.out.println("\nDisplaying the 20-year-old students: ");
		for (i = 0; i < listStudent.size(); i++) {
			if (listStudent.get(i).getStudentInfo().getAge() == 20) {
				listStudent.get(i).displayInfoRecord();
			}
		}

		System.out.println("\n----------------------------------------------");
		System.out.println("\nThe number of students is 23 years old and comes from DaNang: " + count(listStudent));
		
		  for (i = 0; i < listStudent.size(); i++) { 
			  if(listStudent.get(i).getStudentInfo().getAge() == 23 && listStudent.get(i).getStudentInfo().getHomeTown().equalsIgnoreCase("DN")) { 
				  listStudent.get(i).displayInfoRecord(); 
				  }
			  }
		 

	}

}
