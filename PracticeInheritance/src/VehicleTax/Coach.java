package VehicleTax;

public class Coach extends Vehicle {
	
	private int numberSeat;

	public Coach() {
		// TODO Auto-generated constructor stub
	}

	public Coach(int vehicleID, int capacity, String vehicleName, String owner) {
		super(vehicleID, capacity, vehicleName, owner);
		// TODO Auto-generated constructor stub
	}

	public Coach(int numberSeat) {
		this.numberSeat = numberSeat;
	}

	public int getNumberSeat() {
		return numberSeat;
	}

	public void setNumberSeat(int numberSeat) {
		this.numberSeat = numberSeat;
	}

	@Override
	public double caculateTax() {
		if (numberSeat >= 5)
			return super.caculateTax() + 0.1 + 0.2 + 0.3;
		return super.caculateTax() + 0.1 + 0.2 + 0.5;
	}

}
