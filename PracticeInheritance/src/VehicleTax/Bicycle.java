package VehicleTax;

public class Bicycle extends Vehicle {
	
	public Bicycle() {}
	
	public Bicycle (int vehicleID, int capacity, String vehicleName, String owner) {
		super(vehicleID, capacity, vehicleName, owner);
	}

	@Override
	public double caculateTax() {
		return super.caculateTax();
	}
}
