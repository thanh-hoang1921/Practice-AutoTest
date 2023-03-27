package StudentRecordManagement;

import java.util.Scanner;

public class ClassRoom extends School {
	
	private String classRoom;
	private School studentInfo;

	public ClassRoom() {}

	public ClassRoom(String fullName, int age, String homeTown) {
		super(fullName, age, homeTown);
	}

	public ClassRoom(String classRoom, School studentInfo) {
		super();
		this.classRoom = classRoom;
		this.studentInfo = studentInfo;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public School getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(School studentInfo) {
		this.studentInfo = studentInfo;
	}
	
	@Override
	public String toString() {
		return (classRoom != null ? "Class = " + classRoom + ", " : "");
	}

	public void inputInfoRecord() {
		studentInfo = new School() {
		};
		studentInfo.inputStudentInfo();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input class: ");
		classRoom = scanner.nextLine();
	}
	
	public void displayInfoRecord() {
		studentInfo.displayInformation();
		System.out.println(toString());
		//System.out.println("- Class: " + classRoom);
	}

}
