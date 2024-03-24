package com.sathya.jdbc;
import java.sql.*;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
public class ProductDao {
	
	//create the table
	public int createProductTable() {
		int count=0;
		try(Connection connection=Dbconnection.createConnection();
				Statement statement=connection.createStatement())
		{
			String q1="create table prod(proId number,proName varchar2(30),proPrice number)";
			count=statement.executeUpdate(q1);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}
	
	//insert the values 
	public int saveProduct(Product prods)
	{
		int count=0;
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("insert into prod values(?,?,?)"))
			{
				preparedStatement.setInt(1,prods.getProId());
				preparedStatement.setString(2,prods.getProName());
				preparedStatement.setDouble(3,prods.getProPrice());
				count=preparedStatement.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		return count;
	}
	
	//get details of product by id
	public Product getProductById(int id)
	{
		Product prods=null;
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("select * from prod where proId=?"))
			{
				preparedStatement.setInt(1,id);
				ResultSet  resultSet=preparedStatement.executeQuery();
				if(resultSet.next())
				{
					prods=new Product();
					prods.setProId(resultSet.getInt(1));
					prods.setProName(resultSet.getString(2));
					prods.setProPrice(resultSet.getDouble(3));
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		return prods;
	}
	
	//get all the product details
	public List<Product> getAllProducts()
	{
		List<Product> pro=new ArrayList<Product>();
		try(Connection connection=Dbconnection.createConnection();
				Statement statement=connection.createStatement())
			{
				ResultSet resultSet=statement.executeQuery("select * from prod");
				while(resultSet.next())
				{
					Product prods=new Product();
					prods.setProId(resultSet.getInt(1));
					prods.setProName(resultSet.getString(2));
					prods.setProPrice(resultSet.getDouble(3));
					pro.add(prods);
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		return pro;
	}
	
	//update by price
	public int updateByprice(double priceRange,double incrementValue)
	{
		int count=0;
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("update prod set proPrice=proPrice+? where proPrice>?"))
			{
				preparedStatement.setDouble(1,incrementValue);
				preparedStatement.setDouble(2,priceRange);
				count=preparedStatement.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		return count;
	}
	
	//delete by id
	public int deleteById(int id)
	{
		int count=0;
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from prod where proId=?"))
			{
				preparedStatement.setInt(1,id);
				count=preparedStatement.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		return count;
	}
	
	//delete by price
	public int deleteByPrice(double price)
	{
		int count=0;
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from prod where proPrice<?"))
			{
				preparedStatement.setDouble(1,price);
				count=preparedStatement.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		return count;
	}
	
	//drop the table
	public int dropTable()
	{
		int count=0;
		try(Connection connection=Dbconnection.createConnection();
				Statement statement=connection.createStatement())
		{
			String q1="drop table prod";
			count=statement.executeUpdate(q1);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}
}
