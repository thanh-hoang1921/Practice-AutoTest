package SupermarketManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InventoryManagement {
	private List<Product> productList;
	private Product product;
	
	public void ConsumptionLevelAssessment() {
		if(product instanceof Electronic && product.getInventoryNumber() < 3) {
			System.out.println("Consumption level assesment of " + product.getName() + " is salable");
			return;
		}
		if(product instanceof Food && product.getInventoryNumber() != 0 && ((Food) product).getExpirationDate().isAfter(LocalDate.now())){
			System.out.println("Consumption level assesment of " + product.getName() + " is hard to sell");
			return;
		}
		if(product instanceof Crockery && product.getInventoryNumber() > 50 && ((Crockery) product).getGoodsReceivedNoteDate().plusDays(10).isBefore(LocalDate.now())){
			System.out.println("Consumption level assesment of " + product.getName() + " is excess inventory");
			return;
		}
		System.out.println("Not in the scope of evaluation");
	}
	
	public void inputDate() {
		productList.add(new Food("KW13244", "Kiwwi", 20, 23000, null, null, null));
		productList.add(new Electronic(null, null, 0, 0));
	}
	/**
	Viết chương trình quản lý kho của siêu thị gồm hàng thực phẩm, hàng sành sứ và điện máy
	Mỗi loại hàng đều có mã hàng, tên, số lượng tồn kho (>=0) và đơn giá
	hàng thực phẩm thì cần quan tâm đến thông tin ngày sản xuất và ngày hết hạn (ngày hết hạn phải sau hoặc là ngày sản xuất) và nhà cung cấp
	Hàng điện máy cần biết thời gian bảo hành bao nhiêu tháng (>= 0), công suất bao nhiêu KW(>=0)
	Hàng sành sứ thì biết thông tin nhà sản xuất và ngày nhập kho
	Ngoài ra, người quản lý cần biết số lượng tồn kho của 3 loại hàng, và tiền VAT của từng loại hàng hóa.(VAT của điện máy và sành sứ là 10% và hàng thực phẩm là 5%)

	Yêu cầu 1:
	Dựa vào thông tin trên xác định:
	Các lớp có thể có (trừu tượng và cụ thể)
	Thuộc tính và method của từng lớp
	Thiết kế mối quan hệ (thừa kế và polymorphism nếu có)

	Yêu cầu 2:
	Tạo method đánh giá mức độ tiêu thụ
	Hàng điện máy: Nếu số lượng tồn kho < 3 - đánh giá là bán được
	Hàng thực phẩm: Nếu vẫn còn trong kho và bị hết hạn - đánh giá là khó bán
	Hàng sành sứ: Nếu số lượng tồn kho > 50 và thời gian lưu kho > 10 ngày - đánh giá là bán chậm Các trường hợp còn lại ko đánh giá

	Yêu cầu 3:
	Khởi tạo class quản lý DSHH (Dùng array để lưu trữ danh sách)
	Viết method thêm hàng hóa vào danh sách
	Thêm thành công nếu ko bị trùng mã hàng hóa
	Cho phép người dùng lựa chọn loại hàng hóa cần thêm vào
	*/
	
}
