package VehicleTax;

public class MotoBike extends Vehicle {
	

	public MotoBike() {
		// TODO Auto-generated constructor stub
	}

	public MotoBike(int vehicleID, int capacity, String vehicleName, String owner) {
		super(vehicleID, capacity, vehicleName, owner);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double caculateTax() {
		return super.caculateTax() + 0.1 + 0.05;
	}
	
	
}
