package TransportManagement;

import java.util.ArrayList;
import java.util.Collections;
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
	
	/**
	 * input information of each transport type
	 * @param scanner
	 */
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
	
	/**
	 * display transport information
	 */
	public void displayTransport() {
	 for (Transport tr : transportList)
		 tr.displayTransport();
	}
	
	/**
	 * sort transport by vehical number
	 */
	public void sortTransportByVehicalId() {
		Collections.sort(transportList, new SortByNumberID());
	}
	
	/**
	 * delete vehical by manufacturer
	 */
    public void deleteVehical(String manufacturer) {
    	tr = new Transport() {
		};
        for (int i = 0; i < transportList.size(); i++) {
            if (transportList.get(i).getManufacturer().equals(manufacturer)) {
                tr = transportList.get(i);
                tr.displayTransport();
                break;
            }
        }
        if (tr != null) {
            transportList.remove(tr);
        } else {
            System.out.printf("Manufacturer = %d not existed.\n", manufacturer);
        }
    }
    
	  public void addData() {
		  transportList.add(new Car("A5501", "Honda", "2022", "Red", "tuan", 4, "2 engine"));
		  transportList.add(new Car("A5502", "Yamaha", "2001", "Pink", "Thanh", 16, " engine 2"));
		  transportList.add(new Motorcycle("MO111", "Yamaha", "2021", "Pink", "Phu", 12));
		  transportList.add(new Motorcycle("MO112", "Honda", "2021", "Pink", "John", 15));
		  transportList.add(new Lorry("LO001", "Yamaha", "2021", "Pink", "Kien", 20.1));
		  transportList.add(new Lorry("LO002", "Yamaha", "2023", "Black", "Anh", 30.9));
		  transportList.add(new Lorry("LO003", "Suzuki", "2005", "Purple", "Oanh", 19));
	  }
}
