package PRACTICEs.Geometry;

import java.util.Scanner;

public class Pediment extends Rectangle {
	int canhDay;
	int chieuCao;

	public Pediment(int canh1, int canh2, int canhDay, int chieuCao) {
		super(canh1, canh2);
		this.canhDay = canhDay;
		this.chieuCao = chieuCao;
	}

	public Pediment() {
	}

	@Override
	public double tinhDienTich() {
		return (canhDay * chieuCao) / 2;
	}

	@Override
	public double tinhChuVi() {
		return canhDay + super.canh1 + super.canh2;
	}

	@Override
	public void inputData(Scanner sn) {
		super.inputData(sn);

		System.out.println("Nhap gia tri canh day: ");
		canhDay = sn.nextInt();

		System.out.println("Nhap gia tri chieu cao: ");
		chieuCao = sn.nextInt();
	}
}
