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
				System.out.print("Vehicle Owner Name : ");
				String VehicleOwnerName = input.next();
				System.out.print("Vehicle's Number : ");
				int VehicleNumber = input.nextInt();
				System.out.print("A type of car : ");
				String typeofcar = input.next();
				System.out.print("Owner's Applicable Department : ");
				String department = input.next();
				break;
				
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			}
		}
	}
}