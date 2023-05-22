package vehicleowner;

import java.util.Scanner;

public class Guest extends OfficeVehicleOwner {
	
	public Guest(VehicleOwnerKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setVehicleOwnerName(input);
		setVehicleNumber(input);
		setVehicletype(input);
		setVehicleOwnerDepartmentwithYN(input);	
	}
}
