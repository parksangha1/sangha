package vehicleowner;

import java.util.Scanner;

public abstract class VehicleOwner {
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
	public abstract void printInfo();
}
