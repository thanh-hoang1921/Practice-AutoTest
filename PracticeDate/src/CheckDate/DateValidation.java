package CheckDate;

import java.util.Scanner;

public class DateValidation {

	public static void main(String[] args) {
		int day, month, year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input day: ");
		day = sc.nextInt();

		System.out.println("Input month: ");
		month = sc.nextInt();

		System.out.println("Input year: ");
		year = sc.nextInt();

		if (year <= 0 || month <= 0 || month > 12 || day < 1 || day > 31) {
			System.out.println("Data input invalid");
		} else {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Month " + month + " of year " + year + " has 31 days");
				System.out.println(day + "/" + month + "/" + year + " is valid");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Month " + month + " of year " + year + " has 30 days");
				System.out.println(day + "/" + month + "/" + year + " is valid");
				break;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					if (day > 29) {
						System.out.println("Data input invalid (day invalid)");
						break;
					}
					System.out.println("Month " + month + " of year " + year + " has 29 days and year " + year
							+ " is a leap year");
					System.out.println(day + "/" + month + "/" + year + " is valid");
					break;
				}
				if (day > 28) {
					System.out.println("Data input invalid (day invalid)");
					break;
				}
				System.out.println(
						"Month " + month + " of year " + year + " has 28 days and year " + year + " isn't a leap year");
				System.out.println(day + "/" + month + "/" + year + " is valid");
				break;
			}
		}

	}

}
