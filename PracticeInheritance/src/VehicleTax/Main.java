package VehicleTax;

import java.text.DecimalFormat;
import java.util.Scanner;

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

	public static void main(String[] args) {
	
		DecimalFormat df = new DecimalFormat("#.#####");

		Vehicle bicycle = new Bicycle();
		//inputVehicle(bicycle);
		System.out.println("Bicycle tax: " + df.format(bicycle.caculateTax()));
		
		Vehicle motobike = new MotoBike();
		System.out.println("Motobile tax: " + df.format(motobike.caculateTax()));
		
		Vehicle truck = new Truck();
		System.out.println("Truck tax: " + df.format(truck.caculateTax()));
		
		Coach coach = new Coach();
		System.out.println("Input number of seats: ");
		coach.setNumberSeat(sc.nextInt()); sc.nextLine();
		System.out.println("Coach tax: " + df.format(coach.caculateTax()));
		
		System.out.println("Input number of seats: ");
		coach.setNumberSeat(sc.nextInt()); sc.nextLine();
		System.out.println("Coach tax 2: " + df.format(coach.caculateTax()));
	}

}
