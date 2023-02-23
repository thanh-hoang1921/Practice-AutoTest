package slide3.abstractEx;

public class Car extends Vehicle {
	private String productor;

	public Car(String name, String color, String productor) {
		super(name, color);
		this.productor = productor;
	}

	public Car() {
		super();
	}

	public Car(String name, String color) {
		super(name, color);
	}

	@Override
	void speed() {
		System.out.println(super.display());
		System.out.println("\tSpeed limit is 80 km/h");

	}

	public static void main(String[] args) {
		Vehicle myCar = new Car("fortuner 2017", "blue", "Toyota");
		myCar.speed();

		System.out.println(myCar.display());
	}
}
