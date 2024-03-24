package com.sathya.jdbc;
import java.sql.*;
import java.util.*;
public class DatabaseClientProduct {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ProductDao productDao=new ProductDao();
		
		//creating table
		/*int res1=productDao.createProductTable(); 
		System.out.println("Table created successfully "+res1);*/
		
		//insert the values
		/*int res1=productDao.saveProduct(new Product(1001,"Refridgerator",30000));
		System.out.println("Inserted successfully "+res1);
		int res2=productDao.saveProduct(new Product(101,"TV",70000));
		System.out.println("Inserted successfully "+res2);
		int res3=productDao.saveProduct(new Product(102,"Speakers",15000));
		System.out.println("Inserted successfully "+res3);*/
		
		//get product details by id
		/*Product prods=productDao.getProductById(1001);
		System.out.println(prods);*/
		
		//get all the product details
		List<Product> pro=productDao.getAllProducts();
		for(Product p:pro)
			System.out.println(p);
		
		//update price
		/*int ucount=productDao.updateByprice(400,50);
		System.out.println(ucount+" records updated successfully");*/
		
		//delete by id
		/*int dcount1=productDao.deleteById(1001);
		System.out.println("Record deleted successfully "+dcount1);*/
		
		//delete by price
		/*int dcount2=productDao.deleteByPrice(30000);
		System.out.println(dcount2+" records deleted successfully");*/		
		//drop the table
		/* res2=productDao.dropTable();
		System.out.println("Table dropped successfully"+res2);*/
		
		
		
		

	}

}
