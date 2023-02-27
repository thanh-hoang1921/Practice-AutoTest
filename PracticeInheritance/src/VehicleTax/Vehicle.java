package VehicleTax;

public class Vehicle {

	private int vehicleID, capacity;
	private String vehicleName, owner;
	
	public Vehicle() {
	}

	public Vehicle(int vehicleID, int capacity, String vehicleName, String owner) {
		super();
		this.vehicleID = vehicleID;
		this.capacity = capacity;
		this.vehicleName = vehicleName;
		this.owner = owner;
	}


	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double caculateTax() {
		double tax = 0;
		return tax;
	}
}
