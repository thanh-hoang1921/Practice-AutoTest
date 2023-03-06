package StudentRecordManagement;

import java.util.Scanner;

public abstract class School {

	private String fullName;
	private int age;
	private String homeTown;

	public School() {
		super();
	}

	public School(String fullName, int age, String homeTown) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.homeTown = homeTown;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	
	  @Override 
	  public String toString() { 
		  return "Student Information:\n " + (fullName != null ? "Full Name = " + fullName + ", " : "") + "Age = " + age +
				  ", " + (homeTown != null ? "HomeTown = " + homeTown + ", " : ""); 
		  }
	 
	public void inputStudentInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input student's first and last name: ");
		fullName = scanner.nextLine();
		System.out.println("Input student's hometown: ");
		homeTown = scanner.nextLine();
		System.out.println("Input student's age: ");
		age = scanner.nextInt();
	}

	public void displayInformation() {
		/*
		 * System.out.println("- Fullname: " + fullName); System.out.println("- Age: " +
		 * age); System.out.println("- Hometown: " + homeTown);
		 */
		System.out.println(toString());
	}
}
