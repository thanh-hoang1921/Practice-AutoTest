package animal_example;

public class Dog extends Animal {

	private String color;
	private double weight;

	public Dog(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}

	public Dog(String name, int age, boolean gender, String color, double weight) {
		super(name, age, gender);
		this.color = color;
		this.weight = weight;
	}

	@Override
	public void displayInfo() {
		System.out.println("Infor class DOG");
		super.displayInfo();
		System.out.println("Color: " + getColor());
		System.out.println("Weight: " + getWeight());
		System.out.println("\n");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
