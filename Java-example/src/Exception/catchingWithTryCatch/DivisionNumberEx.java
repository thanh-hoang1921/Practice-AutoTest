package Exception.catchingWithTryCatch;

public class DivisionNumberEx {
	public static void divisionNumber() {
		int n1 = 10;
		int n2 = 0;
		System.out.println("n1/n2 = " + n1 / n2);
	}

	public static void divisionNumber1() {
		int n1 = 10;
		int n2 = 0;
		try {
			System.out.println("n1/n2 = " + n1 / n2);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught " + e.getMessage());
		}
	}

	public static void divisionNumber2() {
		int n1 = 10;
		int n2 = 0;

		try {
			System.out.println("n1/n2 = " + n1 / n2);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught " + e.getMessage());
		} finally {
			System.out.println("Finally: n1 = " + n1 + "n2 = : " + n2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
