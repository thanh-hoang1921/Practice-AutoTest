package TransportManagement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

import VehicleTax.Vehicle;

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
	 * 1. Input information of each transport type
	 * 
	 * @param scanner
	 */
	public void inputTransport(Scanner scanner) {
		boolean exit = false;
		System.out.println("Input the number of vehical: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("**Input vehical information " + (i + 1) + ": ");
			System.out.println("Select vehical type (1 - Motorcycle, 2 - Car, 3 - Lorry): ");
			int choose = scanner.nextInt();
			scanner.nextLine();
			tr = new Transport() {
			};
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
	 * 2. Find transport by vehical number
	 */
	public List<Transport> searchTransportByVehicalNumber(String id) {
		return this.transportList.stream().filter(t -> t.getVehicleNumber().contains(id)).collect(Collectors.toList());
	}

	/**
	 * 3. Find transport by identity card
	 */
	public List<Transport> searchTransportByIdNo(String idNo) {
		return this.transportList.stream().filter(t -> t.getOwner().getIdNo().contains(idNo))
				.collect(Collectors.toList());
	}

	/**
	 * 4. delete transport by manufacturer 
	 * Chỗ này em không biết nguyên nhân vì sao lại chỉ có xóa 1 đối tượng đầu tiên thôi ạ. Còn không có xóa hết đối tượng có cùng manufacturer. Nhờ chị sửa bài giúp em với ạ
	 * Thêm 1 lỗi nữa là nếu em kiểm tra đói tượng Transport đó rỗng hay không thì sẽ bị lỗi màu đỏ.
	 */
	public boolean deleteTransport1(String manufacturer) {
		for (int i = 0; i < transportList.size(); i++) {
			if (transportList.get(i).getManufacturer().equals(manufacturer)) {
				//transportList.remove(i);
				tr = transportList.get(i);
			}
			if(tr != null) {
				transportList.remove(tr);
				return true;
			}
			else
				System.out.printf("Manufacturer = %d not existed.\n", manufacturer);
		}
		return false;
	}

	/**
	 * 5. Find manufacturer with the most transport
	 * Chị ơi, chỗ này nếu trường hợp số lượng xe của mỗi nhà sản xuất giống nhau thì mình làm thế nào ạ.
	 * Ở câu lệnh if (hmanufacturer.get(key) > maxCount) --> em sửa thành if (hmanufacturer.get(key) >= maxCount) --> Em thấy nó hiện thị đúng nhưng lại bị lặp giá trị nên thấy sai sai ạ. Nhờ chị sửa chỗ này giúp em với.
	 */
	public void getMaxManufacturer() {
		TreeMap<String, Integer> hmanufacturer = new TreeMap<String, Integer>();
		for (int i = 0; i < transportList.size(); i++) {
			addElement(hmanufacturer, transportList.get(i).getManufacturer());
		}
		int maxCount = 0;
		String maxManufacturer = null;
		for (String key : hmanufacturer.keySet()) {
			if (hmanufacturer.get(key) > maxCount) {
				maxCount = hmanufacturer.get(key);
				maxManufacturer = key;
			}
		}
		System.out.println(maxManufacturer + " has " + maxCount + " vehical(s)");
	}

	/**
	 * 6. Sort transport by vehical number
	 */
	public void sortTransportByVehicalId() {
		Collections.sort(transportList, new SortByNumberID());
	}

	/**
	 * 7. Statistics of each type of vehicle
	 */
	public void statisticsTransport() {
		TreeMap<String, Integer> hmap = new TreeMap<String, Integer>();
		for (int i = 0; i < transportList.size(); i++) {
			addElement(hmap, transportList.get(i).getManufacturer());
		}
		System.out.println("Statistics of each type of vehicle: ");
		for (String key : hmap.keySet()) {
			System.out.println("Number of transport " + key + " type: " + hmap.get(key));
		}
	}

	/**
	 * Add transport to map
	 * 
	 * @param map: map contains element and number of occurrences
	 * @param element: elements to add to map
	 */
	public void addElement(TreeMap<String, Integer> map, String element) {
		if (map.containsKey(element)) {
			int count = map.get(element) + 1;
			map.put(element, count);
		} else {
			map.put(element, 1);
		}
	}

	/**
	 * Add data into List<Transport> -- to check
	 */
	public void addData() {
		transportList.add(new Car("A5501", "Honda", "2022", "Red",
				new Owner("Hoang Thi Ngoc Thanh", "201928737464", "thanhthanh123@gmail.com"), 4, "2 engine"));
		transportList.add(new Car("A5502", "Yamaha", "2001", "Pink",
				new Owner("Dang Thu Thao", "1234567890", "thaodang8923@gmail.com"), 16, " engine 2"));
		transportList.add(new Motorcycle("MO111", "Toyota", "2021", "Pink",
				new Owner("Nguyen Van Tien", "232192838384775", "tien@gmail.com"), 12));
		transportList.add(new Motorcycle("MO112", "Honda", "2021", "Pink",
				new Owner("Duong Van An", "9288283848484885", "anduong@gmail.com"), 15));
		transportList.add(new Lorry("LO001", "Yamaha", "2021", "Pink",
				new Owner("Pham Huu Kien", "72636748218938189", "keinpham3@gmail.com"), 20.1));
		transportList.add(new Lorry("LO002", "Yamaha", "2023", "Black",
				new Owner("Ky Quang Anh Thinh", "6282912983918", "anhthinh@gmail.com"), 30.9));
		transportList.add(new Lorry("LO003", "Suzuki", "2005", "Purple",
				new Owner("Phan Kieu Oanh", "92812947291472947", "oanhphan@gmail.com"), 19));
	}
}
