package vehicleowner;

import java.util.Scanner;

public class HeadOfficeVehicleOwner extends VehicleOwner {
	
	public HeadOfficeVehicleOwner(VehicleOwnerKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setVehicleOwnerName(input);
		setVehicleNumber(input);
		setVehicletype(input);
		setVehicleOwnerDepartment(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+skind+" name: "+name+" number: "+number+" type: "+type+" department: "+department);
	}
}