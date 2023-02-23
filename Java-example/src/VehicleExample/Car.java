package VehicleExample;

public class Car extends Vehicle {
	private String producttor;

	public Car(String producttor) {
		super();
		this.producttor = producttor;
	}

	public Car(String name, String color, float speed, String producttor) {
		super(name, color, speed);
		this.producttor = producttor;
	}

	public Car() {
	}

	@Override
	public String display() {
		return super.display() + "\tProducttor: " + producttor;

	}

	public String getProducttor() {
		return producttor;
	}

	public void setProducttor(String producttor) {
		this.producttor = producttor;
	}
}
