package VehicleTax;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	 static Scanner sc = new Scanner(System.in);
		/*
		 * static void inputVehicle (Vehicle vehicle) {
		 * System.out.println("Input vehicle ID: "); vehicle.setVehicleID(sc.nextInt());
		 * sc.nextLine(); System.out.println("Input vehicle Name: ");
		 * vehicle.setVehicleName(sc.nextLine());
		 * System.out.println("Input capacity: "); vehicle.setCapacity(sc.nextInt());
		 * sc.nextLine(); System.out.println("Input Owner: ");
		 * vehicle.setOwner(sc.nextLine());
		 * 
		 * }
		 */

	 
		
	public static boolean IsNumberic (String str) {
			String regex = "-?\\d+(\\.\\d+)?";
			Pattern p = Pattern.compile(regex);
			boolean check = p.matcher(str).matches();
			if (check) {
				return true;
			}
			return false;
	}
	 
	public static void main(String[] args) {
	
		DecimalFormat df = new DecimalFormat("#.#####");
	//	BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

		Vehicle bicycle = new Bicycle();
		//inputVehicle(bicycle);
		System.out.println("Bicycle tax: " + df.format(bicycle.caculateTax()));
		
		Vehicle motobike = new MotoBike();
		System.out.println("Motobile tax: " + df.format(motobike.caculateTax()));
		
		Vehicle truck = new Truck();
		System.out.println("Truck tax: " + df.format(truck.caculateTax()));
		
		Coach coach = new Coach();
		
		System.out.println("Input number of seats: ");
		coach.setNumberSeat(sc.nextInt());
		System.out.println("Coach tax: " + df.format(coach.caculateTax()));
		
		System.out.println("Input number of seats: ");
		coach.setNumberSeat(sc.nextInt()); sc.nextLine();
		System.out.println("Coach tax 2: " + df.format(coach.caculateTax()));
	}
}
