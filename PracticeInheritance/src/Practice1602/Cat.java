package Practice1602;

public class Cat extends Animal {

	private String fur_color;
	private double height;
	
	public Cat(String fur_color, double height) {
		super();
		this.fur_color = fur_color;
		this.height = height;
	}
	
	public Cat(String name, double date, String sex) {
		super(name, date, sex);
	}

	public String getFur_color() {
		return fur_color;
	}

	public void setFur_color(String fur_color) {
		this.fur_color = fur_color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	void animalInfo() {
		System.out.println("------------Cat information-----------");
		super.animalInfo();
		System.out.println(getFur_color() + " - " + getHeight() +" cm");
	}
	
	/*
	 * void displayInfor() {
	 * System.out.println("------------Cat information-----------"); animalInfo();
	 * System.out.println(getFur_color() + " - " + getHeight() +" cm"); }
	 */
	
	
	
}
