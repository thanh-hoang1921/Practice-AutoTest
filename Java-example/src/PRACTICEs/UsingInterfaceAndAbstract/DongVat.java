package PRACTICEs.UsingInterfaceAndAbstract;

public abstract class DongVat implements TimeChoAn {
	protected String ten;
	protected int code;

	public DongVat(String ten, int code) {
		this.ten = ten;
		this.code = code;
	}

	public void hienThiTT() {
		System.out.println("____Dong Vat:");
		System.out.println("\tTen" + ten);
		System.out.println("\tcode" + code);
	}
}
