package Practice0902;

public class Main {

	public void sum_1num(int a, int b) {
		
	}
	
	
	public int sum_2num(int a, int b) {
		return a + b;
	}
	
	public static void display_static() {
		System.out.println("class method");
	}
	
	public void display() {
		System.out.println(sum_2num(2, 3));
//		int c = sum_2num(2, 3);
//		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.display();
		m.display_static();
		Main.display_static();
	}

}
