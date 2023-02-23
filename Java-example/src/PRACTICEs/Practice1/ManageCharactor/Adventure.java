package PRACTICEs.Practice1.ManageCharactor;

public class Adventure {
	public static void t(CanFight x) {
		x.fight();
	}

	public static void u(CanSwim x) {
		((CanSwim) x).swim();
	}

	public static void v(CanFly x) {
		((CanFly) x).fly();
	}

	public static void w(ActionCharacter x) {
		x.fight();
	}

	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}
