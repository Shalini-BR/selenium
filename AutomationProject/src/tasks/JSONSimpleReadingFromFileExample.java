package tasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONSimpleReadingFromFileExample {
	public static void main(String[] args) {
		 
		  JSONParser parser = new JSONParser();
		 
		  try {
		 
		   Object obj = parser.parse(new FileReader("E:Test.json"));
		 
		   JSONObject jsonObject = (JSONObject) obj;
		 
		   String servername = (String) jsonObject.get("servername");
		   System.out.println("servername: "+servername);
		 
		   String port = (String) jsonObject.get("port");
		   System.out.println("servername: "+servername);
		 
		   String databasename = (String) jsonObject.get("databasename");
		   System.out.println("databasename: "+databasename);
		 
		   String loginTimeout = (String) jsonObject.get("loginTimeout");
		   System.out.println("loginTimeout: "+loginTimeout);
		 
		   String username = (String) jsonObject.get("username");
		   System.out.println("username: "+username);
		 
		   String password = (String) jsonObject.get("password");
		   System.out.println("password: "+password);
		 
		   String connectionUrl =
	                "jdbc:sqlserver://"+servername+":"+port+";"
	                        + "database="+databasename+";"
	                        + "user="+username+";"
	                        + "password="+password+";"
	                        + "loginTimeout="+loginTimeout+";";

	        ResultSet resultSet = null;
	        
	        try (Connection connection = DriverManager.getConnection(connectionUrl);
	        		 Statement statement = connection.createStatement();) {
	            
	        	System.out.println("success");
	        	  String selectSql = "SELECT TOP 5 * from Employee	";
	              resultSet = statement.executeQuery(selectSql);
	              
	              while (resultSet.next()) {
	                  System.out.println(resultSet.getString(1));
	              }
	        }
	        // Handle any errors that may have occurred.
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	
		 
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  } catch (ParseException e) {
		   e.printStackTrace();
		  }
		 
		 }
}
