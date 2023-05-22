package vehicleowner;

import java.util.Scanner;

import exception.DepartmentFormatException;

public interface VehicleOwnerInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setType(String type);
	
	public void setDepartment(String department) throws DepartmentFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setVehicleNumber(Scanner input);
	
	public void setVehicleOwnerName(Scanner input);
	
	public void setVehicletype(Scanner input);
	
	public void setVehicleOwnerDepartment(Scanner input);
}
