package TransportManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransportManagement {

	private List<Transport> transportList;
	private Transport tr;
	
	public TransportManagement() {
		transportList = new ArrayList<>();
	}
	
	public void addTransport(Transport tr) {
		transportList.add(tr);
	}
	
	public void inputTransport(Scanner scanner) {
		boolean exit = false;
		System.out.println("Input the number of vehical: ");
		int n = scanner.nextInt(); scanner.nextLine();
		 for (int i = 0; i < n; i++) { 
			 System.out.println("**Input vehical information " + (i + 1) + ": "); 
			 System.out.println("Select vehical type (1 - Motorcycle, 2 - Car, 3 - Lorry): ");
			 int choose = scanner.nextInt(); scanner.nextLine();
			 tr = new Transport() {};
			switch (choose) {
			case 1: {
				tr = new Motorcycle();
				break;
			}
			case 2: {
				tr = new Car();
				break;
			}
			case 3: {
				tr = new Lorry();
				break;
			}
			case 0: {
                System.out.println("exited!");
                exit = true;
                break;
			}
			default:
				System.out.println("invalid! please choose action in below menu:");
			}
			if (exit) {
	            break;
	         }
			tr.inputTransportInfo();
			addTransport(tr);
		 }
	}
	
	public void displayTransport() {
	 for (Transport tr : transportList)
		 tr.displayTransport();
	}
}
