package sangha;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num=0;
		Scanner input = new Scanner(System.in);
		
		while(num!=6) {
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. Add Vehicle Owner");
			System.out.println("2. Delete Vehicle Owner");
			System.out.println("3. Edit Vehicle Owner");
			System.out.println("4. View Vehicle Owner");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6: ");
			num=input.nextInt();
			switch (num) {
			case 1:
				addVO();
				break;
			case 2:
				deleteVO();
				break;
			case 3:
				editVO();
				break;
			case 4:
				viewVO();
				break;
			case 5:
				
			case 6:
			}
		}
		
	}
	public static void addVO() {
		Scanner input = new Scanner(System.in);
		System.out.print("Vehicle Owner Name : ");
		String VehicleOwnerName = input.next();
		System.out.println(VehicleOwnerName);
		System.out.print("Vehicle's Number : ");
		int VehicleNumber = input.nextInt();
		System.out.println(VehicleNumber);
		System.out.print("A type of car : ");
		String Typeofcar = input.next();
		System.out.println(Typeofcar);
		System.out.print("Owner's Applicable Department : ");
		String Department = input.next();
		System.out.println(Department);
	}
	public static void deleteVO() {
		Scanner input = new Scanner(System.in);
		System.out.print("Vehicle Owner Name : ");
		String VehicleOwnerName = input.next();
		System.out.println("Delete Vehicle Owner Name");
	}
	public static void editVO() {
		Scanner input = new Scanner(System.in);
		System.out.print("Vehicle Owner Name : ");
		String VehicleOwnerName = input.next();
		System.out.println("Edit Vehicle Owner Name");
	}
	public static void viewVO() {
		Scanner input = new Scanner(System.in);
		System.out.print("Vehicle Owner Name : ");
		String VehicleOwnerName = input.next();
		System.out.println("View Vehicle Owner Name");
	}
}