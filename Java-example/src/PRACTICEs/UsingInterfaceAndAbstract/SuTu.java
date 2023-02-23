package PRACTICEs.UsingInterfaceAndAbstract;

public class SuTu extends DVAnThit {
	int tuoi;

	public SuTu(String ten, int code, int tuoi) {
		super(ten, code);
		this.tuoi = tuoi;
	}

	@Override
	public void hienThiTT() {
		super.hienThiTT();
		System.out.println("\tTuoi: " + tuoi);

	}
}
