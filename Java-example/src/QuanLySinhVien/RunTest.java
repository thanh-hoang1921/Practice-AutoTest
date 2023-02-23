package QuanLySinhVien;

import java.util.ArrayList;
import java.util.List;

public class RunTest {

	public static void main(String[] args) {
		Khoa khoaCNTT = new KhoaCNTT(1, "Khoa Cong Nghe Thong Tin", "Chua co");
		Khoa khoaNgoaiGiao = new KhoaNgoaiGiao(1, "Khoa Ngoai Giao", true, true);
		Khoa khoaTruyenThong = new KhoaTruyenThong(3, "Khoa truyen thong", "Thuyet trinh");

		List<SinhVien> truongBachKhoa = new ArrayList<>();
		
		SinhVien sv = new SinhVien(1, "Hoa", khoaCNTT, "Gioi");
		truongBachKhoa.add(sv);
		
		
		truongBachKhoa.add(new SinhVien(1, "Hoa", khoaCNTT, "Gioi"));
		truongBachKhoa.add(new SinhVien(1, "Khoa", khoaNgoaiGiao, "Kha"));
		truongBachKhoa.add(new SinhVien(1, "Khoa", khoaTruyenThong, "Kha"));

		for (SinhVien sinhVien : truongBachKhoa) {
			sinhVien.hienThiThongTin();
			sinhVien.registerLearnJapanee();
			endPrint();
		}
	}

	public static void endPrint() {
		System.out.println("\n");
	}
}
