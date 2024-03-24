package com.sathya.jdbc;
import java.sql.*;
public class BatchProcessingEx {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nikki","welcome");
		Statement statement=connection.createStatement();
		statement.addBatch("create table stu(id number,name varchar(20))");
		statement.addBatch("insert into stu values(101,'Ratan')");
		statement.addBatch("insert into stu values(103,'Sathya')");
		statement.addBatch("delete from stu where id in(101,103)");
		statement.addBatch("drop table stu");
		int[] results=statement.executeBatch();
		for(int result:results)
			System.out.println(result);
		connection.close();
	}

}
