package NestedClass;

/**
 * 
 * Khi chúng ta khai báo các thuộc tính nằm trong các khu vực con mà có tên
 * giống nhau, thì các biến nằm trong cùng sẽ được dùng trước tiên.
 *
 */
public class SampleVariableExa {
	public int x = 0;

	class LevelTwo {
		public int x = 1;

		void methodLevelTwo(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("LevelOne.this.x = " + SampleVariableExa.this.x);
		}
	}

	public static void main(String[] args) {
		SampleVariableExa lo = new SampleVariableExa();
		SampleVariableExa.LevelTwo lt = lo.new LevelTwo();
		lt.methodLevelTwo(23);
	}
	/*
	 * chúng ta có 3 biến tên là x, một biến là thuộc tính của lớp LevelOne, một
	 * biến là thuộc tính của lớp LevelTwo, một biến là tham số của phương thức
	 * methodLevelTwo(). Khi chúng ta sử dụng đến biến x trong phương thức
	 * methodLevelTwo() thì Java sẽ tự động hiểu là dùng biến trong tham số,
	 * muốn truy xuất đến biến x của lớp LevelTwo thì chúng ta phải dùng từ khóa
	 * this, muốn truy xuất đến biến x của lớp LevelOne thì chúng ta phải ghi rõ
	 * tên lớp rồi tới từ khóa this.
	 */
}
