package QuanLySinhVien;

public class KhoaNgoaiGiao extends Khoa implements UngCuCongDoan {
	private boolean isJapanee;
	private boolean isKorea;

	public KhoaNgoaiGiao(int maKhoa, String ten) {
		super(maKhoa, ten);
	}

	public KhoaNgoaiGiao(int maKhoa, String ten, boolean isJapanee, boolean isKorea) {
		super(maKhoa, ten);
		this.isJapanee = isJapanee;
		this.isKorea = isKorea;
	}

	@Override
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("\tNoi tieng Nhat: " + canSpeakJapanee());
		System.out.println("\tNoi tieng Han: " + canSpeakKorea());
	}

	public void hienThiTT(boolean isJapanee, boolean isKorea) {
		super.hienThiTT();
		System.out.println("\tNoi tieng Nhat: " + canSpeakJapanee(isJapanee));
		System.out.println("\tNoi tieng Han: " + canSpeakKorea(isKorea));
	}

	private String canSpeakJapanee() {
		return getIsJapanee() ? "Co" : "Khong";
	}

	private String canSpeakKorea() {
		return getIsKorea() ? "Co" : "Khong";
	}

	private String canSpeakJapanee(boolean isJapanee) {
		return isJapanee ? "Co" : "Khong";
	}

	private String canSpeakKorea(boolean isKorea) {
		return isKorea ? "Co" : "Khong";
	}

	public boolean getIsJapanee() {
		return isJapanee;
	}

	public void setJapanee(boolean isJapanee) {
		this.isJapanee = isJapanee;
	}

	public boolean getIsKorea() {
		return isKorea;
	}

	public void setKorea(boolean isKorea) {
		this.isKorea = isKorea;
	}

	@Override
	public void coTheUngCu() {
		System.out.println("Tui la sinh vien khoa ngoai giao, tui có thể ứng cử công đoàn");
		
	}

}
