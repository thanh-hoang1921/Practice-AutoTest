package vn.sunasterisk.treemanagement.model;

public class Flower {
	private String name;
	private String color;
	
	public Flower(String name, String color) {
		this.name = name;
		this.color = color;
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



	public void displayInformation() {
		System.out.println("Thông tin Flower: " + getName() + " - " + getColor());
	}
	
	public void changeName(String name) {
		setName(name);
	}
	
	public void changeColor(String color) {
		setColor(color);
	}
}
