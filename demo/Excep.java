package demo;

public class Excep {
	int a=10;
	int b=20;
	int c;
	void divide()
	{
		int arr[]=new int[2];
		
		try
		{
			c=a/b;
			System.out.println(c);
			arr[1]=26;
		}
		
		catch(ArithmeticException a)
		{
			System.out.println("divide by zero exception");
		}
		
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Index out of range");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		Excep d=new Excep();
		d.divide();

	}

}
