package sangha;

import java.util.ArrayList;
import java.util.Scanner;

import vehicleowner.BranchOfficeVehicleOwner;
import vehicleowner.Guest;
import vehicleowner.HeadOfficeVehicleOwner;
import vehicleowner.VehicleOwnerInput;
import vehicleowner.VehicleOwnerKind;


public class VehicleOwnerManager {
	ArrayList<VehicleOwnerInput> vehicleOwners = new ArrayList<VehicleOwnerInput>();
	Scanner input;
	VehicleOwnerManager(Scanner input){
		this.input=input;
	}
	public void addVehicleOwner() {
		int kind=0;
		VehicleOwnerInput vehicleOwnerInput;
		while(kind != 1 && kind != 2) {
			System.out.print("1 for Head Office  ");
			System.out.print("2 for Guest  ");
			System.out.print("3 for Branch Office  ");
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
				System.out.print("Select num for Vehicle Owner Kind Between 1 and 2: ");
			}
		}
	}
	public void deleteVehicleOwner() {
		System.out.print("Vehicle Owner Number: ");
	      int VehicleOwnerNumber =input.nextInt();
	      int index = -1;
	      for(int i=0; i<vehicleOwners.size(); i++) {
	         if(vehicleOwners.get(i).getNumber()==VehicleOwnerNumber) {
	            index = i;
	            break;
	         }
	      }
	      if(index >= 0) {
	         vehicleOwners.remove(index);
	         System.out.println("the Vehicle Owner"+VehicleOwnerNumber+"is deleted");
	      }
	      else {
	         System.out.println("the Vehicle Owner has not been registered");
	      }
	}
	public void editVehicleOwner() {
	      System.out.print("Vehicle Owner Number: ");
	      int VehicleOwnerNumber=input.nextInt();
	      for(int i=0;i<vehicleOwners.size();i++) {
	         VehicleOwnerInput vehicleOwnerInput = vehicleOwners.get(i);
	         if(vehicleOwnerInput.getNumber() == VehicleOwnerNumber) {
	            int num=-1;
	            while(num!=5) {
	               System.out.println("**Vehicle Owner Info Edit Menu**");
	               System.out.println("1. Edit Number");
	               System.out.println("2. Edit Name");
	               System.out.println("3. Edit A type of car");
	               System.out.println("4. Veiw Owner's Applicable Department");
	               System.out.println("5. Exit");
	               System.out.println("Select one number between 1 - 6: ");
	               num=input.nextInt();
	               if(num==1) {
	                  System.out.print("Vehicle Owner Number: ");
	                  int number = input.nextInt();
	                  vehicleOwnerInput.setNumber(number);
	               }
	               else if(num==2) {
	                  System.out.print("Vehicle Owner Name: ");
	                  String name = input.next();
	                  vehicleOwnerInput.setName(name);
	               }
	               else if(num==3) {
	                  System.out.print("A type of car: ");
	                  String type = input.next();
	                  vehicleOwnerInput.setType(type);
	               }
	               else if(num==4) {
	                  System.out.print("Veiw Owner's Applicable Department: ");
	                  String department = input.next();
	                  vehicleOwnerInput.setDepartment(department);
	               }
	               else {
	                  continue;
	               }
	            }
	            break;
	         }
	      }
	   }
	public void viewVehicleOwners() {
		//System.out.print("Vehicle's Number : ");
		//int vehicleOwnerNumber = input.nextInt();
		System.out.println("# of registered veihicle owners: "+vehicleOwners.size());
		for(int i=0;i<vehicleOwners.size();i++) {
			vehicleOwners.get(i).printInfo();
		}
	}

}
