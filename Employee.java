package assignment5;

public class Employee {
	
	public int empId;
	public double salary;
	public	String name=new String();
	public String designation=new String();
	public String insuranceScheme=new String();
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, double salary, String name, String designation, String insuranceScheme) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	
	

}
