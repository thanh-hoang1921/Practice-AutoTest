package animal_example;

public class Cat extends Animal {
	private String color;
	private double height;

	public Cat(String name, int age, boolean gender, String color, double height) {
		super(name, age, gender);
		this.color = color;
		this.height = height;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();

		System.out.println("Color: " + getColor());
		System.out.println("Height: " + getHeight());
		System.out.println("\n");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
