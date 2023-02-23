package Java0702;

public class Demo1 {

	String data;
	
	static int val = 1;
	
    Demo1(String val) {
		data = val;
    	//data = "Meow";
	}
    
    Demo1(int val) {
		data = "Hello";
	}
    
    Demo1() {
		data = "111";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1(); //Demo1() là hàm dựng contructure
		System.out.println(d1.data);
		System.out.println(d1.val);
		Demo1.val = 3;
		System.out.println(Demo1.val);
		
		d1.val = 90;
		
		Demo1 d2 = new Demo1(2);
		//System.out.println(d2.data);
		System.out.println(d2.val);
//		
//		Demo1 d3 = new Demo1("hahahaha");
//		System.out.println(d3.data);

	}

}
