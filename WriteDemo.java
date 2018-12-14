import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
	public static void main(String[] args) throws IOException {
		int i=0;
		FileOutputStream s=new FileOutputStream("C:\\Users\\tmaheswa\\Desktop\\eclipse\\demo\\suma.txt");
		String s1="raju is watching movie";
		byte[] d=s1.getBytes();
		s.write(d);
		s.close();
		FileInputStream s2=new FileInputStream("C:\\Users\\tmaheswa\\Desktop\\eclipse\\demo\\suma.txt");
	    s2.read();
	    
	    while((i=s2.read())!=-1)
	    {
	    	System.out.print((char)i);
	    }
		
	    try(FileReader inputStream=new FileReader("C:\\Users\\tmaheswa\\Desktop\\eclipse\\demo\\suma.txt");
	    		FileWriter outputStream=new FileWriter("C:\\Users\\tmaheswa\\Desktop\\eclipse\\demo\\suma.txt");)
        {
	      int c;
	      while((c=inputStream.read())!=-1)
	      {
	    	  outputStream.write(c);
	      }
        }
	catch(Exception e)
	    {
		System.out.println(e.getMessage());
	    }
	

	FileOutputStream fs=new FileOutputStream("C:\\Users\\tmaheswa\\Desktop\\eclipse\\demo\\suma.txt");
	String p1="Durga puja";
	byte[] q1=p1.getBytes();
	s.write(d);
	DataOutputStream ds=new DataOutputStream(fs);
	
	           ds.writeInt(48);
	           ds.write(24);
	           ds.writeDouble(45);
	           ds.writeLong(33);
	           ds.write(Integer.MAX_VALUE);
	           ds.write(Integer.MIN_VALUE);
	           DataInputStream ds1=new DataInputStream("C:\\Users\\tmaheswa\\Desktop\\eclipse\\demo\\suma.txt");
}
	
}
