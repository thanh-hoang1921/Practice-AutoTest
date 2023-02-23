package PRACTICEs.Interface.Animal;

public class ConGa extends DongVat implements IBay{

	@Override
	public void chay() {
		System.out.println("I'm runing");
	}

	@Override
	public void bay() {
		System.out.println("I'm fying...");
		
	}

}
