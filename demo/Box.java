package demo;
import static java.lang.Math.*;

public class Box {
	double width;
	double height;
	double length;
    int count;
	
	
	
	public Box() {
		this(2);
		System.out.println("default invoked constructor");
		count++;
		// TODO Auto-generated constructor stub
	}



	public Box(double length) {
		this(20,49,54);
		System.out.println(length);
		System.out.println("1 parameter constructor");
		count++;
	}



	public Box(double width, double height, double length) {
		super();
		this.width = width;
		this.height = height;
		this.length = length;
		System.out.println("3 parameter constructor");
		count++;
	}



	static double vol()
	{
		String p1=new String();
		Object obj=new Object();
        obj=p1;
		System.out.println(sqrt(4));
		//System.out.println(count);
		return 0;
		
		
		
	}
}
