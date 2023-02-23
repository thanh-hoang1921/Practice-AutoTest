package QuanLySinhVien;

public class KhoaCNTT extends Khoa implements NgayHoiIT {
	private String chungChiIT;

	public KhoaCNTT(int maKhoa, String ten) {
		super(maKhoa, ten);
	}

	public KhoaCNTT(int maKhoa, String ten, String chungChiIT) {
		super(maKhoa, ten);
		this.chungChiIT = chungChiIT;
	}

	public String getChungChiIT() {
		return chungChiIT;
	}

	public void setChungChiIT(String chungChiIT) {
		this.chungChiIT = chungChiIT;
	}

	@Override
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("\tChung chi IT: " + getChungChiIT());
	}

	public void hienThiTT(String chungChi) {
		super.hienThiTT();
		System.out.println("\tChung chi IT: " + chungChi);
	}

	@Override
	public void joinNgayHoiIT() {
		System.out.println("Can Join ngay hoi IT");
	}

}
