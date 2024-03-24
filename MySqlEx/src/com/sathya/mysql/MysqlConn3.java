package com.sathya.mysql;
import java.sql.*;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
public class MysqlConn3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/ratan","root","root");
		System.out.println("Connection created with Mysql database");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from emp");
		ResultSetMetaData metadata= (ResultSetMetaData)resultSet.getMetaData();
		System.out.println(metadata.getColumnCount());
		System.out.println(metadata.getColumnName(2));
		System.out.println(metadata.getColumnTypeName(2));
		System.out.println(metadata.getColumnDisplaySize(3));
		connection.close();
	}

}
