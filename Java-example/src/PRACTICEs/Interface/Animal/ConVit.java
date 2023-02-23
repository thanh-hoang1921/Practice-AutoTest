package PRACTICEs.Interface.Animal;

public class ConVit extends DongVat implements IBay, IBoi{

	@Override
	public void chay() {
		System.out.println("I'm runing");
	}

	@Override
	public void bay() {
		System.out.println("I'm fying...");
		
	}

	@Override
	public void boi() {
		System.out.println("I'm swimming...");
		
	}
	

}
