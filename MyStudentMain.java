import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyStudentMain {
	public static void main(String[] args) {
		
		ArrayList<MyStudent> al=new ArrayList<MyStudent>();
		al.add(new MyStudent("ravi", 1001, 24));
		al.add(new MyStudent("raju", 1002, 22));
		al.add(new MyStudent("purna", 1003, 21));
		al.add(new MyStudent("mahesh", 1004, 20));
		
		//System.out.println("before sorting");
		/*for(Student p:al)
		{
			System.out.println(p.age);
		}
		Collections.sort(al);
		
		System.out.println("After sorting");
		
		for(Student p:al)
		{
					System.out.println(p.age);
			
		}*/
		Collections.sort(al,new NameComparator());
		
		Iterator iterator=al.iterator();
		
		while(iterator.hasNext())
		{
			MyStudent stu=(MyStudent) iterator.next();
			System.out.println(stu.sname);
		}
		
	}

}
