package assignment6;

import java.util.Scanner;

public class PersonMain {
	
	public static void main(String[] args)              
	{
	    Person me = new Person("Divya","Bharathi","f",20);
	    System.out.println("Person Details");
		System.out.println("----------------------");
	   /* System.out.println("FirstName:" + me.getFirstName()); 
	    System.out.println("LastName:" + me.getSecondName());*/
		System.out.println("enter the firstname");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("enter the lastname");
        String s1=sc.nextLine();
        try{
            
        if(s.isEmpty()||s1.isEmpty())
        {
            throw new MyException("name is empty");
        }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
     
		
	 System.out.println("Gender:" + me.getGender());
	 System.out.println("Age:" + me.getAge());
	}
	
	

}
