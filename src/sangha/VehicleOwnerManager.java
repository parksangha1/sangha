package sangha;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import vehicleowner.BranchOfficeVehicleOwner;
import vehicleowner.Guest;
import vehicleowner.HeadOfficeVehicleOwner;
import vehicleowner.VehicleOwnerInput;
import vehicleowner.VehicleOwnerKind;


public class VehicleOwnerManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4856891444126790873L;
	
	ArrayList<VehicleOwnerInput> vehicleOwners = new ArrayList<VehicleOwnerInput>();
	transient Scanner input;
	VehicleOwnerManager(Scanner input){
		this.input=input;
	}
	public void addVehicleOwner() {
		int kind=0;
		VehicleOwnerInput vehicleOwnerInput;
		while(kind<1 || kind>3) {
			try {
				System.out.println("1 for Head Office  ");
				System.out.println("2 for Guest  ");
				System.out.println("3 for Branch Office  ");
				System.out.print("Select num 1, 2, or 3 for Vehicle Owner Kind: ");
				kind = input.nextInt();
				if(kind == 1) {
					vehicleOwnerInput = new HeadOfficeVehicleOwner(VehicleOwnerKind.HeadOffice);
					vehicleOwnerInput.getUserInput(input);
					vehicleOwners.add(vehicleOwnerInput);
					break;
				}
				else if(kind == 2) {
					vehicleOwnerInput = new Guest(VehicleOwnerKind.Guest);
					vehicleOwnerInput.getUserInput(input);
					vehicleOwners.add(vehicleOwnerInput);
					break;
				}
				else if(kind == 3) {
					vehicleOwnerInput = new BranchOfficeVehicleOwner(VehicleOwnerKind.BranchOffice);
					vehicleOwnerInput.getUserInput(input);
					vehicleOwners.add(vehicleOwnerInput);
					break;
				}
				else {
					System.out.println("Select num for Vehicle Owner Kind Between 1 and 3: ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	public void deleteVehicleOwner() {
		System.out.print("Vehicle Owner Number: ");
	      int VehicleOwnerNumber =input.nextInt();
	      int index = findIndex(VehicleOwnerNumber);
	      removefromVehicleOwners(index, VehicleOwnerNumber);
	}
	public int findIndex(int VehicleOwnerNumber) {
		 int index = -1;
	      for(int i=0; i<vehicleOwners.size(); i++) {
	         if(vehicleOwners.get(i).getNumber()==VehicleOwnerNumber) {
	            index = i;
	            break;
	         }
	      }
	      return index;
	}
	
	public int removefromVehicleOwners(int index, int VehicleOwnerNumber) {
		if(index >= 0) {
	         vehicleOwners.remove(index);
	         System.out.println("the Vehicle Owner"+VehicleOwnerNumber+"is deleted");
	         return 1;
	      }
	      else {
	         System.out.println("the Vehicle Owner has not been registered");
	         return -1;
	         }
	}
	public void editVehicleOwner() {
	      System.out.print("Vehicle Owner Number: ");
	      int VehicleOwnerNumber=input.nextInt();
	      for(int i=0;i<vehicleOwners.size();i++) {
	         VehicleOwnerInput vehicleOwnerInput = vehicleOwners.get(i);
	         if(vehicleOwnerInput.getNumber() == VehicleOwnerNumber) {
	            int num=-1;
	            switch(num) {
	            case 1:
	            	 vehicleOwnerInput.setVehicleNumber(input);
	            	 break;
	            case 2:
	            	vehicleOwnerInput.setVehicleOwnerName(input);
	            	break;
	            case 3:
	            	vehicleOwnerInput.setVehicletype(input);
	            	break;
	            case 4:
	            	vehicleOwnerInput.setVehicleOwnerDepartment(input);
	            	break;
	            default:
	            	continue;
	            }
	         }
	         break;
	      }
	}
	
	public void viewVehicleOwners() {
		System.out.println("# of registered veihicle owners: "+vehicleOwners.size());
		for(int i=0;i<vehicleOwners.size();i++) {
			vehicleOwners.get(i).printInfo();
		}
	}
	
	public void showEditMenu() {
		System.out.println("**Vehicle Owner Info Edit Menu**");
        System.out.println("1. Edit Number");
        System.out.println("2. Edit Name");
        System.out.println("3. Edit A type of car");
        System.out.println("4. Veiw Owner's Applicable Department");
        System.out.println("5. Exit");
        System.out.println("Select one number between 1 - 6: ");
	}

}