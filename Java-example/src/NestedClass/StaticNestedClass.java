package NestedClass;

/*
 *  Static Nested Class có thể truy cập các thành viên dữ liệu và phương thức non-static. Ngoài ra, nó có thể được truy cập bởi tên của Outer Class.
 */
public class StaticNestedClass {
	static int example = 30;

	static class Inner {
		void printMessage() {
			System.out.println("non-static method - Gia tri cua bien example la: " + example);
		}

		static void printMessage1() {
			System.out.println("Static method - Gia tri cua bien example la: " + example);
		}
	}

	public static void main(String args[]) {

		/**
		 * Nhắc lại kiến thức: Giống như phương thức và thuộc tính, lớp lồng
		 * static được gắn kết với đối tượng thuộc lớp bao bọc lấy nó nhưng
		 * không thể truy xuất tới các thuộc tính và phương thức của đối tượng
		 * đó.
		 */
		StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
		// không cần tạo đối tượng của Outer Class (StaticNestedClass) bởi vì
		// Nested Class là dạng
		// static và các thuộc tính, phương thức hoặc các lớp cũng có thể được
		// truy cập mà không cần sử dụng đối tượng.
		obj.printMessage();

		// call static methods
		StaticNestedClass.Inner.printMessage1();// khong can tao instance cua
												// static nested class
	}
}
