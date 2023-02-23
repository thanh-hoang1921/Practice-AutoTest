package QuanLySinhVien;

public abstract class Khoa {
	private int maKhoa;
	private String ten;

	public Khoa(int maKhoa, String ten) {
		this.maKhoa = maKhoa;
		this.ten = ten;
	}

	public int getMaKhoa() {
		return maKhoa;
	}

	public void setMaKhoa(int maKhoa) {
		this.maKhoa = maKhoa;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void hienThiTT() {
		System.out.println("____Thong tin Khoa:");
		System.out.println("\tMa khoa: " + getMaKhoa());
		System.out.println("\tTen khoa: " + getTen());
	}

}
