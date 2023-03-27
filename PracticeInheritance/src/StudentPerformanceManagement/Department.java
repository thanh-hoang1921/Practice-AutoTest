package StudentPerformanceManagement;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Department {
	private String departmentName;
	private List<Student> studentList;
	
	public Department() {
	}
	
	public Department(String departmentName, List<Student> studentList) {
		super();
		this.departmentName = departmentName;
		this.studentList = studentList;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void displayDepartment() {
		/*
		 * Collections.sort(studentList, new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) { return
		 * o2.getYearOfAdmission() - o1.getYearOfAdmission(); } });
		 * studentList.forEach(student -> student.displayStudentInfo());
		 */
		  Collections.sort(studentList, new SortByYearOfAdmission());
		  studentList.forEach(st -> {
			  st.displayStudentInfo();
		  });
	}
	
	public int getAcademicYearofStudent() {
		int academicYear = 0;
		for (Student student: studentList) {
			academicYear = student.getYearOfAdmission();
			System.out.println("- academic year: " + academicYear);
		}
		return academicYear;
	}
}
