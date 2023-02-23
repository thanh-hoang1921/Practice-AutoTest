package QuanLySinhVien;

public class SinhVien {
	private int maSv;
	private String ten;
	private Khoa khoa;
	private String hocLuc;

	public SinhVien(int maSv, String ten, Khoa khoa, String hocLuc) {
		this.maSv = maSv;
		this.ten = ten;
		this.khoa = khoa;
		this.hocLuc = hocLuc;
	}

	public SinhVien(int maSv, String ten) {
		this.maSv = maSv;
		this.ten = ten;
	}

	public void hienThiThongTin() {
		System.out.println("___Hien thi thong tin Sinh Vien:");
		System.out.println("\tMa SV: " + getMaSv());
		System.out.println("\tTen: " + getTen());
		System.out.println("\tHoc luc: " + getHocLuc());
		getKhoa().hienThiTT();
	}

	public void registerLearnJapanee() {
		//
		if ("Gioi".equals(getHocLuc()) && this.khoa instanceof KhoaCNTT) {
			CanHocTIengNhat hocJapaneeFree = new CanHocTIengNhat() {
				@Override
				public void registerLearnJapanee() {
					System.out.println("Tui la sinh vien gioi, toi dc hoc tieng nhat free");
				}
			};
			hocJapaneeFree.registerLearnJapanee();
		}
	}

	public int getMaSv() {
		return maSv;
	}

	public void setMaSv(int maSv) {
		this.maSv = maSv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Khoa getKhoa() {
		return khoa;
	}

	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}

	public String getHocLuc() {
		return hocLuc;
	}

	public void setHocLuc(String hocLuc) {
		this.hocLuc = hocLuc;
	}

}
