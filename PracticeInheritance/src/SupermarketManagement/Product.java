package SupermarketManagement;

public class Product {
	private String productId;
	private String name;
	private int inventoryNumber;
	private double price;
	public Product(String productId, String name, int inventoryNumber, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.inventoryNumber = inventoryNumber;
		this.price = price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInventoryNumber() {
		return inventoryNumber;
	}
	public void setInventoryNumber(int inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayProduct() {
		System.out.println("- Product id: " + productId);
		System.out.println("- Product name: " + name);
		System.out.println("- Inventory number: " + inventoryNumber);
		System.out.println("- Price: " + price);
	}
}

