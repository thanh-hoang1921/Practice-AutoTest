package Java0702;

public class Example1 {

	String name; // attribute của class đó
	{
		System.out.println("Bonjour");
	}
	
	public void display () {
		//System.out.println("Bonjour");
		System.out.println("Hello " + name);
	}
	
	public void display_1 () {
		//System.out.println("Bonjour");
		System.out.println("Hello " + name);
	}
	
	public void display_2 () {
		//System.out.println("Bonjour");
		System.out.println("Hello " + name);
	}
	
	public void display_3 () {
		//System.out.println("Bonjour");
		System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Example1 ex_1 = new Example1();
		 ex_1.name = "Thanh";
		 ex_1.display();
		 
		 Example1 ex_2 = new Example1();
		 ex_2.name = "Bot";
		 ex_2.display_1();
		 ex_2.display_2();
	}
}
