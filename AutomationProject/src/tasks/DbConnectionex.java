package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DbConnectionex {
	    @Test
		public void testdb() throws ClassNotFoundException, SQLException{	
		// Connect to your database.
	    // Replace server name, username, and password with your credentials
	
	        String connectionUrl =
	                "jdbc:sqlserver://psrwin.infogloballink.com:1433;"
	                        + "database=Shalini;"
	                        + "user=psrsqlu1;"
	                        + "password=igt@1;"
	                        + "loginTimeout=30;";

	        ResultSet resultSet = null;
	        
	        try (Connection connection = DriverManager.getConnection(connectionUrl);
	        		 Statement statement = connection.createStatement();) {
	            
	        	System.out.println("success");
	        	  String selectSql ="SELECT TOP 5 * from Employee";
	              resultSet = statement.executeQuery(selectSql);
	              
	              while (resultSet.next()) {
	                  System.out.println( resultSet.getString(1)+ " " + resultSet.getString(2)+" " +resultSet.getString(3)+" " +resultSet.getString(4) );
	                  
	                 //
	              }
	        }
	        // Handle any errors that may have occurred.
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	}	
}

