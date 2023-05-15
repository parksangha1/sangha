package vehicleowner;

import java.util.Scanner;

public class Guest extends VehicleOwner implements VehicleOwnerInput {
	
	public Guest(VehicleOwnerKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Vehicle Owner Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Vehicle's Number : ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("A type of car : ");
		String type = input.next();
		this.setType(type);
		
		char answer='x';
		while(answer!='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
			System.out.print("Do you have a department? (Y/N)");
			answer=input.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				System.out.print("Owner's Applicable Department : ");
				String department = input.next();
				this.setDepartment(department);
				break;
			}
			else if(answer=='n'||answer=='N') {
				this.setDepartment("");
			}
			
		}
	}
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case HeadOffice:
			skind = "Head";
			break;
		case Guest:
			skind = "Guest";
			break;
		case BranchOffice:
			skind = "Branch";
			break;
		default:
		}
		System.out.println("kind: "+skind+" name: "+name+" number: "+number+" type: "+type+" department: "+department);
	}
}
