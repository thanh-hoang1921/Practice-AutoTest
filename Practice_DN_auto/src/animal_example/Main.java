package animal_example;

public class Main {
	public static void main(String[] args) {

		Animal conCho1 = new Dog("White & Black", 1, true, "mau trang", 1);
		Animal conMeo1 = new Cat("Yellow", 20, true, "mau vang", 2);

		Dog conCho2 = new Dog("Nit", 1, false, "mau xam", 1);
		Cat conMeo2 = new Cat("Gold", 5, true, "Gold", 2);

		conCho1.displayInfo();
		conCho2.displayInfo();
		conMeo1.displayInfo();
		conMeo2.displayInfo();

	}
}
