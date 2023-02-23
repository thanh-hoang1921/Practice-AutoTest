package dateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateValidationExample {
	public static boolean isDateValid(String date) {
		String format = "dd/MM/yyyy"; // định dạng ngày tháng năm
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setLenient(false);

		try {
			sdf.parse(date);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("He thong chi chap nhan format DD/MM/YYYY");
		System.out.println("Input ngay can kiem tra:");
		String inputDate = sc.nextLine();
		if (isDateValid(inputDate)) {
			String[] parts = inputDate.split("/");
			int day = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int year = Integer.parseInt(parts[2]);

			if (isLeapYear(year)) {
				if (month == 2 && day == 29) {
					System.out.println("Năm " + year + " là năm nhuận và ngày " + inputDate + " là hợp lệ.");
				} else {
					System.out.println("Năm " + year + " là năm nhuận nhưng ngày " + inputDate + " không hợp lệ.");
				}
			} else {
				if (month == 2 && day > 28) {
					System.out.println("Năm " + year + " không là năm nhuận và ngày " + inputDate + " không hợp lệ.");
				} else {
					System.out.println("Ngày " + inputDate + " là hợp lệ.");
				}
			}
		} else {
			System.out.println("Ngày " + inputDate + " không hợp lệ.");
		}
	}
}
