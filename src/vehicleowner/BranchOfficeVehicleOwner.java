package vehicleowner;

import java.util.Scanner;

import exception.DepartmentFormatException;

public class BranchOfficeVehicleOwner extends OfficeVehicleOwner {
	protected String BranchDepartment;
	
	public BranchOfficeVehicleOwner(VehicleOwnerKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setVehicleOwnerName(input);
		setVehicleNumber(input);
		setVehicletype(input);
		setVehicleOwnerDepartmentwithYN(input);
		setBranchOfficeDepartmentwithYN(input);
	}
	
	public void setBranchOfficeDepartmentwithYN(Scanner input) {
		char answer='x';
		while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.print("Do you have a department 'in your office'? (Y/N)");
			answer=input.next().charAt(0);
			try{
				if(answer=='y'||answer=='Y') {
					setVehicleOwnerDepartment(input);
					break;
				}
				else if(answer=='n'||answer=='N') {
					this.setDepartment("");
					break;
				}
				else {
				}
			}
			catch(DepartmentFormatException e) {
				 System.out.println("Incorrect Departmaent Format, put the departmnent that contains -");
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+skind+" name: "+name+" number: "+number+" type: "+type+" department: "+department+" BranchOffice-department: "+department);
	}
}