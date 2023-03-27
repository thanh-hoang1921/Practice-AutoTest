package SupermarketManagement;

import java.time.LocalDate;

public class Food extends Product {
	
	private LocalDate productDate;
	private LocalDate expirationDate;
	private String manufacturer;

	public Food(String productId, String name, int inventoryNumber, double price) {
		super(productId, name, inventoryNumber, price);
		// TODO Auto-generated constructor stub
	}
	
	public Food(String productId, String name, int inventoryNumber, double price, LocalDate productDate,
			LocalDate expirationDate, String manufacturer) {
		super(productId, name, inventoryNumber, price);
		this.productDate = productDate;
		this.expirationDate = expirationDate;
		this.manufacturer = manufacturer;
	}


	public LocalDate getProductDate() {
		return productDate;
	}

	public void setProductDate(LocalDate productDate) {
		this.productDate = productDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public void displayProduct() {
		super.displayProduct();
		System.out.println("- Product date: " + productDate);
		System.out.println("- Expiration date: " + expirationDate);
		System.out.println("- Manufacturer: " + manufacturer);
	}
	
	

}
