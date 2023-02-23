package Exception.catchingWithTryCatch;

public class NestedTryEx {
	public static void main(String[] args) {
		try {

			// Child try block1
			try {
				System.out.println("Inside block1");
				int b = 45 / 0;
				System.out.println(b);
			} catch (ArithmeticException e1) {
				System.out.println("Exception: e1");
			}
			// Child try block2
			try {
				System.out.println("Inside block2");
				int b = 45 / 0;
				System.out.println(b);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception: e2");
			}

		} catch (ArithmeticException e3) {
			System.out.println("Arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("Array Index Out Of Bounds Exception");
		} catch (Exception e5) {
			System.out.println("Exception");
		}

	}

}
