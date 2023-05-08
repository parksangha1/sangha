package vehicleowner;

import java.util.Scanner;

public class VehicleOwner {
	protected VehicleOwnerKind kind = VehicleOwnerKind.HeadOffice;
	protected String name;
	protected int number;
	protected String type;
	protected String department;
	
	public VehicleOwner() {
	}
	public VehicleOwner(VehicleOwnerKind kind) {
		this.kind=kind;
	}
	public VehicleOwner(String name, int number) {
		this.name=name;
		this.number=number;	
	}
	
	public VehicleOwner(String name, int number, String type, String department) {
		this.name=name;
		this.number=number;
		this.type=type;
		this.department=department;	
	}
	
	public VehicleOwner(VehicleOwnerKind kind, String name, int number, String type, String department) {
		this.kind=kind;
		this.name=name;
		this.number=number;
		this.type=type;
		this.department=department;	
	}
	
	public VehicleOwnerKind getKind() {
		return kind;
	}
	public void setKind(VehicleOwnerKind kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
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
		
		System.out.print("Owner's Applicable Department : ");
		String department = input.next();
		this.setDepartment(department);
	}
}
