package StudentPerformanceManagement;

import java.util.List;

public class FormalStudent extends Student {
	
	public FormalStudent() {
	}

	public FormalStudent(String studentId, String fullName, String dateOfBirth, int yearOfAdmission, double benchmark,
			List<ListOfStudyResult> listOfStudyResult) {
		super(studentId, fullName, dateOfBirth, yearOfAdmission, benchmark, listOfStudyResult);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayStudentInfo() {
		System.out.println("\n-----------Formal Student Information----------");
		super.displayStudentInfo();
	}

}
