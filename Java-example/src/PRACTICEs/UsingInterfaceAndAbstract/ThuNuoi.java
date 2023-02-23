package PRACTICEs.UsingInterfaceAndAbstract;

public abstract class ThuNuoi extends DongVat implements CanTamRua {

	public ThuNuoi(String ten, int code) {
		super(ten, code);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String gioChoAn() {
		return GioChoAn.BuoiTrua.toString();
	}

	@Override
	public void tamRua() {
		System.out.println("ThuNuoi co the tam rua");
	}
}
