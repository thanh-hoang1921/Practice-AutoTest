package StudentPerformanceManagement;

import java.util.List;

public class IncumbentStudent extends Student {
	
	private String trainingLinkLocation;

	public IncumbentStudent() {}

	public IncumbentStudent(String studentId, String fullName, String dateOfBirth, int yearOfAdmission,
			double benchmark, List<ListOfStudyResult> listOfStudyResult, String traningLinkLocation) {
		super(studentId, fullName, dateOfBirth, yearOfAdmission, benchmark, listOfStudyResult);
		this.trainingLinkLocation = traningLinkLocation;
	}

	public String getTrainingLinkLocation() {
		return trainingLinkLocation;
	}

	public void setTrainingLinkLocation(String trainingLinkLocation) {
		this.trainingLinkLocation = trainingLinkLocation;
	}

	@Override
	public void displayStudentInfo() {
		System.out.println("\n-----------Incumbent Student Information----------");
		super.displayStudentInfo();
		System.out.println("- Traning location: " + trainingLinkLocation);
	}
	
	
}
