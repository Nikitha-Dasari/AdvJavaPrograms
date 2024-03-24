package com.sathya.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class MysqlConn5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/ratan","root","root");
		System.out.println("Connection created with Mysql database");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from emp");
		CachedRowSet rowSet=RowSetProvider.newFactory().createCachedRowSet();
		rowSet.populate(resultSet);
		/*rowSet.afterLast();
		while(rowSet.previous())
		{
			System.out.println(rowSet.getInt(1)+" "+rowSet.getString(2)+" "+rowSet.getFloat(3));
		}*/
		connection.close();
		while(rowSet.next())
		{
			System.out.println(rowSet.getInt(1)+" "+rowSet.getString(2)+" "+rowSet.getFloat(3));
		}
	

	}

}
