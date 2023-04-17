package sangha;

public class VeicleOwner {
	String name;
	int number;
	String type;
	String department;
	public VeicleOwner() {
	}
	public VeicleOwner(String name, int number) {
		this.name=name;
		this.number=number;	
	}
	public VeicleOwner(String name, int number, String type, String department) {
		this.name=name;
		this.number=number;
		this.type=type;
		this.department=department;	
	}
	public void printInfo() {
		System.out.println("name: "+name+"number: "+number+"type: "+type+"department: "+department);
	}

}
