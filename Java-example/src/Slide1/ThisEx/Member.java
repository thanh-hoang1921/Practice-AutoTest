package Slide1.ThisEx;

public class Member {
	int id;
	String name;

	Member() {
		System.out.println("Constructor mac dinh");
		// Constructor mặc định
	}

	Member(int id) {
		this.id = id;
//		this(); // error
	}

	Member(int id, String name) {
		this(id);
		this.name = name;
	}
}
