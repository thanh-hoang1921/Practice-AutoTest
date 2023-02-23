package Practice1602;

public class Animal {
	private String name;
	private double date;
	private String sex;
	
	public Animal () {}
	
	public Animal(String name, double date, String sex) {
		super();
		this.name = name;
		this.date = date;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getDate() {
		return date;
	}
	
	public void setDate(double date) {
		this.date = date;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	void animalInfo() {
		System.out.println(getName() + " - " + getDate() + " years" + " - " + getSex());
	}
	
}
