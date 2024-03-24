package com.sathya.jdbc;
import java.sql.*;
public class ProcedureFunctions2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nikki","welcome");
		CallableStatement callableStatement= connection.prepareCall("{call getDetails(?,?,?,?)}");
		callableStatement.setInt(1,1001);
		callableStatement.registerOutParameter(2,Types.INTEGER);
		callableStatement.registerOutParameter(3,Types.VARCHAR);
		callableStatement.registerOutParameter(4,Types.FLOAT);
		callableStatement.executeUpdate();
		System.out.println(callableStatement.getInt(2));
		System.out.println(callableStatement.getString(3));
		System.out.println(callableStatement.getFloat(4));
		connection.close();
		

	}

}
