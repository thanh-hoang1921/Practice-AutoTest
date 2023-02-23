package Slide1.AccessModifier;

public class PrivateEx {
	private int data = 40;
	private String user = "An";

	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}



	private void msg() {
		System.out.println( "Hello java");
		System.out.println(data);
	}
	
	
	
	public void getData() {
		System.out.println(data);
	}
}
