package demo;

public interface Vehicle2 extends Vehicle3 {

	void brk();
	
	default void paint()
	{
		System.out.println("this method is veh2paint");
	
	}

}
