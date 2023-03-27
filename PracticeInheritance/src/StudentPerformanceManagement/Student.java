package StudentPerformanceManagement;

import java.util.List;

public abstract class Student {
	private String studentId;
	private String fullName;
	private String dateOfBirth;
	private int yearOfAdmission;
	private double benchmark;
	private List<ListOfStudyResult> listOfStudyResult;
	
	public Student() {}
	public Student(String studentId, String fullName, String dateOfBirth, int yearOfAdmission, double benchmark,
			List<ListOfStudyResult> listOfStudyResult) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.yearOfAdmission = yearOfAdmission;
		this.benchmark = benchmark;
		this.listOfStudyResult = listOfStudyResult;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getYearOfAdmission() {
		return yearOfAdmission;
	}
	public void setYearOfAdmission(int yearOfAdmission) {
		this.yearOfAdmission = yearOfAdmission;
	}
	public double getBenchmark() {
		return benchmark;
	}
	public void setBenchmark(double benchmark) {
		this.benchmark = benchmark;
	}
	public List<ListOfStudyResult> getListOfStudyResult() {
		return listOfStudyResult;
	}
	public void setListOfStudyResult(List<ListOfStudyResult> listOfStudyResult) {
		this.listOfStudyResult = listOfStudyResult;
	}
	
	/**
	 * Display student information
	 */
	public void displayStudentInfo() {
		System.out.println("- Student Id: " + studentId);
		System.out.println("- Full name: " + fullName);
		System.out.println("- Date of birth: " + dateOfBirth);
		System.out.println("- Year of andmission: "+ yearOfAdmission);
		System.out.println("- Benchmark: " + benchmark);
		displayStudyResult();
	}
	
	/**
	 * Display study result
	 */
	public void displayStudyResult() {
		for (ListOfStudyResult resultList: listOfStudyResult) {
			resultList.displayResult();
		}
	}
	
	public String semester() {
		String semester = null;
		for(ListOfStudyResult resultList: listOfStudyResult) {
			semester = resultList.getSemester();
		}
		return semester;
	}
	
	public double GPA() {
		double gpa = 0.0;;
		for(ListOfStudyResult resultList: listOfStudyResult) {
			gpa = resultList.getGPA();
		}
		return gpa;
	}
}
