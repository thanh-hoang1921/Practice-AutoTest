package slide3.abstractEx;

public abstract class Vehicle {
	private String name;
	private String color;

	public Vehicle(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Vehicle() {
		super();
	}

	abstract void speed();

	public String display() {
		return "Info of object:\n \tName: " + name + "\tcolor: " + color;
	}
}
