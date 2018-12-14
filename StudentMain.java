import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList <Student>();
		al.add(new Student("ravi", 1001, 24));
		al.add(new Student("raju", 1002, 22));
		al.add(new Student("purna", 1003, 21));
		al.add(new Student("mahesh", 1004, 20));
		
		System.out.println("before sorting");
		for(Student p:al)
		{
			System.out.println(p.age);
		}
		Collections.sort(al);
		
		System.out.println("After sorting");
		
		for(Student p:al)
		{
					System.out.println(p.age);
			
		}
		
	}

}
