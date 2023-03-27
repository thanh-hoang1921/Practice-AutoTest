package TransportManagement;

import java.util.List;
import java.util.Scanner;

public class Owner {

	private String fullName;
	private String idNo;
	private String email;
	
	public Owner() {}
	
	
	public Owner(String fullName, String idNo, String email) {
		super();
		this.fullName = fullName;
		this.idNo = idNo;
		this.email = email;
	}


	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void inputOwner() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Full Name: ");
		fullName = scanner.nextLine();
		System.out.println("Input email: ");
		email = scanner.nextLine();
		System.out.println("Input id number: ");
		idNo = scanner.nextLine();
	}

	
	public void displayOwner() {
		//System.out.println("------------Owner Information---------");
		System.out.println("- Full name: " + fullName);
		System.out.println("- Email: " + email);
		System.out.println("- Indentity card: " + idNo);
	}


}
