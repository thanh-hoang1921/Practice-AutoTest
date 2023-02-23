package Slide1.ThisEx;

public class Circle {

	private int radius;

	/* Dùng làm tham chiếu tới biến instance */
//	public Circle(int radius) {
//		radius = radius;
//	}
//
//	public static void main(String[] args) {
//		Circle circle = new Circle(4); // Khởi tạo một circle có radius = 4
//
//		System.out.println(circle.radius); // In giá trị của radiusra màn hình
//	}
	// Output: 0
	/* END- Dùng làm tham chiếu tới biến instance */
	
	/* Dùng làm tham chiếu tới biến instance */
	public Circle(int radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		Circle circle = new Circle(4); // Khởi tạo một circle có radius = 4

		System.out.println(circle.radius); // In giá trị của radiusra màn hình
	}
	// Output: 4
	/* END- Dùng làm tham chiếu tới biến instance */
	
	/* Gọi tới một Constructor khác bên trong Class */
}
