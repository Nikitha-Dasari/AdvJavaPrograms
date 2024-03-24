package com.sathya.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class EmployeeDao {
	public int save(Employee emp) 
	{
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		int count=0;
		try
		{
			connection=Dbconnection.createConnection();
			preparedStatement=connection.prepareStatement("insert into emp1 values(?,?,?)");
			preparedStatement.setInt(1,emp.getEmpId());
			preparedStatement.setString(2,emp.getEmpName());
			preparedStatement.setDouble(3,emp.getSalary());
			count=preparedStatement.executeUpdate();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		finally
		{
			try
			{
			if(connection!=null)
				connection.close();
			if(preparedStatement!=null)
				preparedStatement.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return count;
	}
	public Employee findById(int empId) 
	{
		Employee employee=null;
		try(Connection connection=Dbconnection.createConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from emp1 where empId=?"))
		{
			preparedStatement.setInt(1, empId);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				employee=new Employee();
				employee.setEmpId(resultSet.getInt(1));
				employee.setEmpName(resultSet.getString(2));
				employee.setSalary(resultSet.getDouble(3));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return employee;
		
	}
	public int deleteById(int empId)
	{
		int count=0;
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from emp1 where empId=?"))
			{
				preparedStatement.setInt(1, empId);
				count=preparedStatement.executeUpdate();
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}
	public int deleteBySalary(double salary)
	{
		int dcount=0;
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from emp1 where salary>?"))
			{
				preparedStatement.setDouble(1,salary);
				dcount=preparedStatement.executeUpdate();
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return dcount;
	}
	public List<Employee> findAll()
	{
		List<Employee> emps=new ArrayList<Employee>();
		try(Connection connection=Dbconnection.createConnection();
				Statement statement=connection.createStatement())
			{
				ResultSet resultSet=statement.executeQuery("select * from emp1");
				while(resultSet.next())
				{
					Employee employee=new Employee();
					employee.setEmpId(resultSet.getInt(1));
					employee.setEmpName(resultSet.getString(2));
					employee.setSalary(resultSet.getDouble(3));
					emps.add(employee);
				}
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return emps;
	}
	
	public int updateSalary(double currSalary,double incSalary)
	{
		int ucount=0;
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("update emp1 set salary=salary+? where salary>?"))
			{
			preparedStatement.setDouble(1,incSalary);
			preparedStatement.setDouble(2,currSalary);
			ucount=preparedStatement.executeUpdate();
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return ucount;
	}
	

}
