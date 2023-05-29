package vehicleowner;

import java.io.Serializable;
import java.util.Scanner;

import exception.DepartmentFormatException;

public abstract class VehicleOwner implements VehicleOwnerInput,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7518902162516801710L;
	
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
	public void setDepartment(String department) throws DepartmentFormatException{
		if(!department.contains("-") && !department.equals("")) {
			throw new DepartmentFormatException();
		}
		
		this.department = department;
	}
	public abstract void printInfo();
	
	public void setVehicleNumber(Scanner input) {
		System.out.print("Vehicle Owner Number: ");
        int number = input.nextInt();
        this.setNumber(number);
	}
	
	public void setVehicleOwnerName(Scanner input) {
		 System.out.print("Vehicle Owner Name: ");
         String name = input.next();
         this.setName(name);
	}
	
	public void setVehicletype(Scanner input) {
		System.out.print("A type of car: ");
        String type = input.next();
        this.setType(type);
	}
	
	public void setVehicleOwnerDepartment(Scanner input) {
		String department = "";
		while(!department.contains("-")) {
			System.out.print("Vehicle Owner's Applicable Department: ");
			department = input.next();
	        try{
	        	 this.setDepartment(department);
	         }
	         catch(DepartmentFormatException e) {
	        	 System.out.println("Incorrect Departmaent Format, put the departmnent that contains -");
	         }
		}
	}
	public String getKindString() {
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
		return skind;
	}
}
