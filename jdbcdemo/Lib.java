package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Lib {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner s=new Scanner(System.in);
		try {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg716","training716");
	    Statement st=con.createStatement();
	    PreparedStatement pst=con.prepareStatement("insert into lib values(?,?,?)");
	    
	    System.out.println("enter bookname:");
	    String s1=s.nextLine();
	    pst.setString(1,s1);
	    
	    System.out.println("enter bookid:");
	    int s2=s.nextInt();
	    pst.setInt(2,s2);
	
	    System.out.println("enter bookauthorname:");
	    String s3=s.next();
	    pst.setString(3,s3);
	    pst.executeUpdate();
	    ResultSet rs=st.executeQuery("select * from lib");
	    while(rs.next())
	    {
	    	System.out.println(rs.getString(1));
	    	System.out.println(rs.getInt(2));
	    	System.out.println(rs.getString(3));
	    	
	    }
	
	   }
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
	}
  }
	

}
