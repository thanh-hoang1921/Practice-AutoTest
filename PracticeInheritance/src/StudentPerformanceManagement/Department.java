package StudentPerformanceManagement;

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
		for (Student student: studentList) {
			student.displayStudentInfo();
			System.out.println("- Department: " + departmentName);
		}
	}
	
	public int getAcademicYearofStudent() {
		int academicYear = 0;
		for (Student student: studentList) {
			academicYear = student.getYearOfAdmission();
			//System.out.println("- academic year: " + academicYear);
		}
		return academicYear;
	}
}
