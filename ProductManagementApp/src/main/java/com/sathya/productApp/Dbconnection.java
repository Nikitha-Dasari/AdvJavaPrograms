package com.sathya.productApp;
import java.sql.*;

public class Dbconnection {

	public static Connection createConnection() {
		// TODO Auto-generated method stub
		Connection connection=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nikki","welcome");
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
		return connection;

	}

}
