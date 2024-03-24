package com.sathya.mysql;

import java.sql.*;


public class MysqlConn1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/ratan","root","root");
		System.out.println("Connection created with Mysql database");
		PreparedStatement preparedStatement=connection.prepareStatement("insert into emp values(?,?,?)");
		preparedStatement.setInt(1,111);
		preparedStatement.setString(2,"Ratan");
		preparedStatement.setFloat(3,10000.4f);
		preparedStatement.addBatch();
		preparedStatement.setInt(1,222);
		preparedStatement.setString(2,"Ramya");
		preparedStatement.setFloat(3,20000.4f);
		preparedStatement.addBatch();
		preparedStatement.setInt(1,333);
		preparedStatement.setString(2,"Anu");
		preparedStatement.setFloat(3,30000.4f);
		preparedStatement.addBatch();
		preparedStatement.executeBatch();
		connection.close();
		System.out.println("Connection released");

	}

}
