package animal_example;

public class Animal {
	private String name;
	private int age;
	private boolean gender;

	public Animal() {
	}

	public Animal(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void displayInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("gender: " + (isGender() == true ? "Male" : "Fmale"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
