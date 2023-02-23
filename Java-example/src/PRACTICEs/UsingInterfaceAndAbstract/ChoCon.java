package PRACTICEs.UsingInterfaceAndAbstract;

public class ChoCon extends ThuNuoi implements CanChupHinh{

	public ChoCon(String ten, int code) {
		super(ten, code);
	}

	@Override
	public void chupHinh() {
		System.out.println("Can chup hinh");		
	}


}
