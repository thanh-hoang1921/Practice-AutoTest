package PRACTICEs.Geometry;

import java.util.Scanner;

public class Rectangle {
	int canh1;
	int canh2;

	public Rectangle(int canh1, int canh2) {
		this.canh1 = canh1;
		this.canh2 = canh2;
	}

	public Rectangle() {
	}

	public void inputData(Scanner sn) {
		System.out.println("Nhap giá trị canh 1: ");
		canh1 = sn.nextInt();

		System.out.println("Nhap giá trị canh 2: ");
		canh2 = sn.nextInt();
	}

	public void displayResult(double dienTich, double chuVi) {
		System.out.println("Dien tich: " + dienTich);
		System.out.println("Chu vi: " + chuVi);
	}

	public double tinhChuVi() {
		return (canh1 + canh2) * 2;
	}

	public double tinhDienTich() {
		return canh1 * canh2;
	}
}
