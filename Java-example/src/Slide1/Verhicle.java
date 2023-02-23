package Slide1;

public class Verhicle {
	String name;
	String color;

	public Verhicle(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	void speed(String v) {
		System.out.println("Bạn có thể chạy với vận tốc bao nhiêu?\n Tôi có thể chạy " + v);
	}

	public static void main(String[] args) {
		Verhicle verhicle1 = new Verhicle("Car", "yellow");
		Verhicle verhicle2 = new Verhicle("Horse", "grown");
		
		System.out.println(verhicle1.name);

		System.out.println(verhicle2.name);
	}

	public static void main1(String[] args) {
	}
}
