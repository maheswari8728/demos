package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg716","training716");
	    Statement st=con.createStatement();
	    st.executeUpdate("insert into emp values('pavan',1003,26000)");
	    ResultSet rs=st.executeQuery("select * from emp");
	    while(rs.next())
	    {
	    	System.out.println(rs.getString(1));
	    	System.out.println(rs.getInt(2));
	    	System.out.println(rs.getInt(3));
	    	
	    }
	
	   }
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
	}
  }
}
