package TransportManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	  static List<Transport> listTransport = new ArrayList<Transport>(); 
	  static Transport tr;
	
	 public static void showMenu() {
	        System.out.println("-----------menu------------");
	        System.out.println("1. Add Car");
	        System.out.println("2. Add Motorcycle");
	        System.out.println("3. Add Lorry");
	        System.out.println("4. Add new owner");
	        System.out.println("5. Find vehical by identity card");
	        System.out.println("6. Delete all vehical of any manufacturer");
	        System.out.println("7. Find the manufacturer with the most vehicles under management");
	        System.out.println("8. Sort vehical by vehical number DESC");
	        System.out.println("9. Statistics of each type of vehicle, how many vehicles are being managed");
	        System.out.println("0. exit.");
	        System.out.println("---------------------------");
	        System.out.print("Please choose: ");
	    }

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		TransportManagement trMana = new TransportManagement();
		trMana.inputTransport(scanner);
		trMana.displayTransport();
		 
	}

}
