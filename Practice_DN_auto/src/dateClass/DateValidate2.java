package dateClass;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DateValidate2 {

	public static void checkDateData(int year, int month, int day) {
		// check phải là số dương, month từ 1..12
		if (year <= 0 || month < 0 || month > 12 || day < 1 || day > 31) {
			System.out.println("Data input invalid");
			return;
		}

		// Phải là năm nhuận và tháng 2
		if (month == 2 && (year % 4 == 0 || year % 400 == 0)) {
			if (day > 29) {
				System.out.println("Data input invalid (day invalid)");
				return;
			}
			System.out.println("Data Valid");
			return;
		}

		// tháng 2 nhưng ko phải năm nhuận
		if (month == 2) {
			if (day > 28) {
				System.out.println("Data input invalid (day invalid)");
				return;
			}
			System.out.println("Data Valid");
			return;
		}

		// Không phải tháng 2 và ko phải thuộc tháng có 31 ngày
		if (month == 4 || month == 6 || day == 9 || day == 11) {
			if (day > 30) {
				System.out.println("Data input invalid (day invalid)");
				return;
			}
			System.out.println("Data Valid");
			return;
		}

		/*
		 * Từ line 33 - 40 thì mọi người có thể dùng array để sư dụng method contain
		 * Code từ line 49 - 57 là 1 ví dụ, hoặc mọi người có thể tham khảo thêm
		 * https://www.programiz.com/java-programming/examples/array-contains-value
		 */
//		int[] months_has_30_day = {1, 2, 3, 4, 5};
//		if(IntStream.of(months_has_30_day).anyMatch(n -> n == month)) {
//			if (day > 30) {
//				System.out.println("Data input invalid (day invalid)");
//				return;
//			}
//			System.out.println("Data Valid");
//			return;
//		}
		// Không phải tháng 2, là 1 trong tháng có 31 ngày
		if (day > 31) {
			System.out.println("Data input invalid (day invalid)");
			return;
		}
		System.out.println("Data Valid");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input year value: ");
		int year = sc.nextInt();

		System.out.println("Input month value: ");
		int month = sc.nextInt();

		System.out.println("Input day value");
		int day = sc.nextInt();

		checkDateData(year, month, day);

	}

}
