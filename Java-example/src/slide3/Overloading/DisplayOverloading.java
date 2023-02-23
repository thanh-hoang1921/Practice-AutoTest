package slide3.Overloading;

public class DisplayOverloading {
	public static void disp(String c) {
		System.out.println(c);
	}

	public static void disp(int c) {
		System.out.println(c);
	}

	public static void disp(float c, int num) {
		System.out.println(c + "; " + num);
	}

	public static void disp(String c, String num) {
		System.out.println(c + "; " + num);
	}

	public static void main(String[] args) {
		DisplayOverloading.disp("a");
		DisplayOverloading.disp(12);
	}
}
