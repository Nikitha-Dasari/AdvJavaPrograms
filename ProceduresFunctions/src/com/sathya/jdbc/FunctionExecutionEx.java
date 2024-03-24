package com.sathya.jdbc;
import java.sql.*;
public class FunctionExecutionEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nikki","welcome");
		CallableStatement callableStatement= connection.prepareCall("{?=call getAvg(?,?)}");
		callableStatement.setInt(2,1001);
		callableStatement.setInt(3,1002);
		callableStatement.registerOutParameter(1,Types.DOUBLE);
		callableStatement.executeUpdate();
		System.out.println(callableStatement.getDouble(1));
		connection.close();

	}

}
