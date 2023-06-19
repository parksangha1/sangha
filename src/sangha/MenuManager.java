package sangha;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		VehicleOwnerManager vehicleownerManager = getObject("VehicleOwnermanager.ser");
		
		if(vehicleownerManager == null) {
			vehicleownerManager = new VehicleOwnerManager(input);
		}else {
			
		}
		WindowFrame frame = new WindowFrame(vehicleownerManager);

		selectMenu(input, vehicleownerManager);
		putObject(vehicleownerManager,"VehicleOwnermanager.ser");
	}
	
	public static void selectMenu(Scanner input, VehicleOwnerManager vehicleOwnerManager) {
		int num=0;
		while(num!=6) {
			try {
				showMenu();
				num=input.nextInt();
				switch (num) {
				case 1:
					vehicleOwnerManager.addVehicleOwner();
					logger.log("add a vehicle owner");
					break;
				case 2:
					vehicleOwnerManager.deleteVehicleOwner();
					logger.log("delete a vehicle owner");
					break;
				case 3:
					vehicleOwnerManager.editVehicleOwner();
					logger.log("edit a vehicle owner");
					break;
				case 4:
					vehicleOwnerManager.viewVehicleOwners();
					logger.log("view a list of vehicle owner");
					break;
				case 5:
					
				case 6:
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
				//System.exit(-1);
			}
		}
	}
	
	
	public static void showMenu() {
		System.out.println("*** Student Management System Menu ***");
		System.out.println("1. Add Vehicle Owner");
		System.out.println("2. Delete Vehicle Owner");
		System.out.println("3. Edit Vehicle Owner");
		System.out.println("4. View Vehicle Owners");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6: ");
	}
	
	public static VehicleOwnerManager getObject(String filename) {
		VehicleOwnerManager vehicleOwnerManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			vehicleOwnerManager = (VehicleOwnerManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch(FileNotFoundException e) {
			return vehicleOwnerManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehicleOwnerManager;
	}
	
	public static void putObject(VehicleOwnerManager vehicleOwnerManager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(vehicleOwnerManager);
			
			out.close();
			file.close();
			
		} catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}