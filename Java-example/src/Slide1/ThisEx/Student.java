package Slide1.ThisEx;

public class Student {
	int id;
	String name;

	Student() {
		System.out.println("Constructor mac dinh");
		// Constructor mặc định
	}

	Student(int id) {
		this();
		this.id = id;
	}

	Student(int id, String name) {
		this(id);
		this.name = name;
	}

	public void display() {
		System.out.println("id : " + id);
		System.out.println("name : " + name);
	}

	public static void main(String[] args) {
		Student std_1 = new Student(1510510); // Khởi tạo một sinh viên có id là 1510510
		std_1.display();
		Student std_2 = new Student(1510510, "Steven");// Khởi tạo một sinh viên có id là 1510510 và tên Steven
		std_2.display();
	}
}
