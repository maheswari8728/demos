package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import util.DBConnection;

public class Newjdbc {
	
	public static void main(String[] args) {
		
		try 
		{
			Connection c=DBConnection.getConnection();
			PreparedStatement pst=c.prepareStatement("insert into emp values(?,?,?)");
			Scanner sc=new Scanner(System.in);
			pst.setString(1, "model");
			pst.setInt(2, 1005);
			pst.setInt(3, 29000);
			pst.executeUpdate();
			ResultSet rs=pst.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(2));
				System.out.println(rs.getInt(3));
			
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
