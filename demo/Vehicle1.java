package demo;

public interface Vehicle1 {
	

	void speed();
	void fuel();
	void brk();
	
	default void paint()
	{
		System.out.println("this method is paint");
	}
	static void goal()
	{
		System.out.println("this method is goal");
	}
	
}
