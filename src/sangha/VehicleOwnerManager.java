package sangha;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleOwnerManager {
	ArrayList<VehicleOwner> vehicleOwners = new ArrayList<VehicleOwner>();
	Scanner input;
	VehicleOwnerManager(Scanner input){
		this.input=input;
	}
	public void addVehicleOwner() {
		vehicleOwner = new VehicleOwner();
		System.out.print("Vehicle Owner Name : ");
		vehicleOwner.name = input.next();
		System.out.print("Vehicle's Number : ");
		vehicleOwner.number = input.nextInt();
		System.out.print("A type of car : ");
		vehicleOwner.type = input.next();
		System.out.print("Owner's Applicable Department : ");
		vehicleOwner.department = input.next();
		vehicleOwners.add(vehicleOwner);
	}
	public void deleteVehicleOwner() {
		System.out.print("Vehicle Owner Number: ");
	      int VehicleOwnerNumber =input.nextInt();
	      int index = -1;
	      for(int i=0; i<vehicleOwners.size(); i++) {
	         if(vehicleOwners.get(i).number==VehicleOwnerNumber) {
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
	         VehicleOwner vehicleOwner = vehicleOwners.get(i);
	         if(vehicleOwner.number == VehicleOwnerNumber) {
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
	                  vehicleOwner.number=input.nextInt();
	               }
	               else if(num==2) {
	                  System.out.print("Vehicle Owner Name: ");
	                  vehicleOwner.name=input.next();
	               }
	               else if(num==3) {
	                  System.out.print("A type of car: ");
	                  vehicleOwner.type=input.next();
	               }
	               else if(num==4) {
	                  System.out.print("Veiw Owner's Applicable Department: ");
	                  vehicleOwner.department=input.next();
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
		for(int i=0;i<vehicleOwners.size();i++) {
			vehicleOwners.get(i).printInfo();
		}
	}

}
