package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DataBaseConnection {
	 
		@Test
		public void testdb() throws ClassNotFoundException, SQLException{	
			// Connect to your database.
		    // Replace server name, username, and password with your credentials
		
		        String connectionUrl =
		                "jdbc:sqlserver://psrwin.infogloballink.com:1433;"
		                        + "database=PTL_DEV;"
		                        + "user=psrsqlu1;"
		                        + "password=igt@1;"
		                        + "loginTimeout=30;";
 
		        ResultSet resultSet = null;
		        
		        try (Connection connection = DriverManager.getConnection(connectionUrl);
		        		 Statement statement = connection.createStatement();) {
		            // Code here.
		        	System.out.println("success");
		        	  String selectSql = "SELECT TOP 5 * from BR_USER_PROFILE	";
		              resultSet = statement.executeQuery(selectSql);
		              
		              while (resultSet.next()) {
		                  System.out.println(resultSet.getString(2) );
		              }
		        }
		        // Handle any errors that may have occurred.
		        catch (SQLException e) {
		            e.printStackTrace();
		        }
		}	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public static void main (String[] args )
	{
		String connectionURL = "jdbc:sqlserver://localhost:1433;" + "databaseName=Play;integratedsecurity=true;";
		
		Connection con=null;
		Statement smt =null;
		ResultSet rs = null;
		
		try
		{
		Class.forName("com.microsoft.sqlserver.jdbc.sqlServerDriver");
		con=DriverManager.getConnection(connectionURL);
		System.out.println("connection eatablished");
		
	}
		catch(Exception e){
			System.out.println("error "+e.getMessage());
		}
	}*/

