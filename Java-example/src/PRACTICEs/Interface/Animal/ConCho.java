package PRACTICEs.Interface.Animal;

public class ConCho extends DongVat implements IBoi {

	@Override
	public void chay() {
		System.out.println("I'm run fast");
	}

	@Override
	public void boi() {
		System.out.println("I'm swimming");
	}

}
