package Slide1.casting;

public class ExplicitypeConversion {

	public static void main(String[] args) {
		double myDouble = 9.78d;
		int myInt = (int) myDouble; // double -> int
		System.out.println(myDouble);
		System.out.println(myInt);

		// Ví dụ sử dụng cùng lúc 2 loại ép kiểu
		int height = 6;
		double mass = 220.23456;

		// ép kiểu mở rộng
		double result = height;
		System.out.println("Giá trị của biến result sau khi ép kiểu = " + result);
		// ép kiểu hẹp
		int massVal = (int) mass;
		System.out.println("Giá trị biến massValue sau khi ép kiểu = " + massVal);
	}

}
