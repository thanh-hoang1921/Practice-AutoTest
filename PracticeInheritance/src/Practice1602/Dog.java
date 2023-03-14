package Practice1602;

public class Dog extends Animal{
	
	private String color;
	private double weight;
	
	public Dog(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public Dog(String name, double date, String sex) {
		super(name, date, sex);
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

	@Override
	void animalInfo() {
		System.out.println("------------Dog Information-----------");
		super.animalInfo();
		System.out.println(getColor() + " - " + getWeight() + " kg");
	}

	/*
	 * void displayInfor () {
	 * System.out.println("------------Dog Information-----------"); animalInfo();
	 * System.out.println(getColor() + " - " + getWeight() + " kg"); }
	 */
	
	
}
