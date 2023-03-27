package StudentPerformanceManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	static List<StudentManagement> stManagementList = new ArrayList<StudentManagement>();
	static Student student;
	
	/**
	 * Menu
	 */
	public static void showMenu() {
		System.out.println("\n-----------MENU------------");
		System.out.println("1. Show all students");
		System.out.println("2. Find formal student");
		System.out.println("3. Display student GPA");
		System.out.println("4. Count formal student");
		System.out.println("5. Find high benchmark score of each department");
		System.out.println("6. Display Incumbent students by location");
		System.out.println("7. Find good student at the end of term");
		System.out.println("8. Find students with the highest semester GPA");
		System.out.println("9. Sort by department ACS & sort by yearOfAdmission DESC");
		System.out.println("10. Satistic on the number of student by academic year");
		System.out.println("0. Exit.");
		System.out.println("---------------------------");
		System.out.println("PRESS ENTER TO SHOW MENU.....");
		System.out.println("Please choose: ");
	}

	
	 public static void showHeader() {
		 System.out.printf("%1s%15s%25s%20s%15s%15s%10s%15s\n", "ID Student", "Full name", "Date of Birth",  "Academic year", "Benchmark", "Semester", "GPA", "Deparment");
	 }
	 
	public static void main(String[] args) {

		// Add data in List<ListOfStudyResult>
		List<ListOfStudyResult> resultList1 = new ArrayList<ListOfStudyResult>();
		List<ListOfStudyResult> resultList2 = new ArrayList<ListOfStudyResult>();
		List<ListOfStudyResult> resultList3 = new ArrayList<ListOfStudyResult>();

		resultList1.add(new ListOfStudyResult("Semester I", 8.0));
		resultList2.add(new ListOfStudyResult("Semester II", 4.55));
		resultList3.add(new ListOfStudyResult("Semester III", 8.9));
		
		//Add all results in list
		List<ListOfStudyResult> resultList = new ArrayList<ListOfStudyResult>();
		
		resultList.addAll(resultList1);
		resultList.addAll(resultList2);
		resultList.addAll(resultList3);

		// Add data in List<Student>
		List<Student> itStudent = new ArrayList<Student>();
		List<Student> englishStudent = new ArrayList<Student>();
		List<Student> geographyStudent = new ArrayList<Student>();
		List<Student> mathStudent = new ArrayList<Student>();

		// IT student list
		//englishStudent.add(new FormalStudent("TR9827", "Ky Quang Anh Thinh", "01/09/2005", 2022, 20.4, resultList2));
		itStudent.add(new FormalStudent("AH1234", "Nguyen Thanh Dat", "12/03/2001", 2017, 30, resultList1));
		itStudent.add(new IncumbentStudent("KO0983", "Ly Tu That", "23/11/1999", 2022, 16.5, resultList3, "HaNoi"));
		itStudent.add(new FormalStudent("TY02183", "Wanna", "23/11/1999", 2022, 16.5, resultList3));
		
		// English student list
		englishStudent.add(new FormalStudent("TR9827", "Ky Quang Anh Thinh", "01/09/2005", 2022, 20.4, resultList2));
		englishStudent.add(new IncumbentStudent("KO0983", "Ly Tu That", "23/11/1999", 2018, 22, resultList1, "HaNoi"));
		
		// Geography student list
		geographyStudent.add(
				new IncumbentStudent("PW23981", "Nguyen Van Tien", "10/10/1995", 2020, 18.5, resultList1, "HoChiMinh"));
		geographyStudent.add(new FormalStudent("AH1234", "Nguyen Thanh Dat", "12/03/2001", 2018, 25.3, resultList2));
		geographyStudent
				.add(new IncumbentStudent("PR988723", "Sa Kim", "17/02/2003", 2021, 28.8, resultList2, "DaNang"));
		geographyStudent.add(new FormalStudent("UI9843", "Ha Cam Thien", "25/04/2002", 2002, 16.75, resultList3));
		
		//Add all student in List
		List<Student> studentList = new ArrayList<Student>();
	
		studentList.addAll(itStudent);
		studentList.addAll(englishStudent);
		studentList.addAll(geographyStudent);

		// Add data List<Department>
		Department itDepartment = new Department("IT", itStudent);
		Department englishDepartment = new Department("English", englishStudent);
		Department geographyDepartment = new Department("Geography", geographyStudent);
		Department mathDepartment = new Department("Math", mathStudent);
		
		List<Department> departmentList = new ArrayList<Department>();
		departmentList.add(itDepartment);
		departmentList.add(englishDepartment);
		departmentList.add(geographyDepartment);
		departmentList.add(mathDepartment);
		

		StudentManagement stManagement = new StudentManagement();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		String choose;
		
		showMenu();
		while (true) {
			choose = scanner.nextLine();
			switch (choose) {
			case "1":
				stManagement.displayStudent(studentList);
				break;
			case "2":
				/*
				 * stManagement.findByFormalStudent(studentList).forEach(student -> {
				 * student.displayStudentInfo(); });
				 */
				stManagement.checkStudentType(studentList);
				break;
			case "3":
				stManagement.displayStudentByAllDepartment(departmentList);
				break;
			case "4":
				stManagement.totalFormalStudentOfDepartment(departmentList);
				break;
			case "5":
				stManagement.findStudentHighScoreByDepartment(departmentList);
				break;
			case "6":
				stManagement.findStudentByLocationByDepartment(departmentList, "HaNoi");
				break;
			case "7":
				stManagement.findGoodStudentAtTheEndOfTermByDepartment(departmentList);
				break;
			case "8":
				stManagement.findHighestGPAOfDepartment(departmentList);
				break;
			case "9":
				stManagement.sortByDepartmentAndAcademicYear(departmentList);
				break;
			case "10":
				stManagement.statisticByDepartment(departmentList);
				break;
			case "0":
				System.out.println("exited!");
				exit = true;
				break;
			default:
				showMenu();
				break;
			}
			if (exit) {
				break;
			}
			
		}

	}

}
