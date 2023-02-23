package Exception.catchingWithTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx {

	public static void main(String[] args) {
		int num;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		try {
			System.out.printf("Enter number: ");
			num = sc.nextInt();
			System.out.println("Number is: " + num);
		} catch (InputMismatchException e) {
			System.out.println("Error! Invalid number.");
		} finally {
			System.out.println("The end Program");
		}

	}

}
