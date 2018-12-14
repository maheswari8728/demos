package assignment5;

import java.util.Scanner;

public class EmployeeServiceImp1 {
	public Employee getempDetails() {
		String designation;
		String insuranceScheme = null;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int id = in.nextInt();
		System.out.println("Enter employee salary");
		double salary = in.nextDouble();
		System.out.println("Enter employee name");
		String name = in.next();
		in.close();
		if(salary<5000){
			designation = "Clerk";
		}
		else if(salary>5000&&salary<20000){
			designation = "System Associate";
		}
		else if(salary>=20000&&salary<40000){
			designation = "Programmer";
		}
		else{
			designation = "Manager";
		}
		
		Employee emp = new Employee(id,salary,name,designation,insuranceScheme);
		return emp;
		
	}

	public String insuranceScheme(String designation, double salary) {
		String scheme;
		if(designation == "Clerk")
			scheme = "No Scheme";
		else if(designation == "System Associate")
			scheme = "Scheme C";
		else if(designation == "Programmer")
			scheme = "Scheme B";
		else
			scheme = "Scheme A";
		return scheme;
	}

	public void empDetails(Employee emp) {
		 System.out.println("Employee Details");
		    System.out.println("_________________");
				System.out.println("Employee id : "+emp.empId);
				System.out.println("Employee name : "+emp.name);
				System.out.println("Employee designation : "+emp.designation);
				System.out.println("Employee salary : "+emp.salary);
				System.out.println("Employee insurancescheme : "+emp.insuranceScheme);
		
	}
	

}
