package sangha;

public class VehicleOwner {
	String name;
	int number;
	String type;
	String department;
	public VehicleOwner() {
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
	public void printInfo() {
		System.out.println("name: "+name+"number: "+number+"type: "+type+"department: "+department);
	}

}
