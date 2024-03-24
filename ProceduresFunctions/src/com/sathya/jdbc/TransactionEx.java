package com.sathya.jdbc;
import java.sql.*;
import java.util.*;
public class TransactionEx {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nikki","welcome");
		statement=connection.createStatement();
		connection.setAutoCommit(false);
		statement.executeUpdate("insert into emp1 values(1004,'kohli',35000)");
		statement.executeUpdate("insert into emp1 values(1005,'mahesh',55000)");
		statement.executeUpdate("delete from emp1 where empId=1004");
		connection.commit();
		System.out.println("Transaction Success");
		}
		catch(ClassNotFoundException|SQLException e)
		{
			System.out.println("Transaction fail");
			connection.rollback();
			e.printStackTrace();
		}
		finally
		{
			if(statement!=null)
				statement.close();
			if(connection!=null)
				connection.close();
		}
	}

}
