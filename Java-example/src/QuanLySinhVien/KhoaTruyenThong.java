package QuanLySinhVien;

public class KhoaTruyenThong extends Khoa implements NgayHoiIT {
	private String nangKhieu;

	public KhoaTruyenThong(int maKhoa, String ten, String nangKhieu) {
		super(maKhoa, ten);
		this.nangKhieu = nangKhieu;
	}

	public String getNangKhieu() {
		return nangKhieu;
	}

	public void setNangKhieu(String nangKhieu) {
		this.nangKhieu = nangKhieu;
	}

	@Override
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("\tNang Khieu: " + getNangKhieu());
	}

	public void hienThiTT(String nangKhieu) {
		super.hienThiTT();
		System.out.println("\tNang Khieu: " + nangKhieu);
	}

	@Override
	public void joinNgayHoiIT() {
		System.out.println("Can Join ngay hoi IT");
		
	}

}
