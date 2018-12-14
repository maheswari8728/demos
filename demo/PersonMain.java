package demo;

public class PersonMain {
	public static void main(String[] args) {
		
		Person o1=new Person("Divya","Bharathi","F",20);
	    System.out.println("Person");
	    System.out.println("-----------------");
	    System.out.println("FirstName:"+o1.getFirstName());
        System.out.println("LastName:"+o1.getLastName());
        System.out.println("Gender:"+o1.getGender());
        System.out.println("Age:"+o1.getAge());
            
		}

}
