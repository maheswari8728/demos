
public class Student implements Comparable<Student> {

	String sname;
	int sid;
	int age;
	
	
	public Student(String sname, int sid, int age) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.age = age;
	}


	@Override
	public int compareTo(Student o) {
		if(age==o.age)
		{
			return 0;
		}
		else if(age>o.age)
		{
			return 1;
		
		}
		else
		// TODO Auto-generated method stub
		return -1;
	}
	
	
}
