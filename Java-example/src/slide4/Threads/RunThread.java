package slide4.Threads;

public class RunThread {
	public static void main(String args[]) {
		ExtendsThreadClass t1 = new ExtendsThreadClass();
		t1.start();
		System.out.println("the end");
	}
}
