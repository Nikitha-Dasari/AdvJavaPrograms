package com.sathya.mysql;

import java.sql.*;

public class MysqlConn2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/ratan","root","root");
		System.out.println("Connection created with Mysql database");
		//Statement statement=connection.createStatement();
		Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet set=statement.executeQuery("select * from emp");
		set.afterLast();
		/*while(set.next())
		{
			System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getFloat(3));
		}*/
		while(set.previous())
		{
			System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getFloat(3));
		}
		set.first();
		System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getFloat(3));
		set.last();
		System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getFloat(3));
		set.absolute(2);
		System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getFloat(3));
		connection.close();
		System.out.println("Connection released");

	}

}
