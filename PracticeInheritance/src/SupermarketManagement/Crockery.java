package SupermarketManagement;

import java.time.LocalDate;

public class Crockery extends Product {
	
	private String manufacturer;
	private LocalDate goodsReceivedNoteDate;

	public Crockery(String productId, String name, int inventoryNumber, double price) {
		super(productId, name, inventoryNumber, price);
		// TODO Auto-generated constructor stub
	}
	
	

	public Crockery(String productId, String name, int inventoryNumber, double price, String manufacturer,
			LocalDate goodsReceivedNoteDate) {
		super(productId, name, inventoryNumber, price);
		this.manufacturer = manufacturer;
		this.goodsReceivedNoteDate = goodsReceivedNoteDate;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public LocalDate getGoodsReceivedNoteDate() {
		return goodsReceivedNoteDate;
	}

	public void setGoodsReceivedNoteDate(LocalDate goodsReceivedNoteDate) {
		this.goodsReceivedNoteDate = goodsReceivedNoteDate;
	}



	@Override
	public void displayProduct() {
		super.displayProduct();
		System.out.println("- Manufacturer: " + manufacturer);
		System.out.println("- Good Received Note Date: " + goodsReceivedNoteDate);
	}

	
}