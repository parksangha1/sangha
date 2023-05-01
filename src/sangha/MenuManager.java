package sangha;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VehicleOwnerManager vehicleOwnerManager = new VehicleOwnerManager(input);
		
		int num=0;
		while(num!=6) {
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. Add Vehicle Owner");
			System.out.println("2. Delete Vehicle Owner");
			System.out.println("3. Edit Vehicle Owner");
			System.out.println("4. View Vehicle Owners");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6: ");
			num=input.nextInt();
			switch (num) {
			case 1:
				vehicleOwnerManager.addVehicleOwner();
				break;
			case 2:
				vehicleOwnerManager.deleteVehicleOwner();
				break;
			case 3:
				vehicleOwnerManager.editVehicleOwner();
				break;
			case 4:
				vehicleOwnerManager.viewVehicleOwners();
				break;
			case 5:
				
			case 6:
			}
		}
		
	}

}