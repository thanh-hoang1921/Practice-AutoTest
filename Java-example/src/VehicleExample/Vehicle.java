package VehicleExample;

public class Vehicle {
	private String name;
	private String color;
	private float speed;

	public Vehicle() {
	}

	public Vehicle(String name, String color, float speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public String display() {
		return "Info of object:\n \tName: " + name + "\tcolor: " + color + "\tspeed: " + speed;
	}
}
