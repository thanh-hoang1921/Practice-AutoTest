package TransportManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	  static List<Transport> listTransport = new ArrayList<Transport>(); 
	  static Transport tr;
	
	 public static void showMenu() {
	        System.out.println("-----------MENU------------");
	        System.out.println("1. Add new transport");
	        System.out.println("2. Find vehical by vehical number");
	        System.out.println("3. Find vehical by identity card");
	        System.out.println("4. Delete all vehical of any manufacturer");
	        System.out.println("5. Find the manufacturer with the most vehicles under management");
	        System.out.println("6. Sort vehical by vehical number DESC");
	        System.out.println("7. Statistics of each type of vehicle, how many vehicles are being managed");
	        System.out.println("0. exit.");
	        System.out.println("---------------------------");
	        System.out.println("Please choose: ");
	    }

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		TransportManagement trMana = new TransportManagement();
		
		boolean exit = false;
		String choose;
		showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
            	//trMana.inputTransport(scanner);
            	trMana.addData();
            	trMana.displayTransport();
                break;
            case "2":
            	 System.out.println("Input vehical number to search: ");
                 String vehicalNumber = scanner.nextLine();
                 trMana.searchTransportByVehicalNumber(vehicalNumber).forEach(tr -> {
                	 tr.displayTransport();
                 });
                break;
            case "3":
            	System.out.println("Input identity card to search: ");
                String identity = scanner.nextLine();
                trMana.searchTransportByIdNo(identity).forEach(tr -> {
               	 tr.displayTransport();
                });
                break;
            case "4":
              System.out.println("Input manufacturer to delete: ");
              String manufacturer = scanner.nextLine();
              trMana.deleteTransport1(manufacturer);
              trMana.displayTransport();
               break;
            case "5":
                trMana.getMaxManufacturer();
                //trMana.displayTransport();
                break;
            case "6":
                trMana.sortTransportByVehicalId();
                break;
            case "7":
                trMana.statisticsTransport();
                break;   
            case "0":
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            //trMana.displayTransport();
            // show menu
            showMenu();
        }
		 
	}

}
