package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
  
	public static String get(String columnName) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring2020", "kanthiv", "test123");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from usersession12");
		
	    while(rs.next()) {
			 return rs.getString(columnName);
		}
	    return null;
		
		
	}
}
