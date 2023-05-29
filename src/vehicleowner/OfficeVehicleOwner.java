package vehicleowner;

import java.util.Scanner;

import exception.DepartmentFormatException;

public abstract class OfficeVehicleOwner extends VehicleOwner {
	
	public OfficeVehicleOwner(VehicleOwnerKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+skind+" name: "+name+" number: "+number+" type: "+type+" department: "+department);
	}
	
	public void setVehicleOwnerDepartmentwithYN(Scanner input) {
		char answer='x';
		while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.print("Do you have a department? (Y/N)");
			answer=input.next().charAt(0);
			try {
				if(answer=='y'||answer=='Y') {
					setVehicleOwnerDepartment(input);
					break;
				}
				else if(answer=='n'||answer=='N') {
					this.setDepartment("");
					break;
				}
			}
			catch(DepartmentFormatException e) {
				 System.out.println("Incorrect Departmaent Format, put the departmnent that contains -");
			}
		}
	}
}
