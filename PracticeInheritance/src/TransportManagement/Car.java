package TransportManagement;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Car extends Transport {

	private int numberOfSeat;
	private String engineType;

	public Car() {
	}

	public Car(String vehicleNumber, String manufacturer, String yearOfManufacture, String color, Owner owner,
			int numberOfSeat, String engineType) {
		super(vehicleNumber, manufacturer, yearOfManufacture, color, owner);
		this.numberOfSeat = numberOfSeat;
		this.engineType = engineType;
	}
	/*
	 * public Car(int numberOfSeat, String engineType) { super(); this.numberOfSeat
	 * = numberOfSeat; this.engineType = engineType; }
	 */

	public int getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Car [numberOfSeat=" + numberOfSeat + ", engineType=" + engineType + "]";
	}

	@Override
	public void inputTransportInfo() {
		super.inputTransportInfo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number of seat: ");
		do {
			numberOfSeat = Integer.parseInt(scanner.nextLine());
			if (isNumberValid() == false)
				System.out.println("Please input the number.");
		} while (isNumberValid() == false);

		System.out.println("Input engine type: ");
		engineType = scanner.nextLine();
	}

	@Override
	public void displayTransport() {
		System.out.println("-----------------Car information-----------------");
		super.displayTransport();
		System.out.println("- Number of Seat: " + numberOfSeat);
		System.out.println("- Engine type: " + engineType);
	}

}
