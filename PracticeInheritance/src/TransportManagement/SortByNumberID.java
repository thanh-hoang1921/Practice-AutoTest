package TransportManagement;

import java.util.Comparator;

public class SortByNumberID implements Comparator<Transport>{

	@Override
	public int compare(Transport transport1, Transport transport2) {
			return transport2.getVehicleNumber().compareTo(transport1.getVehicleNumber());
	}

}