package SupermarketManagement;

public class Electronic extends Product {

	private String warrantlyPeriod;
	private double wattage;
	
	public Electronic(String productId, String name, int inventoryNumber, double price) {
		super(productId, name, inventoryNumber, price);
		// TODO Auto-generated constructor stub
	}

	public String getWarrantlyPeriod() {
		return warrantlyPeriod;
	}

	public void setWarrantlyPeriod(String warrantlyPeriod) {
		this.warrantlyPeriod = warrantlyPeriod;
	}

	public double getWattage() {
		return wattage;
	}

	public void setWattage(double wattage) {
		this.wattage = wattage;
	}

	public Electronic(String productId, String name, int inventoryNumber, double price, String warrantlyPeriod,
			double wattage) {
		super(productId, name, inventoryNumber, price);
		this.warrantlyPeriod = warrantlyPeriod;
		this.wattage = wattage;
	}

	@Override
	public void displayProduct() {
		super.displayProduct();
		System.out.println("- Warrantly period: " + warrantlyPeriod);
		System.out.println("- Wattage: " + wattage);
	}

	
}
