package TransportManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Transport {

	private String vehicleNumber;
	private String manufacturer;
	private String yearOfManufacture;
	private String color;
	private String owner;

	public Transport() {
	}

	public Transport(String vehicleNumber, String manufacturer, String yearOfManufacture, String color, String owner) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.manufacturer = manufacturer;
		this.yearOfManufacture = yearOfManufacture;
		this.color = color;
		this.owner = owner;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Transport [vehicleNumber=" + vehicleNumber + ", manufacturer=" + manufacturer + ", yearOfManufacture="
				+ yearOfManufacture + ", color=" + color + ", owner=" + owner + "]";
	}

	/**
	 * Input transport information
	 * 
	 */
	public void inputTransportInfo() {
		Scanner scanner = new Scanner(System.in);
		// do {
		System.out.println("Input vehical number: ");
		vehicleNumber = scanner.nextLine();
		/*
		 * if (isVehicalIdExist() == true)
		 * System.out.println("This vehicle number is existed"); } while
		 * (isVehicalIdExist() == true);
		 */

		// check manufacturer valid or not
		do {
			System.out.println("Input manufacturer: ");
			manufacturer = scanner.nextLine();
			if (isManufacturerValid() == false)
				System.out.println("Manufacturer is invalid");
		} while (isManufacturerValid() == false);

		// check year of manufacture is valid or not
		do {
			System.out.println("Input year of manufacture: ");
			yearOfManufacture = scanner.nextLine();
			if (isYearOfManufactureValid() == false)
				System.out.println("Year of manufacture is invalid. Please input again.");
		} while (isYearOfManufactureValid() == false);

		System.out.println("Input vehical color: ");
		color = scanner.nextLine();
		System.out.println("Input vehical owner: ");
		owner = scanner.nextLine();
	}

	/**
	 * Display transport information
	 */
	public void displayTransport() {
		System.out.println("- Vehical number: " + vehicleNumber);
		System.out.println("- Manufacturer: " + manufacturer);
		System.out.println("- Year of manufacture: " + yearOfManufacture);
		System.out.println("- Vehical color: " + color);
		System.out.println("- Vehical owner: " + owner);
	}

	/**
	 * check valid year of manufacture
	 * 
	 * @return yearOfManufacture
	 */
	public boolean isYearOfManufactureValid() {
		LocalDate localDate = LocalDate.now();
		int currentYear = localDate.getYear();
		if (isNumberValid()) {
			int year = Integer.parseInt(yearOfManufacture);
			if (year <= currentYear && year > 2000)
				return true;
		}
		return false;
	}

	/**
	 * check input character is number
	 * 
	 * @return
	 */
	public boolean isNumberValid() {
		Pattern pattern = Pattern.compile("\\d*");
		Matcher matcher = pattern.matcher(yearOfManufacture);
		if (matcher.matches())
			return true;
		return false;
	}

	/**
	 * check valid manufacturer
	 * 
	 * @return manufacturer
	 */
	public boolean isManufacturerValid() {
		if (manufacturer.equals("Honda") || manufacturer.equals("Yamaha") || manufacturer.equals("Toyota")
				|| manufacturer.equals("Suzuki"))
			return true;
		return false;
	}

	// check valid vehical id
	public boolean isVehicalIdExist() {
		List<String> numberData = new ArrayList<String>();
		if (numberData.contains(vehicleNumber)) {
			// System.out.println("This vehicle number is existed");
			return true;
		}
		numberData.add(vehicleNumber);
		return false;
	}

}
