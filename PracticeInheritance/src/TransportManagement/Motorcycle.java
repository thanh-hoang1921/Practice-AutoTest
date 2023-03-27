package TransportManagement;

import java.util.Scanner;

public class Motorcycle extends Transport {
	
	private double capacity;

	public Motorcycle() {}

	public Motorcycle(String vehicleNumber, String manufacturer, String yearOfManufacture, String color, Owner owner, double capacity) {
		super(vehicleNumber, manufacturer, yearOfManufacture, color, owner);
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	
	  @Override 
	  public String toString() { 
		  return "Motorcycle [capacity=" + capacity + "]"; }

	@Override
	public void inputTransportInfo() {
		super.inputTransportInfo();
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Input capacity: "); 
		 do { 
			 capacity = Double.parseDouble(scanner.nextLine()); 
			 if (isNumberValid() == false)
				 System.out.println("Please input the number."); 
			 } while (isNumberValid() == false);
	}

	@Override
	public void displayTransport() {
		System.out.println("-----------------Motorcycle information-----------------");
		super.displayTransport();
		System.out.println("- Capacity: " + capacity);
	}
	  
	  
	 
}
