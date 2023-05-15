package vehicleowner;

import java.util.Scanner;

public interface VehicleOwnerInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setType(String type);
	
	public void setDepartment(String department);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
}
