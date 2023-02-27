package VehicleTax;

public class Truck extends Vehicle {
	
	private String color;
	private String height;

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(int vehicleID, int capacity, String vehicleName, String owner) {
		super(vehicleID, capacity, vehicleName, owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double caculateTax() {
		return super.caculateTax() + 0.1 + 0.02;
	}
	

}
