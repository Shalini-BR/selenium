package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DbConnectionex {
	public static void main (String[] args )
	{
		String connectionURL = "jdbc:sqlserver://localhost:1433;" + "databaseName=Play;integratedsecurity=true;";
		
		Connection con=null;
		Statement smt =null;
		ResultSet rs = null;
		
		try
		{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con=DriverManager.getConnection(connectionURL);
		System.out.println("connection eatablished");
		
		String sql = " select * from jdbc_test";
		smt = con.createStatement();
		rs=smt.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}
		
	}
		catch(Exception e){
			System.out.println("error "+e.getMessage());
		}
	}
	
}
