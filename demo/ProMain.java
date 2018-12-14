package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProMain {
	
	public static void main(String[] args) throws IOException {
		
			
	try(FileOutputStream fo=new FileOutputStream("product");
		ObjectOutputStream oo=new ObjectOutputStream(fo);)
	{
		Pro p=new Pro(1001,5000,"raju");
		oo.writeObject(p);
	
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	
	try(FileInputStream fo=new FileInputStream("product");
			ObjectInputStream oo=new ObjectInputStream(fo);)
		{
			Pro p1=new Pro(1001,5000,"raju");
			Pro p2=(Pro) oo.readObject();
			
			System.out.println(p2);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
