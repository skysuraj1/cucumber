package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabasePage {
	String columnValue =null ;
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;
//	List<String,String> dataList = new ArrayList<String>();
	public String getData(String columnName) throws SQLException {
		try {
		//setting properties for mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl = "jdbc:mysq://localhost:3306/june2021";
			String sqlUsername = "root";
			String sqlPassword = "root";
			String query = "Select *from users";
			
			//create local connection to the  local database
			//connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
			//empowering the connection refrence variable to execute queries
			statement = connection.createStatement();
			
			//deliver the query
			rs = statement.executeQuery(query);
			
			while(rs.next()) {
			columnValue =rs.getString(columnName);
			return	columnName;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!= null) {
				rs.close();
			}
			if(connection != null) {
				connection.close();
			}
		}
		
		
		return columnValue;
	}
	
}
