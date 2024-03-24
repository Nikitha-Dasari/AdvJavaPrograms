package com.sathya.mysql;
import java.sql.*;
public class MysqlConn4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/ratan","root","root");
		System.out.println("Connection created with Mysql database");
		DatabaseMetaData metaData=connection.getMetaData();
		System.out.println(metaData.getDatabaseProductName());
		System.out.println(metaData.getDatabaseProductVersion());
		System.out.println(metaData.getDriverName());
		System.out.println(metaData.getURL());
		connection.close();

	}

}
