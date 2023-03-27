package StudentPerformanceManagement;

import java.util.Iterator;
import java.util.List;

public class ListOfStudyResult {
	private String semester;
	private double GPA;
	
	public ListOfStudyResult(String semester, double gPA) {
		super();
		this.semester = semester;
		GPA = gPA;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public void displayResult() {
		System.out.println("- Semester: " + semester);
		System.out.println("- GPA: " + GPA);
	}
}
