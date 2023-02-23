package VehicleExample;

public class Horse extends Vehicle {

	private String species;

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Horse(String species) {
		super();
		this.species = species;
	}

	public Horse(String name, String color, float speed) {
		super(name, color, speed);
	}

	public Horse(String name, String color, float speed, String species) {
		super(name, color, speed);
		this.species = species;
	}

	@Override
	public String display() {
		return super.display() + "\tSpecies: " + species;

	}
}
