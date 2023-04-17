package sangha;

import java.util.Scanner;

public class VeicleOwnerManager {
	VeicleOwner veicleOwner;
	Scanner input;
	VeicleOwnerManager(Scanner input){
		this.input=input;
	}
	public void addVeicleOwner() {
		veicleOwner = new VeicleOwner();
		System.out.print("Vehicle Owner Name : ");
		veicleOwner.name = input.next();
		System.out.print("Vehicle's Number : ");
		veicleOwner.number = input.nextInt();
		System.out.print("A type of car : ");
		veicleOwner.type = input.next();
		System.out.print("Owner's Applicable Department : ");
		veicleOwner.department = input.next();
	}
	public void deleteVeicleOwner() {
		System.out.print("Vehicle Owner Name : ");
		String VehicleOwnerName = input.next();
	}
	public void editVeicleOwner() {
		System.out.print("Vehicle Owner Name : ");
		String VehicleOwnerName = input.next();
	}
	public void viewVeicleOwner() {
		System.out.print("Vehicle Owner Name : ");
		String VehicleOwnerName = input.next();
	}

}
