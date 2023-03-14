package TransportManagement;

import java.util.Scanner;

public class Lorry extends Transport {

	private double payload;
	
	public Lorry() {}

	public Lorry(String vehicleNumber, String manufacturer, String yearOfManufacture, String color, Owner owner, double payload) {
		super(vehicleNumber, manufacturer, yearOfManufacture, color, owner);
		this.payload = payload;
	}

	public double getPayload() {
		return payload;
	}

	public void setPayload(double payload) {
		this.payload = payload;
	}

	
	  @Override 
	  public String toString() { 
		  return "Lorry [payload=" + payload + "]"; 
	  }

	@Override
	public void inputTransportInfo() {
		super.inputTransportInfo();
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Input payload: "); 
		  do {
			  payload = Double.parseDouble(scanner.nextLine()); 
			  if (isNumberValid() == false)
				  System.out.println("Please input the number.");
			  } while (isNumberValid() == false);
	}

	@Override
	public void displayTransport() {
		System.out.println("-----------------Lorry information-----------------");
		super.displayTransport();
		System.out.println("- Payload: " + payload); 
	}
	  
	  
	 
}
