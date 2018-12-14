package assignment6;

import java.util.Scanner;

import assignment5.Employee;

public class EmployeeMain {
	String scheme=" ";

	public static void main(String[] args) {
		EmployeeService1 s=new EmployeeService1();
		Employee e=new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee name");
	String name=sc.nextLine();
	System.out.println("Enter id of Employee");
	int id=sc.nextInt();
	System.out.println("Enter Salary of Employee");
	double salary=sc.nextDouble();
	 try{
         
	        if(salary<3000)
	        {
	            throw new EmployeeException();
	        }
	    }
	        catch(EmployeeException e1)
	        {
	            System.out.println(e1);
	        }
	System.out.println("Enter Designation");
	String designation=sc.next();
	s.setSalary(salary);
	
	s.setDesignation(designation);
	System.out.println(s.getDesignation());
	e.setName(name);
	e.setId(id);
	System.out.println(e.getName());
	System.out.println(e+" "+s);
	System.out.println(s.setsInsurance(salary));
	
	
	
	
	}

}
