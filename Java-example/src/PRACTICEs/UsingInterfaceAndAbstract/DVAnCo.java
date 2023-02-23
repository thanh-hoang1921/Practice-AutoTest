package PRACTICEs.UsingInterfaceAndAbstract;

public abstract class DVAnCo extends DongVat implements CanTamRua {

	public DVAnCo(String ten, int code) {
		super(ten, code);
	}

	@Override
	public String gioChoAn() {
		return GioChoAn.NuaBuoi.toString();
	}

	@Override
	public void tamRua() {
		System.out.println("DVAnCo co the tam rua");
	}

	public void chupHinh() {
		if (this instanceof Ngua) {

			CanChupHinh chupHinh1 = new CanChupHinh() {

				@Override
				public void chupHinh() {
					System.out.println("Dong vat an co - Ngua");

				}

			};

			chupHinh1.chupHinh(); 
		}
	}

}
