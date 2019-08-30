package tasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class TableInJson {
	 @Test
	 public static void table() throws FileNotFoundException, IOException, ParseException {
		 
		  JSONParser parser = new JSONParser();
		 
		  try {
		 
		   Object obj = parser.parse(new FileReader("E:TableStructure.json"));
		 
		   JSONObject jsonObject = (JSONObject) obj;
		 
		   String tablename = (String) jsonObject.get("tablename");
		   System.out.println("tablename: "+tablename);
		 
		   String order_id = (String) jsonObject.get("order_id");
		   System.out.println("order_id: "+order_id);
		 
		   String cpo = (String) jsonObject.get("cpo");
		   System.out.println("cpo: "+cpo);
		 
		   String dept = (String) jsonObject.get("dept");
		   System.out.println("dept: "+dept);
		 
		   String connectionUrl =
	                "jdbc:sqlserver://psrwin.infogloballink.com:1433;"
	                        + "database=Shalini;"
	                        + "user=psrsqlu1;"
	                        + "password=igt@1;"
	                        + "loginTimeout=30;";

	        try (Connection connection = DriverManager.getConnection(connectionUrl);
	        		 Statement statement = connection.createStatement();) {
	            
	        	
	        	  String selectSql = "CREATE TABLE "+tablename+"("+order_id+" INT NOT NULL,"+cpo+" VARCHAR(50) NOT NULL,"+dept+" VARCHAR(50));	";
	        	                     
	        	  statement.executeUpdate(selectSql);
	        	  System.out.println("success");
	              /*while (resultSet.next()) {
	                  System.out.println(resultSet.getString(1));*/
	              }
	        }
	        // Handle any errors that may have occurred.
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	
		
		 
		 }
}
