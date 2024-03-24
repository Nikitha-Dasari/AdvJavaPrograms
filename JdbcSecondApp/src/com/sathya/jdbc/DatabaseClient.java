package com.sathya.jdbc;
import java.sql.*;
import java.util.List;

public class DatabaseClient {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao=new EmployeeDao();
		/*int res1=employeeDao.save(new Employee(1001,"Nikitha",40000));
		System.out.println("Data inserted successfully.."+res1);
		int res2=employeeDao.save(new Employee(1002,"Sonia",45000));
		System.out.println("Data inserted successfully.."+res2);*/
		//Reading data from database
		Employee emp=employeeDao.findById(1001);
		System.out.println(emp);
		Employee em=employeeDao.findById(1003);
		System.out.println(em);
		//deleting data from id
		/*int count1=employeeDao.deleteById(1001);
		if(count1==1)
			System.out.println("Data deleted successfully");
		else
			System.out.println("Data deletion failed");*/
		//deleting mutliple records using salary
		/*int count2=employeeDao.deleteBySalary(40000);
		System.out.println(count2+" records deleted successfully");*/
		//printing all records of database
		List<Employee> emps=employeeDao.findAll();
		for(Employee e:emps)
			System.out.println(e);
		//Updating salary of given record
		/*int ucount=employeeDao.updateSalary(40000,2000);
		System.out.println(ucount+" records updated successfully");*/
		//
	

	}

}

