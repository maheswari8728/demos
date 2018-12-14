package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Proper {
	
	public static void saveProperties(Properties p,String filename)
	{
		try
		{
			OutputStream propsFile=new FileOutputStream(filename);
			p.store(propsFile, "Properties File to Test Application");
			propsFile.close();
		}
		catch(IOException ioe)
		{
			System.out.println("Exception");
		}
	}

	private static Properties loadProperties(String filename)
	{
		Properties tempProp=new Properties();
		try
		{
			InputStream propsFile=new FileInputStream(filename);
			tempProp.load(propsFile);
			propsFile.close();
			
		}
		catch(IOException ioe)
		{
			System.out.println("Exception");
		}
		return tempProp;
	}
	
	private static Properties createDefaultProperties()
	{
		Properties tempProp=new Properties();
		tempProp.setProperty("url", "jdbc:oracle:thin:@10.219.34.3:1521:orcl");
		tempProp.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		tempProp.setProperty("usrname","trg716");
		tempProp.setProperty("password","training716");
		return tempProp;
	}
	public static void printproperties(Properties p,String s)
	{
		p.list(System.out);
	}
	
	public static void main(String[] args) {
		
		final String PROFILE="My Application.properties";
		Properties myProp;
		Properties myNewProp;
		
		myProp=createDefaultProperties();
		printproperties(myProp,"Newly Created (Default) Properties");
		saveProperties(myProp,PROFILE);
		myNewProp=loadProperties(PROFILE);
		printproperties(myNewProp,"Loaded Properties");
		//myNewProp=loadProperties(myProp);
		printproperties(myNewProp,"After Altering properties");
		saveProperties(myNewProp,PROFILE);
		Properties myNewProp1=loadProperties(PROFILE);
		Enumeration enProps=myNewProp1.propertyNames();
		
		String key="";
		String param[];
		param=new String[4];
		int i=0;
		while(enProps.hasMoreElements())
		{
			key=(String) enProps.nextElement();
			System.out.println(key);
			param[i]=(String)myNewProp1.getProperty(key);
			System.out.println(" "+key+"->"+myNewProp1.getProperty(key));
			i++;
		}
		
	}
	
}

