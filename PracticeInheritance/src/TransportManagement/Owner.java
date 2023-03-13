package TransportManagement;

import java.util.List;
import java.util.Scanner;

public class Owner {

	private String fullName;
	private long idNo;
	private String email;
	private List<Car> car;
	private List<Motorcycle> motorcycle;
	private List<Lorry> lorry;
	
	public Owner() {}
	
	
	public Owner(String fullName, long idNo, String email, List<Car> car, List<Motorcycle> motorcycle,
			List<Lorry> lorry) {
		super();
		this.fullName = fullName;
		this.idNo = idNo;
		this.email = email;
		this.car = car;
		this.motorcycle = motorcycle;
		this.lorry = lorry;
	}


	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getIdNo() {
		return idNo;
	}

	public void setIdNo(long idNo) {
		this.idNo = idNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Car> getCar() {
		return car;
	}

	public void setCar(List<Car> car) {
		this.car = car;
	}

	public List<Motorcycle> getMotorcycle() {
		return motorcycle;
	}

	public void setMotorcycle(List<Motorcycle> motorcycle) {
		this.motorcycle = motorcycle;
	}

	public List<Lorry> getLorry() {
		return lorry;
	}

	public void setLorry(List<Lorry> lorry) {
		this.lorry = lorry;
	}

	public void inputOwner() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Full Name: ");
		fullName = scanner.nextLine();
		System.out.println("Input email: ");
		email = scanner.nextLine();
		System.out.println("Input id number: ");
		idNo = Long.parseLong(scanner.nextLine());
	}


	@Override
	public String toString() {
		return "Owner [fullName=" + fullName + ", idNo=" + idNo + ", email=" + email + ", car=" + car + ", motorcycle="
				+ motorcycle + ", lorry=" + lorry + "]";
	}
	
	public void displayOwner() {
		System.out.println(toString());
	}


}
