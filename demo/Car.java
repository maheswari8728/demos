package demo;
public class Car {
	
	public void move()
	{
		System.out.println("This is the cars move");
	}
	public final int capacity()
	{
		System.out.println("this is the cars capacity");
		return 2;
	}
    public String fuel()
    {
    	String str="petrol";
		return str;
    	
    }
    public Object task() 
    {
    	Object ob=new Object();
    	return ob;
    	//return new Object(); //another way to return object
    }
    
}
